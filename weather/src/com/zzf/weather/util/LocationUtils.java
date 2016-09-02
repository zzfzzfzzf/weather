package com.zzf.weather.util;

import android.content.Context;
import android.text.TextUtils;

import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.baidu.location.LocationClientOption.LocationMode;

public class LocationUtils {
	private LocationClient mLocationClient = null;
	private CityNameStatus mCityNameStatus;

	public static abstract interface CityNameStatus {
		public abstract void detecting();

		public abstract void update(String city);
	}

	public LocationUtils(Context context, CityNameStatus cityNameStatus) {
		mCityNameStatus = cityNameStatus;
		mLocationClient = new LocationClient(context,
				getLocationClientOption(context));
		mLocationClient.registerLocationListener(mLocationListener);
	}

	// ��ʼ��λ
	public void startLocation() {
		mLocationClient.start();
		mCityNameStatus.detecting();
	}

	// ������λ
	public void stopLocation() {
		mLocationClient.stop();

	}

	public boolean isStarted() {
		return mLocationClient.isStarted();
	}

	private LocationClientOption getLocationClientOption(Context context) {
		LocationClientOption option = new LocationClientOption();
		option.setOpenGps(true);
		option.setLocationMode(LocationMode.Hight_Accuracy);// ���ö�λģʽ
		option.setCoorType("gcj02");// ���صĶ�λ����ǰٶȾ�γ�ȣ�Ĭ��ֵgcj02
		option.setScanSpan(2000);// ���÷���λ����ļ��ʱ��Ϊ2000ms
		option.setProdName(context.getPackageName());
		option.setIsNeedAddress(true);
		return option;
	}

	/**
	 * ʵ�ֶ�λ�ص�����
	 */
	BDLocationListener mLocationListener = new BDLocationListener() {

		@Override
		public void onReceiveLocation(BDLocation location) {
			if (location == null || TextUtils.isEmpty(location.getCity()))
				return;
			if (location.getLocType() != 161)
				return;

			String city = location.getCity().replace("��", "");
			mCityNameStatus.update(city);
			mLocationClient.stop();// ֹͣ��λ
		}

	};
}
