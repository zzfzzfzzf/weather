package com.zzf.weather.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import android.content.res.Resources;

import com.zzf.weather.R;

/**
 * User: qii Date: 12-8-28
 */
public class TimeUtils {

	private static int MILL_MIN = 1000 * 60;
	private static int MILL_HOUR = MILL_MIN * 60;
	private static int MILL_DAY = MILL_HOUR * 24;

	private static Calendar msgCalendar = null;
	private static java.text.SimpleDateFormat dayFormat = null;
	private static java.text.SimpleDateFormat dateFormat = null;
	private static java.text.SimpleDateFormat yearFormat = null;

	private static final String[] WEEK = { "��", "һ", "��", "��", "��", "��", "��" };
	public static final String XING_QI = "����";
	public static final String ZHOU = "��";

	private TimeUtils() {

	}

	public static String getWeek(int num, String format) {
		final Calendar c = Calendar.getInstance();
		c.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));
		int weekNum = c.get(Calendar.DAY_OF_WEEK) + num;
		if (weekNum > 7)
			weekNum = weekNum - 7;
		return format + WEEK[weekNum - 1];
	}

	public static String getZhouWeek() {
		SimpleDateFormat format = new SimpleDateFormat("MM/dd");
		return format.format(new Date(System.currentTimeMillis())) + " "
				+ getWeek(0, ZHOU);
	}

	public static String getDay(long timesamp) {
		if (timesamp == 0L)
			return "δ";
		String result = "δ";
		SimpleDateFormat sdf = new SimpleDateFormat("dd");
		Date today = new Date(System.currentTimeMillis());
		Date otherDay = new Date(timesamp);
		int temp = Integer.parseInt(sdf.format(today))
				- Integer.parseInt(sdf.format(otherDay));

		switch (temp) {
		case 0:
			result = "����" + getTime(timesamp);
			break;
		case 1:
			result = "����" + getTime(timesamp);
			break;
		case 2:
			result = "ǰ��" + getTime(timesamp);
			break;

		default:
			result = temp + "��ǰ" + getTime(timesamp);
			break;
		}

		return result;
	}

	public static long getLongTime(String time) {
		try {
			time = time.substring(0, time.indexOf('.'));
			Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")
					.parse(time);
			return date.getTime();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0L;
	}
	public static String getTime(long time) {
		return new SimpleDateFormat("HH:mm").format(new Date(time));
	}
	public static String getDateTime(long time) {
		return new SimpleDateFormat("MM/dd").format(new Date(time));
	}

	public static String getListTime(Resources res, long time) {
		long now = System.currentTimeMillis();
		long msg = time;

		Calendar nowCalendar = Calendar.getInstance();

		if (msgCalendar == null)
			msgCalendar = Calendar.getInstance();

		msgCalendar.setTimeInMillis(time);

		long calcMills = now - msg;

		long calSeconds = calcMills / 1000;
		if (calSeconds < 60)
			// return res.getString(R.string.justnow);
			return new StringBuilder().append(calSeconds)
					.append(res.getString(R.string.sec)).toString();

		long calMins = calSeconds / 60;
		if (calMins < 60)
			return new StringBuilder().append(calMins)
					.append(res.getString(R.string.min)).toString();

		long calHours = calMins / 60;
		if (calHours < 24 && isSameDay(nowCalendar, msgCalendar)) {
			if (dayFormat == null)
				dayFormat = new java.text.SimpleDateFormat("HH:mm");
			String result = dayFormat.format(msgCalendar.getTime());
			return new StringBuilder().append(res.getString(R.string.today))
					.append(" ").append(result).toString();
		}

		long calDay = calHours / 24;
		if (calDay < 31) {
			if (isYesterDay(nowCalendar, msgCalendar)) {
				if (dayFormat == null)
					dayFormat = new java.text.SimpleDateFormat("HH:mm");
				String result = dayFormat.format(msgCalendar.getTime());
				return new StringBuilder(res.getString(R.string.yesterday))
						.append(" ").append(result).toString();
			} else if (isTheDayBeforeYesterDay(nowCalendar, msgCalendar)) {
				if (dayFormat == null)
					dayFormat = new java.text.SimpleDateFormat("HH:mm");
				String result = dayFormat.format(msgCalendar.getTime());
				return new StringBuilder(
						res.getString(R.string.the_day_before_yesterday))
						.append(" ").append(result).toString();
			} else {
				if (dateFormat == null)
					dateFormat = new java.text.SimpleDateFormat(
							res.getString(R.string.date_format));
				String result = dateFormat.format(msgCalendar.getTime());
				return new StringBuilder(result).toString();
			}
		}

		long calMonth = calDay / 31;

		if (calMonth < 12) {
			if (dateFormat == null)
				dateFormat = new java.text.SimpleDateFormat(
						res.getString(R.string.date_format));

			String result = dateFormat.format(msgCalendar.getTime());
			return new StringBuilder().append(result).toString();

		}
		if (yearFormat == null)
			yearFormat = new java.text.SimpleDateFormat(
					res.getString(R.string.year_format));
		String result = yearFormat.format(msgCalendar.getTime());
		return new StringBuilder().append(result).toString();

	}

	private static boolean isSameHalfDay(Calendar now, Calendar msg) {
		int nowHour = now.get(Calendar.HOUR_OF_DAY);
		int msgHOur = msg.get(Calendar.HOUR_OF_DAY);

		if (nowHour <= 12 & msgHOur <= 12) {
			return true;
		} else if (nowHour >= 12 & msgHOur >= 12) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean isSameDay(Calendar now, Calendar msg) {
		int nowDay = now.get(Calendar.DAY_OF_YEAR);
		int msgDay = msg.get(Calendar.DAY_OF_YEAR);

		return nowDay == msgDay;
	}

	private static boolean isYesterDay(Calendar now, Calendar msg) {
		int nowDay = now.get(Calendar.DAY_OF_YEAR);
		int msgDay = msg.get(Calendar.DAY_OF_YEAR);

		return (nowDay - msgDay) == 1;
	}

	private static boolean isTheDayBeforeYesterDay(Calendar now, Calendar msg) {
		int nowDay = now.get(Calendar.DAY_OF_YEAR);
		int msgDay = msg.get(Calendar.DAY_OF_YEAR);

		return (nowDay - msgDay) == 2;
	}

}
