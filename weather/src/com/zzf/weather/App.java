package com.zzf.weather;

import java.util.HashMap;
import java.util.Map;

import com.zzf.weather.util.CrashHandler;
import com.zzf.weather.util.SystemUtils;
import com.zzf.weather.plugin.bean.WeatherInfo;

import android.app.Application;



public class App extends Application {
	public static Map<String, WeatherInfo> mMainMap;

	@Override
	public void onCreate() {
		super.onCreate();
		SystemUtils.copyDB(this);
		CrashHandler.getInstance().init(this);
		mMainMap = new HashMap<String, WeatherInfo>();
	}
}
