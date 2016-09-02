package com.zzf.weather.fragment;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.LayoutParams;
import android.widget.AbsListView.OnScrollListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshBase.Mode;
import com.handmark.pulltorefresh.library.PullToRefreshBase.OnPullEventListener;
import com.handmark.pulltorefresh.library.PullToRefreshBase.OnRefreshListener;
import com.handmark.pulltorefresh.library.PullToRefreshBase.State;
import com.handmark.pulltorefresh.library.PullToRefreshScrollView;
import com.zzf.weather.adapter.WeatherListAdapter;
import com.zzf.weather.beans.City;
import com.zzf.weather.util.L;
import com.zzf.weather.util.SystemUtils;
import com.zzf.weather.util.TimeUtils;
import com.zzf.weather.util.WeatherIconUtils;
import com.zzf.weather.db.CityProvider;
import com.zzf.weather.db.CityProvider.CityConstants;
import com.zzf.weather.plugin.bean.AQI;
import com.zzf.weather.plugin.bean.Forecast;
import com.zzf.weather.plugin.bean.Index;
import com.zzf.weather.plugin.bean.RealTime;
import com.zzf.weather.plugin.bean.WeatherInfo;
import com.zzf.weather.plugin.spider.WeatherSpider;
import com.zzf.weather.App;
import com.zzf.weather.R;

@SuppressLint({ "NewApi", "ValidFragment" })
public class WeatherFragment extends Fragment implements OnRefreshListener,
		OnPullEventListener {
	public static final String ARG_CITY = "city";
	public static final String ARG_WEATHERINFO = "weatherInfo";
	public static final String REFRESH_TIME_KEY = "refreshTime";
	private GetDataTask mGetDataTask;
	private ListView mListView;
	private PullToRefreshScrollView mPullRefreshScrollView;
	private WeatherListAdapter mWeatherAdapter;
	private ImageView mNormalImageView;
	private ImageView mBlurredImageView;
	private View mListHeaderView;

	private int mLastDampedScroll;
	private int mHeaderHeight = -1;

	// ��ǰ������View
	private ImageView mCurWeatherIV;
	private TextView mCurWeatherTV;
	private TextView mCurHighTempTV;
	private TextView mCurLowTempTV;
	private TextView mCurFeelsTempTV;
	private TextView mCurWeatherCopyTV;

	private ContentResolver mContentResolver;

	private WeatherSpider mWeatherSpider;
	private City mCurCity;

	public WeatherFragment() {
	}

	public WeatherFragment(City city) {
		mCurCity = city;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mContentResolver = getActivity().getContentResolver();
		mWeatherSpider = WeatherSpider.getInstance();
	}

	private View mView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// if(mView != null){
		// if(mView.getParent() != null){
		// ((ViewGroup)mView.getParent()).removeView(mView);
		// }
		// return mView;
		// }
		mView = inflater.inflate(R.layout.weather_fragment, container, false);
		
		return mView;
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		initViews(view);
	}

	/**
	 * ��ʼ�����е�view
	 * 
	 * @param view
	 */
	private void initViews(View view) {
		mListView = (ListView) view.findViewById(R.id.drag_list);
		mNormalImageView = (ImageView) view
				.findViewById(R.id.weather_background);
		mBlurredImageView = (ImageView) view
				.findViewById(R.id.weather_background_blurred);
		mBlurredImageView.setImageAlpha((int) (0 * 255));// ����Ĭ��ģ������Ϊ͸��

		mPullRefreshScrollView = (PullToRefreshScrollView) view
				.findViewById(R.id.pull_refresh_scrollview);
		// �������ˢ���¼�
		mPullRefreshScrollView.setOnRefreshListener(this);
		// �������ˢ��״̬�¼����Ա㼰ʱ��ʵˢ��ʱ��
		mPullRefreshScrollView.setOnPullEventListener(this);
		mListHeaderView = LayoutInflater.from(getActivity()).inflate(
				R.layout.weather_current_condition, null);
		// ��ȡ��Ļ�߶�
		int displayHeight = SystemUtils.getDisplayHeight(getActivity());
		// HeaderView�߶�=��Ļ�߶�-�������߶�-״̬���߶�
		mHeaderHeight = displayHeight
				- getResources().getDimensionPixelSize(
						R.dimen.abs__action_bar_default_height)
				- SystemUtils.getStatusBarHeight(getActivity());
		mListHeaderView.setLayoutParams(new LayoutParams(
				LayoutParams.MATCH_PARENT, mHeaderHeight));
		// ���㱳��View�ĸ߶ȣ��ʵ�����Ļ�߶ȶ�һ�㣬
		// ֮���Զ�1/8��Ϊ�˺��滬��ListViewʱ�����ܸ��滬����
		int backgroundHeight = displayHeight
				- SystemUtils.getStatusBarHeight(getActivity()) + mHeaderHeight
				/ 8;
		mNormalImageView.setLayoutParams(new FrameLayout.LayoutParams(
				FrameLayout.LayoutParams.MATCH_PARENT, backgroundHeight));
		mBlurredImageView.setLayoutParams(new FrameLayout.LayoutParams(
				FrameLayout.LayoutParams.MATCH_PARENT, backgroundHeight));

		mListView.addHeaderView(mListHeaderView, null, false);// ��ListView���HeaderView
		mWeatherAdapter = new WeatherListAdapter(getActivity());
		mListView.setAdapter(mWeatherAdapter);
		mListView.setOnScrollListener(mOnScrollListener);// ��������
		initCurWeatherViews(view);
		mListView.setSelection(0);// Ĭ��ѡ��������һ��view

		// ����������headerview���Ի�������һ��view������Ч�����ã��͸ɴ಻Ҫ��
		// mListHeaderView.setOnClickListener(new OnClickListener() {
		//
		// @Override
		// public void onClick(View v) {
		// Log.i("liweiping", "mListHeaderView onClick......");
		// mListView.setSelection(1);
		// // mListView.scrollListBy(mHeaderHeight);
		// // mListView.setSelectionFromTop(1, mHeaderHeight);
		// // mListView.setSelectionAfterHeaderView();
		// }
		// });
	}

	/**
	 * ��ʼ����ǰ������view����ListView��HeaderView
	 * 
	 * @param view
	 */
	private void initCurWeatherViews(View view) {
		mCurWeatherIV = (ImageView) view.findViewById(R.id.main_icon);
		mCurWeatherTV = (TextView) view.findViewById(R.id.weather_description);
		mCurHighTempTV = (TextView) view.findViewById(R.id.temp_high);
		mCurLowTempTV = (TextView) view.findViewById(R.id.temp_low);
		mCurFeelsTempTV = (TextView) view.findViewById(R.id.temperature);
		mCurWeatherCopyTV = (TextView) view.findViewById(R.id.copyright);

		updateWeatherView(App.mMainMap.get(mCurCity.getPostID()), false);
	}

	@Override
	public void onResume() {
		super.onResume();
		mListView.setSelection(0);// ѡ�е�һ��view����fragment�����պ������´���ʱ�ָ�״̬
	}

	// ListView�������������±���ģ���Ⱥ��ƶ�����
	private OnScrollListener mOnScrollListener = new OnScrollListener() {
		@Override
		public void onScroll(AbsListView view, int firstVisibleItem,
				int visibleItemCount, int totalItemCount) {
			View topChild = view.getChildAt(0);// ��ȡListView�ĵ�һ��View
			if (topChild == null) {
				onNewScroll(0);
			} else if (topChild != mListHeaderView) {
				onNewScroll(mListHeaderView.getHeight());
				
				// "topChild != mHeaderView =" + mHeaderView.getHeight());
			} else {
				onNewScroll(-topChild.getTop());
			}
		}

		@Override
		public void onScrollStateChanged(AbsListView view, int scrollState) {
			// do nothing
		}
	};

	/**
	 * ���±���ģ���Ⱥ��ƶ�����
	 * 
	 * @param scrollPosition
	 */
	private void onNewScroll(int scrollPosition) {
		// �����Ƿ��������ˢ��
		if (scrollPosition == 0) {
			mPullRefreshScrollView.setMode(Mode.PULL_FROM_START);// ��������ˢ��
		} else {
			if (mPullRefreshScrollView.getState() == State.RESET) {
				mPullRefreshScrollView.setMode(Mode.DISABLED);
			} else if (scrollPosition > mHeaderHeight / 2) {
				// �ϻ����볬��HeaderView�߶�һ��ʱ��ȡ��ˢ�£�ͬʱҪע��ֹͣ�첽����
				mPullRefreshScrollView.onRefreshComplete();
				if (mGetDataTask != null)
					mGetDataTask.cancel(true);
			}
		}

		// ����ģ��������alphaֵ
		float ratio = Math.min(1.5f * (-mListHeaderView.getTop())
				/ mHeaderHeight, 1.0f);
		
		int newAlpha = Math.round(ratio * 255);
		// Apply on the ImageView if needed
		mBlurredImageView.setImageAlpha(newAlpha);

		// ���Ʊ�����������
		int dampedScroll = Math.round(scrollPosition * 0.125f);
		int offset = mLastDampedScroll - dampedScroll;
		mBlurredImageView.offsetTopAndBottom(offset);
		mNormalImageView.offsetTopAndBottom(offset);
		mLastDampedScroll = dampedScroll;
	}

	/**
	 * �첽�����ȡ������Ϣ
	 * 
	 */
	private class GetDataTask extends AsyncTask<Void, Void, WeatherInfo> {
		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			// Call setRefreshing when the list begin to refresh.
			mPullRefreshScrollView.setRefreshing(true);
		}

		@Override
		protected WeatherInfo doInBackground(Void... params) {
			// Simulates a background job.
			try {
				return mWeatherSpider.getWeatherInfo(getActivity(),
						mCurCity.getPostID(), true);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}

		@Override
		protected void onPostExecute(WeatherInfo result) {
			super.onPostExecute(result);
			// Do some stuff here
			// Call onRefreshComplete when the list has been refreshed.
			mPullRefreshScrollView.onRefreshComplete();
			if (!WeatherSpider.isEmpty(result)) {
				if (getActivity() != null)
					Toast.makeText(getActivity(), "ˢ�³ɹ�:" + mCurCity.getName(),
							Toast.LENGTH_SHORT).show();
				updateWeatherView(result, true);
				App.mMainMap.put(mCurCity.getPostID(), result);// ���浽ȫ�ֱ���
			} else {
				if (getActivity() != null)
					Toast.makeText(getActivity(), "ˢ��ʧ��:" + mCurCity.getName(),
							Toast.LENGTH_SHORT).show();
			}

		}

	}

	/**
	 * ����������Ϣ����
	 */
	private void updateWeatherView(WeatherInfo weatherInfo, boolean isFroce) {
		if (WeatherSpider.isEmpty(weatherInfo)) {
			if (getActivity() != null)
				Toast.makeText(getActivity(), R.string.get_weatherifo_fail,
						Toast.LENGTH_SHORT).show();
			return;
		}
		
		RealTime realTime = weatherInfo.getRealTime();
		AQI aqi = weatherInfo.getAqi();
		Forecast forecast = weatherInfo.getForecast();
		Index index = weatherInfo.getIndex();


		int type = realTime.getAnimation_type();
		if (isFroce) {
			// ��ˢ��ʱ��洢�����ݿ�
			ContentValues contentValues = new ContentValues();
			contentValues.put(CityConstants.REFRESH_TIME,
					System.currentTimeMillis());
			mContentResolver.update(CityProvider.TMPCITY_CONTENT_URI,
					contentValues, CityConstants.POST_ID + "=?",
					new String[] { mCurCity.getPostID() });
		}
		mNormalImageView.setImageResource(WeatherIconUtils
				.getWeatherNromalBg(type));
		mBlurredImageView.setImageResource(WeatherIconUtils
				.getWeatherBlurBg(type));
		mCurWeatherIV.setImageResource(WeatherIconUtils.getWeatherIcon(type));
		mCurWeatherTV.setText(realTime.getWeather_name());
		mCurFeelsTempTV.setText(realTime.getTemp() + "");
		mCurHighTempTV.setText(forecast.getTmpHigh(1) + "��");
		mCurLowTempTV.setText(forecast.getTmpLow(1) + "��");
		mCurWeatherCopyTV.setText(TimeUtils.getDay(realTime.getPub_time())
				+ "����");

		mWeatherAdapter.setWeather(realTime, aqi, forecast, index);
	}

	@Override
	public void onPullEvent(PullToRefreshBase refreshView, State state,
			Mode direction) {
		// ��ʼ����ʱ�����ϴ�ˢ��ʱ��
		if (state == State.PULL_TO_REFRESH) {
			Cursor c = mContentResolver.query(CityProvider.TMPCITY_CONTENT_URI,
					new String[] { CityConstants.REFRESH_TIME },
					CityConstants.POST_ID + "=?",
					new String[] { mCurCity.getPostID() }, null);

			long time = 0L;
			if (c.moveToFirst())
				time = c.getLong(c.getColumnIndex(CityConstants.REFRESH_TIME));
			String label = String.format(
					getResources().getString(
							R.string.pull_to_refresh_pull_sub_label),
					getResources().getString(
							R.string.pull_to_refresh_pull_sub_label_none));
			if (time > 0)
				label = String.format(
						getResources().getString(
								R.string.pull_to_refresh_pull_sub_label),
						TimeUtils.getListTime(getResources(), time));
			// ��������ˢ��ʱ����ʾ
			mPullRefreshScrollView.getLoadingLayoutProxy().setLastUpdatedLabel(
					label);
		}
	}

	@Override
	public void onRefresh(PullToRefreshBase refreshView) {
		// �������ˢ�£��򷵻�
		if (mGetDataTask != null && mGetDataTask.getStatus() == Status.RUNNING)
			return;
		mGetDataTask = new GetDataTask();
		mGetDataTask.execute();
	}
}
