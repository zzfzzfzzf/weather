package com.zzf.weather;

import java.util.List;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.Toast;

import com.zzf.weather.beans.City;
import com.zzf.weather.util.LocationUtils;
import com.zzf.weather.util.LocationUtils.CityNameStatus;
import com.zzf.weather.util.NetUtil;
import com.zzf.weather.util.SystemUtils;
import com.zzf.weather.db.CityProvider;
import com.zzf.weather.db.CityProvider.CityConstants;
import com.way.ui.swipeback.SwipeBackActivity;

public class BaseActivity extends SwipeBackActivity {
	public static final String AUTO_LOCATION_CITY_KEY = "auto_location";
	protected ContentResolver mContentResolver;
	protected Activity mActivity;
	protected LocationUtils mLocationUtils;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initDatas();
	}

	private void initDatas() {
		mActivity = this;
		mContentResolver = getContentResolver();
	}

	@Override
	protected void onResume() {
		super.onResume();
	}

	protected List<City> getTmpCities() {
		Cursor tmpCityCursor = mContentResolver.query(
				CityProvider.TMPCITY_CONTENT_URI, null, null, null, null);
		return SystemUtils.getTmpCities(tmpCityCursor);
	}

	protected void startLocation(CityNameStatus cityNameStatus) {
		if (NetUtil.getNetworkState(this) == NetUtil.NETWORN_NONE) {
			Toast.makeText(this, R.string.net_error, Toast.LENGTH_SHORT).show();
			return;
		}
		if (mLocationUtils == null)
			mLocationUtils = new LocationUtils(this, cityNameStatus);
		if (!mLocationUtils.isStarted()) {
			mLocationUtils.startLocation();
		}
	}

	protected void stopLocation() {
		if (mLocationUtils != null && mLocationUtils.isStarted())
			mLocationUtils.stopLocation();
	}

	protected City getLocationCityFromDB(String name) {
		City city = new City();
		city.setName(name);
		Cursor c = mContentResolver.query(CityProvider.CITY_CONTENT_URI,
				new String[] { CityConstants.POST_ID }, CityConstants.NAME
						+ "=?", new String[] { name }, null);
		if (c != null && c.moveToNext())
			city.setPostID(c.getString(c.getColumnIndex(CityConstants.POST_ID)));
		return city;
	}

	protected void addOrUpdateLocationCity(City city) {
		
		mContentResolver.delete(CityProvider.TMPCITY_CONTENT_URI,
				CityConstants.ISLOCATION + "=?", new String[] { "1" });

		ContentValues tmpContentValues = new ContentValues();
		tmpContentValues.put(CityConstants.NAME, city.getName());
		tmpContentValues.put(CityConstants.POST_ID, city.getPostID());
		tmpContentValues.put(CityConstants.REFRESH_TIME, 0L);
		tmpContentValues.put(CityConstants.ISLOCATION, 1);
		mContentResolver.insert(CityProvider.TMPCITY_CONTENT_URI,
				tmpContentValues);

		
		ContentValues hotContentValues = new ContentValues();
		hotContentValues.put(CityConstants.ISSELECTED, 1);
		mContentResolver.update(CityProvider.HOTCITY_CONTENT_URI,
				hotContentValues, CityConstants.POST_ID + "=?",
				new String[] { city.getPostID() });
	}
}
