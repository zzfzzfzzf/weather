package com.zzf.weather.plugin.util;

import java.io.File;
import java.io.IOException;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;

public class ConfigCache {
	
	public static final int CONFIG_CACHE_MOBILE_TIMEOUT = 2 * 60 * 60 * 1000;
	
	public static final int CONFIG_CACHE_WIFI_TIMEOUT = 30 * 60 * 1000;

	public static String getUrlCache(Context context, String url) {
		if (TextUtils.isEmpty(url)) {
			return null;
		}
		int netState = NetUtil.getNetworkState(context);

		File file = new File(getCacheDir(context) + File.separator
				+ replaceUrlWithPlus(url));
		if (file.exists() && file.isFile()) {
			long expiredTime = System.currentTimeMillis() - file.lastModified();
			Log.i("liweiping", url + ": expiredTime=" + expiredTime / 1000);
			// 1. in case the system time is incorrect (the time is turn back
			// long ago)
			// 2. when the network is invalid, you can only read the cache
			if (netState != NetUtil.NETWORN_NONE && expiredTime < 0) {
				return null;
			}
			
			if (netState == NetUtil.NETWORN_WIFI
					&& expiredTime > CONFIG_CACHE_WIFI_TIMEOUT) {
				return null;
				
			} else if (netState == NetUtil.NETWORN_MOBILE
					&& expiredTime > CONFIG_CACHE_MOBILE_TIMEOUT) {
				return null;
			}
			try {
				String result = FileUtils.readTextFile(file);
				return result;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public static void setUrlCache(Context context, String data, String url) {
		if (getCacheDir(context) == null) {
			return;
		}
		try {
			File file = new File(getCacheDir(context) + File.separator
					+ replaceUrlWithPlus(url));
			FileUtils.writeTextFile(file, data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * delete cahce file recursively
	 * 
	 * @param cacheFile
	 *            if null means clear cache function, or clear cache file
	 */
	public static void clearCache(Context context, File cacheFile) {
		if (cacheFile == null) {
			try {
				File cacheDir = getCacheDir(context);
				if (cacheDir.exists()) {
					clearCache(context, cacheDir);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (cacheFile.isFile()) {
			cacheFile.delete();
		} else if (cacheFile.isDirectory()) {
			File[] childFiles = cacheFile.listFiles();
			for (int i = 0; i < childFiles.length; i++) {
				clearCache(context, childFiles[i]);
			}
		}
	}

	public static String replaceUrlWithPlus(String url) {
		
		if (url != null) {
			return url.replaceAll("http://(.)*?/", "")
					.replaceAll("[.:/,%?&=]", "+").replaceAll("[+]+", "+");
		}
		return null;
	}

	public static File getCacheDir(Context context) {
		File cacheDir = context.getCacheDir();
		if (Environment.getExternalStorageState().equals(
				Environment.MEDIA_MOUNTED)) {
			cacheDir = new File(Environment.getExternalStorageDirectory()
					.getAbsolutePath() + File.separator + "WayHoo");
			if (!cacheDir.exists())
				cacheDir.mkdir();
		}
		return cacheDir;
	}
}
