package com.zzf.weather.plugin.spider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class WeatherConstants {
	public static final String AIRCURE_INDEX = "��ɹָ��";
	public static final Map<String, String> AIRCURE_INDEX_DESC_CN_MAP;
	public static final Map<String, String> AIRCURE_INDEX_DESC_EN_MAP;
	public static final Map<String, Map<String, String>> AIRCURE_INDEX_DESC_LANGUAGE_MAP;
	public static final Map<String, String> AIRCURE_INDEX_DESC_TW_MAP;
	public static final Map<String, String> AIRCURE_INDEX_DETAIL_CN_MAP;
	public static final Map<String, String> AIRCURE_INDEX_DETAIL_EN_MAP;
	public static final Map<String, Map<String, String>> AIRCURE_INDEX_DETAIL_LANGUAGE_MAP;
	public static final Map<String, String> AIRCURE_INDEX_DETAIL_TW_MAP;
	public static final Map<String, String> ALERM_LEVEL_CN_MAP;
	public static final Map<String, String> ALERM_LEVEL_EN_MAP;
	public static final int AQI_DANGEROUS = 300;
	public static final Map<Integer, String> AQI_DESC_CN_MAP;
	public static final Map<Integer, String> AQI_DESC_EN_MAP;
	public static final Map<String, Map<Integer, String>> AQI_DESC_LANGUAGE_MAP;
	public static final Map<Integer, String> AQI_DESC_TW_MAP;
	public static final int AQI_FINE = 100;
	public static final int AQI_GOOD = 50;
	public static final int AQI_HAZARDOUS = 500;
	public static final Map<Integer, String> AQI_LEVEL_CN_MAP;
	public static final Map<Integer, String> AQI_LEVEL_EN_MAP;
	public static final Map<String, Map<Integer, String>> AQI_LEVEL_LANGUAGE_MAP;
	public static final Map<Integer, String> AQI_LEVEL_TW_MAP;
	public static final int AQI_LIGHT_POLLUTION = 150;
	public static final int AQI_PURE = 0;
	public static final Map<String, String> AQI_SOURCE_LANGUAGE_MAP;
	public static final int AQI_UNHEALTHY = 200;
	public static final String CARWASH_INDEX = "ϴ��ָ��";
	public static final Map<String, String> CARWASH_INDEX_DESC_CN_MAP;
	public static final Map<String, String> CARWASH_INDEX_DESC_EN_MAP;
	public static final Map<String, Map<String, String>> CARWASH_INDEX_DESC_LANGUAGE_MAP;
	public static final Map<String, String> CARWASH_INDEX_DESC_TW_MAP;
	public static final Map<String, String> CARWASH_INDEX_DETAIL_CN_MAP;
	public static final Map<String, String> CARWASH_INDEX_DETAIL_EN_MAP;
	public static final Map<String, Map<String, String>> CARWASH_INDEX_DETAIL_LANGUAGE_MAP;
	public static final Map<String, String> CARWASH_INDEX_DETAIL_TW_MAP;
	public static final Map<String, String> CHINA_LANGUAGE_MAP;
	public static final Map<String, String> CN_ALERM_LEVEL_MAP;
	public static final Map<String, String> CN_WEATHER_TYPE_MAP;
	public static final Map<String, String> CN_WIND_TYPE_MAP;
	public static final String COMFORT_INDEX = "���ʶ�ָ��";
	public static final Map<String, String> COMFORT_INDEX_DESC_CN_MAP;
	public static final Map<String, String> COMFORT_INDEX_DESC_EN_MAP;
	public static final Map<String, Map<String, String>> COMFORT_INDEX_DESC_LANGUAGE_MAP;
	public static final Map<String, String> COMFORT_INDEX_DESC_TW_MAP;
	public static final Map<String, String> COMFORT_INDEX_DETAIL_CN_MAP;
	public static final Map<String, String> COMFORT_INDEX_DETAIL_EN_MAP;
	public static final Map<String, Map<String, String>> COMFORT_INDEX_DETAIL_LANGUAGE_MAP;
	public static final Map<String, String> COMFORT_INDEX_DETAIL_TW_MAP;
	public static final String DRESS_48H_INDEX = "48Сʱ����ָ��";
	public static final String DRESS_INDEX = "����ָ��";
	public static final Map<String, String> DRESS_INDEX_DESC_CN_MAP;
	public static final Map<String, String> DRESS_INDEX_DESC_EN_MAP;
	public static final Map<String, Map<String, String>> DRESS_INDEX_DESC_LANGUAGE_MAP;
	public static final Map<String, String> DRESS_INDEX_DESC_TW_MAP;
	public static final Map<String, String> DRESS_INDEX_DETAIL_CN_MAP;
	public static final Map<String, String> DRESS_INDEX_DETAIL_EN_MAP;
	public static final Map<String, Map<String, String>> DRESS_INDEX_DETAIL_LANGUAGE_MAP;
	public static final Map<String, String> DRESS_INDEX_DETAIL_TW_MAP;
	public static final Map<String, String> EN_ALERM_LEVEL_MAP;
	public static final Map<String, String> EN_WEATHER_TYPE_MAP;
	public static final Map<String, String> EN_WIND_TYPE_MAP;
	public static final String EXERCISE_INDEX = "����ָ��";
	public static final Map<String, String> EXERCISE_INDEX_DESC_CN_MAP;
	public static final Map<String, String> EXERCISE_INDEX_DESC_EN_MAP;
	public static final Map<String, Map<String, String>> EXERCISE_INDEX_DESC_LANGUAGE_MAP;
	public static final Map<String, String> EXERCISE_INDEX_DESC_TW_MAP;
	public static final Map<String, String> EXERCISE_INDEX_DETAIL_CN_MAP;
	public static final Map<String, String> EXERCISE_INDEX_DETAIL_EN_MAP;
	public static final Map<String, Map<String, String>> EXERCISE_INDEX_DETAIL_LANGUAGE_MAP;
	public static final Map<String, String> EXERCISE_INDEX_DETAIL_TW_MAP;
	public static final Map<String, String> INDEX_CN_MAP;
	public static final Map<String, Map<String, String>> INDEX_DESC_CN_MAP;
	public static final Map<String, Map<String, String>> INDEX_DESC_EN_MAP;
	public static final Map<String, Map<String, Map<String, String>>> INDEX_DESC_LANGUAGE_MAP;
	public static final Map<String, Map<String, String>> INDEX_DESC_TW_MAP;
	public static final Map<String, Map<String, String>> INDEX_DETAIL_CN_MAP;
	public static final Map<String, Map<String, String>> INDEX_DETAIL_EN_MAP;
	public static final Map<String, Map<String, Map<String, String>>> INDEX_DETAIL_LANGUAGE_MAP;
	public static final Map<String, Map<String, String>> INDEX_DETAIL_TW_MAP;
	public static final Map<String, String> INDEX_EN_MAP;
	public static final Map<String, Map<String, String>> INDEX_LANGUAGE_MAP;
	public static final Map<String, String> INDEX_OLD;
	public static final Map<String, String> INDEX_TW_MAP;
	public static final Map<String, Integer> INDEX_TYPE;
	public static final Integer NO_VALUE_FLAG = Integer.valueOf(-999);
	public static final Map<Integer, String> OLD_ALERM_LEVEL_EN_MAP;
	public static final Map<String, String> PROVINCE_FAKE_CITY_MAP;
	public static final List<String> SURPORTTED_LANGUAGE_LIST;
	public static final Map<String, String> TRANSFER_LANGUAGE_MAP = new HashMap<String, String>();
	public static final String TRAVEL_INDEX = "����ָ��";
	public static final Map<String, String> TRAVEL_INDEX_DESC_CN_MAP;
	public static final Map<String, String> TRAVEL_INDEX_DESC_EN_MAP;
	public static final Map<String, Map<String, String>> TRAVEL_INDEX_DESC_LANGUAGE_MAP;
	public static final Map<String, String> TRAVEL_INDEX_DESC_TW_MAP;
	public static final Map<String, String> TRAVEL_INDEX_DETAIL_CN_MAP;
	public static final Map<String, String> TRAVEL_INDEX_DETAIL_EN_MAP;
	public static final Map<String, Map<String, String>> TRAVEL_INDEX_DETAIL_LANGUAGE_MAP;
	public static final Map<String, String> TRAVEL_INDEX_DETAIL_TW_MAP;
	public static final String ULTRAVIOLET_48H_INDEX = "48Сʱ������ָ��";
	public static final String ULTRAVIOLET_INDEX = "������ָ��";
	public static final Map<String, String> ULTRAVIOLET_INDEX_DESC_CN_MAP;
	public static final Map<String, String> ULTRAVIOLET_INDEX_DESC_EN_MAP;
	public static final Map<String, Map<String, String>> ULTRAVIOLET_INDEX_DESC_LANGUAGE_MAP;
	public static final Map<String, String> ULTRAVIOLET_INDEX_DESC_TW_MAP;
	public static final Map<String, String> ULTRAVIOLET_INDEX_DETAIL_CN_MAP;
	public static final Map<String, String> ULTRAVIOLET_INDEX_DETAIL_EN_MAP;
	public static final Map<String, Map<String, String>> ULTRAVIOLET_INDEX_DETAIL_LANGUAGE_MAP;
	public static final Map<String, String> ULTRAVIOLET_INDEX_DETAIL_TW_MAP;
	public static final Map<String, Integer> WEATHER_ANIMATION_MAP;
	public static final Map<String, String> WEATHER_TYPE_CN_MAP;
	public static final Map<String, String> WEATHER_TYPE_EN_MAP;
	public static final Map<String, Map<String, String>> WEATHER_TYPE_LANGUAGE_MAP;
	public static final Map<String, String> WEATHER_TYPE_TW_MAP;
	public static final Map<String, String> WIND_LEVEL_CN_MAP;
	public static final Map<String, String> WIND_LEVEL_DETAIL_CN_MAP;
	public static final Map<String, String> WIND_LEVEL_DETAIL_EN_MAP;
	public static final Map<String, Map<String, String>> WIND_LEVEL_DETAIL_LANGUAGE_MAP;
	public static final Map<String, String> WIND_LEVEL_DETAIL_TW_MAP;
	public static final Map<String, String> WIND_LEVEL_EN_CN_MAP;
	public static final Map<String, String> WIND_LEVEL_EN_MAP;
	public static final String WIND_LEVEL_INDEX = "����ָ��";
	public static final Map<String, String> WIND_LEVEL_KEY_CN_MAP;
	public static final Map<String, Map<String, String>> WIND_LEVEL_LANGUAGE_MAP;
	public static final Map<String, String> WIND_LEVEL_TW_MAP;
	public static final Map<String, String> WIND_TYPE_CN_MAP;
	public static final Map<String, String> WIND_TYPE_CONNECTTOR_LANGUAGE_MAP;
	public static final Map<String, String> WIND_TYPE_EN_MAP;
	public static final Map<String, Map<String, String>> WIND_TYPE_LANGUAGE_MAP;
	public static final String WIND_TYPE_NULL = "0";
	public static final Map<String, String> WIND_TYPE_TW_MAP;

	static {
		TRANSFER_LANGUAGE_MAP
				.put(Locale.US.toString().toLowerCase(), " later ");
		TRANSFER_LANGUAGE_MAP.put(Locale.CHINA.toString().toLowerCase(), "ת");
		TRANSFER_LANGUAGE_MAP.put(Locale.TAIWAN.toString().toLowerCase(), "�D");
		CHINA_LANGUAGE_MAP = new HashMap();
		CHINA_LANGUAGE_MAP.put(Locale.US.toString().toLowerCase(), "China");
		CHINA_LANGUAGE_MAP.put(Locale.CHINA.toString().toLowerCase(), "�й�");
		CHINA_LANGUAGE_MAP.put(Locale.TAIWAN.toString().toLowerCase(), "�Ї�");
		WEATHER_TYPE_CN_MAP = new HashMap();
		WEATHER_TYPE_EN_MAP = new HashMap();
		WEATHER_TYPE_TW_MAP = new HashMap();
		WEATHER_TYPE_LANGUAGE_MAP = new HashMap();
		WEATHER_TYPE_LANGUAGE_MAP.put(Locale.US.toString().toLowerCase(),
				WEATHER_TYPE_EN_MAP);
		WEATHER_TYPE_LANGUAGE_MAP.put(Locale.CHINA.toString().toLowerCase(),
				WEATHER_TYPE_CN_MAP);
		WEATHER_TYPE_LANGUAGE_MAP.put(Locale.TAIWAN.toString().toLowerCase(),
				WEATHER_TYPE_TW_MAP);
		CN_WEATHER_TYPE_MAP = new HashMap();
		EN_WEATHER_TYPE_MAP = new HashMap();
		WEATHER_TYPE_CN_MAP.put("00", "��");
		WEATHER_TYPE_CN_MAP.put("01", "����");
		WEATHER_TYPE_CN_MAP.put("02", "��");
		WEATHER_TYPE_CN_MAP.put("03", "����");
		WEATHER_TYPE_CN_MAP.put("04", "������");
		WEATHER_TYPE_CN_MAP.put("05", "��������б���");
		WEATHER_TYPE_CN_MAP.put("06", "���ѩ");
		WEATHER_TYPE_CN_MAP.put("07", "С��");
		WEATHER_TYPE_CN_MAP.put("08", "����");
		WEATHER_TYPE_CN_MAP.put("09", "����");
		WEATHER_TYPE_CN_MAP.put("10", "����");
		WEATHER_TYPE_CN_MAP.put("11", "����");
		WEATHER_TYPE_CN_MAP.put("12", "�ش���");
		WEATHER_TYPE_CN_MAP.put("13", "��ѩ");
		WEATHER_TYPE_CN_MAP.put("14", "Сѩ");
		WEATHER_TYPE_CN_MAP.put("15", "��ѩ");
		WEATHER_TYPE_CN_MAP.put("16", "��ѩ");
		WEATHER_TYPE_CN_MAP.put("17", "��ѩ");
		WEATHER_TYPE_CN_MAP.put("18", "��");
		WEATHER_TYPE_CN_MAP.put("19", "����");
		WEATHER_TYPE_CN_MAP.put("20", "ɳ����");
		WEATHER_TYPE_CN_MAP.put("21", "С������");
		WEATHER_TYPE_CN_MAP.put("22", "�е�����");
		WEATHER_TYPE_CN_MAP.put("23", "�󵽱���");
		WEATHER_TYPE_CN_MAP.put("24", "���굽����");
		WEATHER_TYPE_CN_MAP.put("25", "���굽�ش���");
		WEATHER_TYPE_CN_MAP.put("26", "С����ѩ");
		WEATHER_TYPE_CN_MAP.put("27", "�е���ѩ");
		WEATHER_TYPE_CN_MAP.put("28", "�󵽱�ѩ");
		WEATHER_TYPE_CN_MAP.put("29", "����");
		WEATHER_TYPE_CN_MAP.put("30", "��ɳ");
		WEATHER_TYPE_CN_MAP.put("31", "ǿɳ����");
		WEATHER_TYPE_CN_MAP.put("53", "��");
		WEATHER_TYPE_CN_MAP.put("99", "��");
		WEATHER_TYPE_EN_MAP.put("00", "Sunny");
		WEATHER_TYPE_EN_MAP.put("01", "Cloudy");
		WEATHER_TYPE_EN_MAP.put("02", "Overcast");
		WEATHER_TYPE_EN_MAP.put("03", "Shower");
		WEATHER_TYPE_EN_MAP.put("04", "Thunderstorm");
		WEATHER_TYPE_EN_MAP.put("05", "Thunderstorm with hail");
		WEATHER_TYPE_EN_MAP.put("06", "Sleet");
		WEATHER_TYPE_EN_MAP.put("07", "Light rain");
		WEATHER_TYPE_EN_MAP.put("08", "Moderate rain");
		WEATHER_TYPE_EN_MAP.put("09", "Heavy rain");
		WEATHER_TYPE_EN_MAP.put("10", "Storm");
		WEATHER_TYPE_EN_MAP.put("11", "Heavy storm");
		WEATHER_TYPE_EN_MAP.put("12", "Severe storm");
		WEATHER_TYPE_EN_MAP.put("13", "Snow flurries");
		WEATHER_TYPE_EN_MAP.put("14", "Light snow");
		WEATHER_TYPE_EN_MAP.put("15", "Moderate snow");
		WEATHER_TYPE_EN_MAP.put("16", "Heavy snow");
		WEATHER_TYPE_EN_MAP.put("17", "Blizzard");
		WEATHER_TYPE_EN_MAP.put("18", "Foggy");
		WEATHER_TYPE_EN_MAP.put("19", "Freezing rain");
		WEATHER_TYPE_EN_MAP.put("20", "Duststorm");
		WEATHER_TYPE_EN_MAP.put("21", "Light to moderate rain");
		WEATHER_TYPE_EN_MAP.put("22", "Moderate to heavy rain");
		WEATHER_TYPE_EN_MAP.put("23", "Heavy rain to storm");
		WEATHER_TYPE_EN_MAP.put("24", "Storm to heavy storm");
		WEATHER_TYPE_EN_MAP.put("25", "Heavy to severe storm");
		WEATHER_TYPE_EN_MAP.put("26", "Light to moderate snow");
		WEATHER_TYPE_EN_MAP.put("27", "Moderate to heavy snow");
		WEATHER_TYPE_EN_MAP.put("28", "Heavy snow to blizzard");
		WEATHER_TYPE_EN_MAP.put("29", "Dust");
		WEATHER_TYPE_EN_MAP.put("30", "Sand");
		WEATHER_TYPE_EN_MAP.put("31", "Sandstorm");
		WEATHER_TYPE_EN_MAP.put("53", "Haze");
		WEATHER_TYPE_EN_MAP.put("99", "Unknown");
		WEATHER_TYPE_TW_MAP.put("00", "��");
		WEATHER_TYPE_TW_MAP.put("01", "���");
		WEATHER_TYPE_TW_MAP.put("02", "�");
		WEATHER_TYPE_TW_MAP.put("03", "���");
		WEATHER_TYPE_TW_MAP.put("04", "�����");
		WEATHER_TYPE_TW_MAP.put("05", "�������б���");
		WEATHER_TYPE_TW_MAP.put("06", "��Aѩ");
		WEATHER_TYPE_TW_MAP.put("07", "С��");
		WEATHER_TYPE_TW_MAP.put("08", "����");
		WEATHER_TYPE_TW_MAP.put("09", "����");
		WEATHER_TYPE_TW_MAP.put("10", "����");
		WEATHER_TYPE_TW_MAP.put("11", "����");
		WEATHER_TYPE_TW_MAP.put("12", "�ش���");
		WEATHER_TYPE_TW_MAP.put("13", "�ѩ");
		WEATHER_TYPE_TW_MAP.put("14", "Сѩ");
		WEATHER_TYPE_TW_MAP.put("15", "��ѩ");
		WEATHER_TYPE_TW_MAP.put("16", "��ѩ");
		WEATHER_TYPE_TW_MAP.put("17", "��ѩ");
		WEATHER_TYPE_TW_MAP.put("18", "�F");
		WEATHER_TYPE_TW_MAP.put("19", "����");
		WEATHER_TYPE_TW_MAP.put("20", "ɳ�m��");
		WEATHER_TYPE_TW_MAP.put("21", "С������");
		WEATHER_TYPE_TW_MAP.put("22", "�е�����");
		WEATHER_TYPE_TW_MAP.put("23", "�󵽱���");
		WEATHER_TYPE_TW_MAP.put("24", "���굽����");
		WEATHER_TYPE_TW_MAP.put("25", "���굽�ش���");
		WEATHER_TYPE_TW_MAP.put("26", "С����ѩ");
		WEATHER_TYPE_TW_MAP.put("27", "�е���ѩ");
		WEATHER_TYPE_TW_MAP.put("28", "�󵽱�ѩ");
		WEATHER_TYPE_TW_MAP.put("29", "���m");
		WEATHER_TYPE_TW_MAP.put("30", "�Pɳ");
		WEATHER_TYPE_TW_MAP.put("31", "��ɳ�m��");
		WEATHER_TYPE_TW_MAP.put("53", "��");
		WEATHER_TYPE_TW_MAP.put("99", "��");
		CN_WEATHER_TYPE_MAP.put("��", "00");
		CN_WEATHER_TYPE_MAP.put("����", "01");
		CN_WEATHER_TYPE_MAP.put("��", "02");
		CN_WEATHER_TYPE_MAP.put("����", "03");
		CN_WEATHER_TYPE_MAP.put("������", "04");
		CN_WEATHER_TYPE_MAP.put("��������б���", "05");
		CN_WEATHER_TYPE_MAP.put("���ѩ", "06");
		CN_WEATHER_TYPE_MAP.put("С��", "07");
		CN_WEATHER_TYPE_MAP.put("����", "08");
		CN_WEATHER_TYPE_MAP.put("����", "09");
		CN_WEATHER_TYPE_MAP.put("����", "10");
		CN_WEATHER_TYPE_MAP.put("����", "11");
		CN_WEATHER_TYPE_MAP.put("�ش���", "12");
		CN_WEATHER_TYPE_MAP.put("��ѩ", "13");
		CN_WEATHER_TYPE_MAP.put("Сѩ", "14");
		CN_WEATHER_TYPE_MAP.put("��ѩ", "15");
		CN_WEATHER_TYPE_MAP.put("��ѩ", "16");
		CN_WEATHER_TYPE_MAP.put("��ѩ", "17");
		CN_WEATHER_TYPE_MAP.put("��", "18");
		CN_WEATHER_TYPE_MAP.put("����", "19");
		CN_WEATHER_TYPE_MAP.put("ɳ����", "20");
		CN_WEATHER_TYPE_MAP.put("С������", "21");
		CN_WEATHER_TYPE_MAP.put("�е�����", "22");
		CN_WEATHER_TYPE_MAP.put("�󵽱���", "23");
		CN_WEATHER_TYPE_MAP.put("���굽����", "24");
		CN_WEATHER_TYPE_MAP.put("���굽�ش���", "25");
		CN_WEATHER_TYPE_MAP.put("С����ѩ", "26");
		CN_WEATHER_TYPE_MAP.put("�е���ѩ", "27");
		CN_WEATHER_TYPE_MAP.put("�󵽱�ѩ", "28");
		CN_WEATHER_TYPE_MAP.put("����", "29");
		CN_WEATHER_TYPE_MAP.put("��ɳ", "30");
		CN_WEATHER_TYPE_MAP.put("ǿɳ����", "31");
		CN_WEATHER_TYPE_MAP.put("��", "53");
		CN_WEATHER_TYPE_MAP.put("��", "99");
		ALERM_LEVEL_CN_MAP = new HashMap();
		ALERM_LEVEL_EN_MAP = new HashMap();
		CN_ALERM_LEVEL_MAP = new HashMap();
		EN_ALERM_LEVEL_MAP = new HashMap();
		OLD_ALERM_LEVEL_EN_MAP = new HashMap();
		CN_ALERM_LEVEL_MAP.put("��ɫ", "01");
		CN_ALERM_LEVEL_MAP.put("��ɫ", "02");
		CN_ALERM_LEVEL_MAP.put("��ɫ", "03");
		CN_ALERM_LEVEL_MAP.put("��ɫ", "04");
		EN_ALERM_LEVEL_MAP.put("blue", "01");
		EN_ALERM_LEVEL_MAP.put("yellow", "02");
		EN_ALERM_LEVEL_MAP.put("orange", "03");
		EN_ALERM_LEVEL_MAP.put("re", "04");
		ALERM_LEVEL_CN_MAP.put("01", "��ɫ");
		ALERM_LEVEL_CN_MAP.put("02", "��ɫ");
		ALERM_LEVEL_CN_MAP.put("03", "��ɫ");
		ALERM_LEVEL_CN_MAP.put("04", "��ɫ");
		ALERM_LEVEL_EN_MAP.put("01", "blue");
		ALERM_LEVEL_EN_MAP.put("02", "yellow");
		ALERM_LEVEL_EN_MAP.put("03", "orange");
		ALERM_LEVEL_EN_MAP.put("04", "red");
		OLD_ALERM_LEVEL_EN_MAP.put(Integer.valueOf(1), "blue");
		OLD_ALERM_LEVEL_EN_MAP.put(Integer.valueOf(2), "yellow");
		OLD_ALERM_LEVEL_EN_MAP.put(Integer.valueOf(3), "orange");
		OLD_ALERM_LEVEL_EN_MAP.put(Integer.valueOf(4), "red");
		WIND_TYPE_CN_MAP = new HashMap<String, String>();
		WIND_TYPE_EN_MAP = new HashMap<String, String>();
		WIND_TYPE_TW_MAP = new HashMap<String, String>();
		CN_WIND_TYPE_MAP = new HashMap<String, String>();
		EN_WIND_TYPE_MAP = new HashMap<String, String>();
		WIND_TYPE_CONNECTTOR_LANGUAGE_MAP = new HashMap<String, String>();
		WIND_TYPE_CONNECTTOR_LANGUAGE_MAP.put(Locale.US.toString()
				.toLowerCase(), ", speed ");
		WIND_TYPE_CONNECTTOR_LANGUAGE_MAP.put(Locale.CHINA.toString()
				.toLowerCase(), "������");
		WIND_TYPE_CONNECTTOR_LANGUAGE_MAP.put(Locale.TAIWAN.toString()
				.toLowerCase(), "���L��");
		WIND_TYPE_LANGUAGE_MAP = new HashMap<String, Map<String, String>>();
		WIND_TYPE_LANGUAGE_MAP.put(Locale.US.toString().toLowerCase(),
				WIND_TYPE_EN_MAP);
		WIND_TYPE_LANGUAGE_MAP.put(Locale.CHINA.toString().toLowerCase(),
				WIND_TYPE_CN_MAP);
		WIND_TYPE_LANGUAGE_MAP.put(Locale.TAIWAN.toString().toLowerCase(),
				WIND_TYPE_TW_MAP);
		WIND_TYPE_CN_MAP.put("0", "΢��");
		WIND_TYPE_CN_MAP.put("1", "������");
		WIND_TYPE_CN_MAP.put("2", "����");
		WIND_TYPE_CN_MAP.put("3", "���Ϸ�");
		WIND_TYPE_CN_MAP.put("4", "�Ϸ�");
		WIND_TYPE_CN_MAP.put("5", "���Ϸ�");
		WIND_TYPE_CN_MAP.put("6", "����");
		WIND_TYPE_CN_MAP.put("7", "������");
		WIND_TYPE_CN_MAP.put("8", "����");
		WIND_TYPE_CN_MAP.put("9", "��ת��");
		WIND_TYPE_EN_MAP.put("0", "No wind");
		WIND_TYPE_EN_MAP.put("1", "Northeast");
		WIND_TYPE_EN_MAP.put("2", "East");
		WIND_TYPE_EN_MAP.put("3", "Southeast");
		WIND_TYPE_EN_MAP.put("4", "South");
		WIND_TYPE_EN_MAP.put("5", "Southwest");
		WIND_TYPE_EN_MAP.put("6", "West");
		WIND_TYPE_EN_MAP.put("7", "Northwest");
		WIND_TYPE_EN_MAP.put("8", "North");
		WIND_TYPE_EN_MAP.put("9", "Variable");
		WIND_TYPE_TW_MAP.put("0", "΢�L");
		WIND_TYPE_TW_MAP.put("1", "�|���L");
		WIND_TYPE_TW_MAP.put("2", "�|�L");
		WIND_TYPE_TW_MAP.put("3", "�|���L");
		WIND_TYPE_TW_MAP.put("4", "���L");
		WIND_TYPE_TW_MAP.put("5", "�����L");
		WIND_TYPE_TW_MAP.put("6", "���L");
		WIND_TYPE_TW_MAP.put("7", "�����L");
		WIND_TYPE_TW_MAP.put("8", "���L");
		WIND_TYPE_TW_MAP.put("9", "���D�L");
		CN_WIND_TYPE_MAP.put("΢��", "0");
		CN_WIND_TYPE_MAP.put("�޳�������", "0");
		CN_WIND_TYPE_MAP.put("������", "1");
		CN_WIND_TYPE_MAP.put("����", "2");
		CN_WIND_TYPE_MAP.put("���Ϸ�", "3");
		CN_WIND_TYPE_MAP.put("�Ϸ�", "4");
		CN_WIND_TYPE_MAP.put("���Ϸ�", "5");
		CN_WIND_TYPE_MAP.put("����", "6");
		CN_WIND_TYPE_MAP.put("������", "7");
		CN_WIND_TYPE_MAP.put("����", "8");
		CN_WIND_TYPE_MAP.put("��ת��", "9");
		EN_WIND_TYPE_MAP.put("No wind", "0");
		EN_WIND_TYPE_MAP.put("Northeast", "1");
		EN_WIND_TYPE_MAP.put("East", "2");
		EN_WIND_TYPE_MAP.put("Southeast", "3");
		EN_WIND_TYPE_MAP.put("South", "4");
		EN_WIND_TYPE_MAP.put("Southwest", "5");
		EN_WIND_TYPE_MAP.put("West", "6");
		EN_WIND_TYPE_MAP.put("Northwest", "7");
		EN_WIND_TYPE_MAP.put("North", "8");
		EN_WIND_TYPE_MAP.put("Whirl wind", "9");
		WIND_LEVEL_KEY_CN_MAP = new HashMap<String, String>();
		WIND_LEVEL_KEY_CN_MAP.put("0", "С��3��");
		WIND_LEVEL_KEY_CN_MAP.put("1", "3-4��");
		WIND_LEVEL_KEY_CN_MAP.put("2", "4-5��");
		WIND_LEVEL_KEY_CN_MAP.put("3", "5-6��");
		WIND_LEVEL_KEY_CN_MAP.put("4", "6-7��");
		WIND_LEVEL_KEY_CN_MAP.put("5", "7-8��");
		WIND_LEVEL_KEY_CN_MAP.put("6", "8-9��");
		WIND_LEVEL_KEY_CN_MAP.put("7", "9-10��");
		WIND_LEVEL_KEY_CN_MAP.put("8", "10-11��");
		WIND_LEVEL_KEY_CN_MAP.put("9", "11-12��");
		WIND_LEVEL_EN_MAP = new HashMap<String, String>();
		WIND_LEVEL_EN_CN_MAP = new HashMap<String, String>();
		WIND_LEVEL_TW_MAP = new HashMap<String, String>();
		WIND_LEVEL_CN_MAP = new HashMap<String, String>();
		WIND_LEVEL_LANGUAGE_MAP = new HashMap<String, Map<String, String>>();
		WIND_LEVEL_LANGUAGE_MAP.put(Locale.US.toString().toLowerCase(),
				WIND_LEVEL_EN_MAP);
		WIND_LEVEL_LANGUAGE_MAP.put(Locale.CHINA.toString().toLowerCase(),
				WIND_LEVEL_CN_MAP);
		WIND_LEVEL_LANGUAGE_MAP.put(Locale.TAIWAN.toString().toLowerCase(),
				WIND_LEVEL_TW_MAP);
		WIND_LEVEL_CN_MAP.put("0��", "С��3��");
		WIND_LEVEL_CN_MAP.put("1��", "1��");
		WIND_LEVEL_CN_MAP.put("2��", "2��");
		WIND_LEVEL_CN_MAP.put("3��", "3��");
		WIND_LEVEL_CN_MAP.put("4��", "4��");
		WIND_LEVEL_CN_MAP.put("5��", "5��");
		WIND_LEVEL_CN_MAP.put("6��", "6��");
		WIND_LEVEL_CN_MAP.put("7��", "7��");
		WIND_LEVEL_CN_MAP.put("8��", "8��");
		WIND_LEVEL_CN_MAP.put("9��", "9��");
		WIND_LEVEL_CN_MAP.put("10��", "10��");
		WIND_LEVEL_CN_MAP.put("11��", "11��");
		WIND_LEVEL_CN_MAP.put("12��", "12��");
		WIND_LEVEL_CN_MAP.put("С��3��", "С��3��");
		WIND_LEVEL_CN_MAP.put("3-4��", "3-4��");
		WIND_LEVEL_CN_MAP.put("4-5��", "4-5��");
		WIND_LEVEL_CN_MAP.put("5-6��", "5-6��");
		WIND_LEVEL_CN_MAP.put("6-7��", "6-7��");
		WIND_LEVEL_CN_MAP.put("7-8��", "7-8��");
		WIND_LEVEL_CN_MAP.put("8-9��", "8-9��");
		WIND_LEVEL_CN_MAP.put("9-10��", "9-10��");
		WIND_LEVEL_CN_MAP.put("10-11��", "10-11��");
		WIND_LEVEL_CN_MAP.put("11-12��", "11-12��");
		WIND_LEVEL_EN_MAP.put("0��", "< 16km/h");
		WIND_LEVEL_EN_MAP.put("1��", "< 16km/h");
		WIND_LEVEL_EN_MAP.put("2��", "< 16km/h");
		WIND_LEVEL_EN_MAP.put("3��", "16km/h");
		WIND_LEVEL_EN_MAP.put("4��", "27km/h");
		WIND_LEVEL_EN_MAP.put("5��", "40km/h");
		WIND_LEVEL_EN_MAP.put("6��", "55km/h");
		WIND_LEVEL_EN_MAP.put("7��", "69km/h");
		WIND_LEVEL_EN_MAP.put("8��", "87km/h");
		WIND_LEVEL_EN_MAP.put("9��", "105km/h");
		WIND_LEVEL_EN_MAP.put("10��", "124km/h");
		WIND_LEVEL_EN_MAP.put("11��", "143km/h");
		WIND_LEVEL_EN_MAP.put("12��", "164km/h");
		WIND_LEVEL_EN_MAP.put("С��3��", "< 16km/h");
		WIND_LEVEL_EN_MAP.put("3-4��", "16-27km/h");
		WIND_LEVEL_EN_MAP.put("4-5��", "27-40km/h");
		WIND_LEVEL_EN_MAP.put("5-6��", "40-55km/h");
		WIND_LEVEL_EN_MAP.put("6-7��", "55-69km/h");
		WIND_LEVEL_EN_MAP.put("7-8��", "69-87km/h");
		WIND_LEVEL_EN_MAP.put("8-9��", "87-105km/h");
		WIND_LEVEL_EN_MAP.put("9-10��", "105-124km/h");
		WIND_LEVEL_EN_MAP.put("10-11��", "124-143km/h");
		WIND_LEVEL_EN_MAP.put("11-12��", "143-164km/h");
		WIND_LEVEL_TW_MAP.put("0��", "С��3��");
		WIND_LEVEL_TW_MAP.put("1��", "1��");
		WIND_LEVEL_TW_MAP.put("2��", "2��");
		WIND_LEVEL_TW_MAP.put("3��", "3��");
		WIND_LEVEL_TW_MAP.put("4��", "4��");
		WIND_LEVEL_TW_MAP.put("5��", "5��");
		WIND_LEVEL_TW_MAP.put("6��", "6��");
		WIND_LEVEL_TW_MAP.put("7��", "7��");
		WIND_LEVEL_TW_MAP.put("8��", "8��");
		WIND_LEVEL_TW_MAP.put("9��", "9��");
		WIND_LEVEL_TW_MAP.put("10��", "10��");
		WIND_LEVEL_TW_MAP.put("11��", "11��");
		WIND_LEVEL_TW_MAP.put("12��", "12��");
		WIND_LEVEL_TW_MAP.put("С��3��", "С��3��");
		WIND_LEVEL_TW_MAP.put("3-4��", "3-4��");
		WIND_LEVEL_TW_MAP.put("4-5��", "4-5��");
		WIND_LEVEL_TW_MAP.put("5-6��", "5-6��");
		WIND_LEVEL_TW_MAP.put("6-7��", "6-7��");
		WIND_LEVEL_TW_MAP.put("7-8��", "7-8��");
		WIND_LEVEL_TW_MAP.put("8-9��", "8-9��");
		WIND_LEVEL_TW_MAP.put("9-10��", "9-10��");
		WIND_LEVEL_TW_MAP.put("10-11��", "10-11��");
		WIND_LEVEL_TW_MAP.put("11-12��", "11-12��");
		WIND_LEVEL_DETAIL_EN_MAP = new HashMap();
		WIND_LEVEL_DETAIL_TW_MAP = new HashMap();
		WIND_LEVEL_DETAIL_CN_MAP = new HashMap();
		WIND_LEVEL_DETAIL_LANGUAGE_MAP = new HashMap();
		WIND_LEVEL_DETAIL_LANGUAGE_MAP.put(Locale.US.toString().toLowerCase(),
				WIND_LEVEL_DETAIL_EN_MAP);
		WIND_LEVEL_DETAIL_LANGUAGE_MAP.put(Locale.CHINA.toString()
				.toLowerCase(), WIND_LEVEL_DETAIL_CN_MAP);
		WIND_LEVEL_DETAIL_LANGUAGE_MAP.put(Locale.TAIWAN.toString()
				.toLowerCase(), WIND_LEVEL_DETAIL_TW_MAP);
		WIND_LEVEL_DETAIL_CN_MAP.put("С��3��", "΢����棬�о����������ʵ���ȥ�������һ�¡�");
		WIND_LEVEL_DETAIL_CN_MAP.put("3-4��", "������е������Ļ��������÷�����ʩ��");
		WIND_LEVEL_DETAIL_CN_MAP.put("4-5��", "������е������Ļ��������÷�����ʩ��");
		WIND_LEVEL_DETAIL_CN_MAP.put("5-6��", "������е������Ļ��������÷�����ʩ��");
		WIND_LEVEL_DETAIL_CN_MAP.put("6-7��", "������е������Ļ��������÷�����ʩ��");
		WIND_LEVEL_DETAIL_CN_MAP.put("7-8��", "������е������Ļ��������÷�����ʩ��");
		WIND_LEVEL_DETAIL_CN_MAP.put("8-9��", "������е������Ļ��������÷�����ʩ��");
		WIND_LEVEL_DETAIL_CN_MAP.put("9-10��", "������е������Ļ��������÷�����ʩ��");
		WIND_LEVEL_DETAIL_CN_MAP.put("10-11��", "������е������Ļ��������÷�����ʩ��");
		WIND_LEVEL_DETAIL_CN_MAP.put("11-12��", "������е������Ļ��������÷�����ʩ��");
		WIND_LEVEL_DETAIL_EN_MAP.put("С��3��", "Comfortable");
		WIND_LEVEL_DETAIL_EN_MAP.put("3-4��", "Wear layers!");
		WIND_LEVEL_DETAIL_EN_MAP.put("4-5��", "Wear layers!");
		WIND_LEVEL_DETAIL_EN_MAP.put("5-6��", "Wear layers!");
		WIND_LEVEL_DETAIL_EN_MAP.put("6-7��", "Wear layers!");
		WIND_LEVEL_DETAIL_EN_MAP.put("7-8��", "Wear layers!");
		WIND_LEVEL_DETAIL_EN_MAP.put("8-9��", "Wear layers!");
		WIND_LEVEL_DETAIL_EN_MAP.put("9-10��", "Wear layers!");
		WIND_LEVEL_DETAIL_EN_MAP.put("10-11��", "Wear layers!");
		WIND_LEVEL_DETAIL_EN_MAP.put("11-12��", "Wear layers!");
		WIND_LEVEL_DETAIL_TW_MAP.put("С��3��", "΢�L���棬���X���e�����h�m����ȥ������һ�¡�");
		WIND_LEVEL_DETAIL_TW_MAP.put("3-4��", "�����L���c�������Ԓ��Ո���÷��o��ʩ��");
		WIND_LEVEL_DETAIL_TW_MAP.put("4-5��", "�����L���c�������Ԓ��Ո���÷��o��ʩ��");
		WIND_LEVEL_DETAIL_TW_MAP.put("5-6��", "�����L���c�������Ԓ��Ո���÷��o��ʩ��");
		WIND_LEVEL_DETAIL_TW_MAP.put("6-7��", "�����L���c�������Ԓ��Ո���÷��o��ʩ��");
		WIND_LEVEL_DETAIL_TW_MAP.put("7-8��", "�����L���c�������Ԓ��Ո���÷��o��ʩ��");
		WIND_LEVEL_DETAIL_TW_MAP.put("8-9��", "�����L���c�������Ԓ��Ո���÷��o��ʩ��");
		WIND_LEVEL_DETAIL_TW_MAP.put("9-10��", "�����L���c�������Ԓ��Ո���÷��o��ʩ��");
		WIND_LEVEL_DETAIL_TW_MAP.put("10-11��", "�����L���c�������Ԓ��Ո���÷��o��ʩ��");
		WIND_LEVEL_DETAIL_TW_MAP.put("11-12��", "�����L���c�������Ԓ��Ո���÷��o��ʩ��");
		WEATHER_ANIMATION_MAP = new HashMap<String, Integer>();
		WEATHER_ANIMATION_MAP.put("��", Integer.valueOf(0));
		WEATHER_ANIMATION_MAP.put("����", Integer.valueOf(1));
		WEATHER_ANIMATION_MAP.put("��", Integer.valueOf(2));
		WEATHER_ANIMATION_MAP.put("��", Integer.valueOf(3));
		WEATHER_ANIMATION_MAP.put("�ش���", Integer.valueOf(4));
		WEATHER_ANIMATION_MAP.put("����", Integer.valueOf(5));
		WEATHER_ANIMATION_MAP.put("����", Integer.valueOf(6));
		WEATHER_ANIMATION_MAP.put("������", Integer.valueOf(7));
		WEATHER_ANIMATION_MAP.put("����", Integer.valueOf(8));
		WEATHER_ANIMATION_MAP.put("����", Integer.valueOf(9));
		WEATHER_ANIMATION_MAP.put("����", Integer.valueOf(10));
		WEATHER_ANIMATION_MAP.put("С��", Integer.valueOf(11));
		WEATHER_ANIMATION_MAP.put("���ѩ", Integer.valueOf(12));
		WEATHER_ANIMATION_MAP.put("��ѩ", Integer.valueOf(13));
		WEATHER_ANIMATION_MAP.put("��ѩ", Integer.valueOf(14));
		WEATHER_ANIMATION_MAP.put("��ѩ", Integer.valueOf(15));
		WEATHER_ANIMATION_MAP.put("��ѩ", Integer.valueOf(16));
		WEATHER_ANIMATION_MAP.put("Сѩ", Integer.valueOf(17));
		WEATHER_ANIMATION_MAP.put("ǿɳ����", Integer.valueOf(18));
		WEATHER_ANIMATION_MAP.put("ɳ����", Integer.valueOf(19));
		WEATHER_ANIMATION_MAP.put("ɳ��", Integer.valueOf(20));
		WEATHER_ANIMATION_MAP.put("��ɳ", Integer.valueOf(21));
		WEATHER_ANIMATION_MAP.put("����", Integer.valueOf(22));
		WEATHER_ANIMATION_MAP.put("����", Integer.valueOf(23));
		WEATHER_ANIMATION_MAP.put("��", Integer.valueOf(24));
		INDEX_TYPE = new HashMap<String, Integer>();
		INDEX_TYPE.put("����ָ��", Integer.valueOf(0));
		INDEX_TYPE.put("������ָ��", Integer.valueOf(1));
		INDEX_TYPE.put("����ָ��", Integer.valueOf(2));
		INDEX_TYPE.put("���ʶ�ָ��", Integer.valueOf(3));
		INDEX_TYPE.put("ϴ��ָ��", Integer.valueOf(4));
		INDEX_TYPE.put("��ɹָ��", Integer.valueOf(5));
		INDEX_TYPE.put("����ָ��", Integer.valueOf(6));
		INDEX_TYPE.put("����ָ��", Integer.valueOf(7));
		INDEX_TYPE.put("48Сʱ����ָ��", Integer.valueOf(8));
		INDEX_TYPE.put("48Сʱ������ָ��", Integer.valueOf(9));
		INDEX_OLD = new LinkedHashMap<String, String>();
		INDEX_OLD.put("������ָ��", "index_uv");
		INDEX_OLD.put("����ָ��", "index");
		INDEX_OLD.put("���ʶ�ָ��", "index_co");
		INDEX_OLD.put("ϴ��ָ��", "index_xc");
		INDEX_OLD.put("��ɹָ��", "index_ls");
		INDEX_OLD.put("����ָ��", "index_cl");
		INDEX_OLD.put("����ָ��", "index_tr");
		INDEX_OLD.put("48Сʱ����ָ��", "index48");
		INDEX_OLD.put("48Сʱ������ָ��", "index48_uv");
		EXERCISE_INDEX_DESC_EN_MAP = new HashMap<String, String>();
		EXERCISE_INDEX_DESC_EN_MAP.put("����", "OK");
		EXERCISE_INDEX_DESC_EN_MAP.put("������", "Good");
		EXERCISE_INDEX_DESC_EN_MAP.put("�ϲ���", "Avoid if possible");
		EXERCISE_INDEX_DESC_EN_MAP.put("����", "Not recommended");
		EXERCISE_INDEX_DESC_EN_MAP.put("������", "Ideal");
		EXERCISE_INDEX_DESC_CN_MAP = new HashMap<String, String>();
		EXERCISE_INDEX_DESC_CN_MAP.put("����", "����");
		EXERCISE_INDEX_DESC_CN_MAP.put("������", "������");
		EXERCISE_INDEX_DESC_CN_MAP.put("�ϲ���", "�ϲ���");
		EXERCISE_INDEX_DESC_CN_MAP.put("����", "����");
		EXERCISE_INDEX_DESC_CN_MAP.put("������", "������");
		EXERCISE_INDEX_DESC_TW_MAP = new HashMap<String, String>();
		EXERCISE_INDEX_DESC_TW_MAP.put("����", "�m��");
		EXERCISE_INDEX_DESC_TW_MAP.put("������", "�^�m��");
		EXERCISE_INDEX_DESC_TW_MAP.put("�ϲ���", "�^����");
		EXERCISE_INDEX_DESC_TW_MAP.put("����", "����");
		EXERCISE_INDEX_DESC_TW_MAP.put("������", "�O�m��");
		CARWASH_INDEX_DESC_EN_MAP = new HashMap<String, String>();
		CARWASH_INDEX_DESC_EN_MAP.put("����", "OK");
		CARWASH_INDEX_DESC_EN_MAP.put("������", "Good");
		CARWASH_INDEX_DESC_EN_MAP.put("�ϲ���", "Avoid if possible");
		CARWASH_INDEX_DESC_EN_MAP.put("����", "Not recommended");
		CARWASH_INDEX_DESC_EN_MAP.put("������", "Ideal");
		CARWASH_INDEX_DESC_CN_MAP = new HashMap<String, String>();
		CARWASH_INDEX_DESC_CN_MAP.put("����", "����");
		CARWASH_INDEX_DESC_CN_MAP.put("������", "������");
		CARWASH_INDEX_DESC_CN_MAP.put("�ϲ���", "�ϲ���");
		CARWASH_INDEX_DESC_CN_MAP.put("����", "����");
		CARWASH_INDEX_DESC_CN_MAP.put("������", "������");
		CARWASH_INDEX_DESC_TW_MAP = new HashMap<String, String>();
		CARWASH_INDEX_DESC_TW_MAP.put("����", "�m��");
		CARWASH_INDEX_DESC_TW_MAP.put("������", "�^�m��");
		CARWASH_INDEX_DESC_TW_MAP.put("�ϲ���", "�^����");
		CARWASH_INDEX_DESC_TW_MAP.put("����", "����");
		CARWASH_INDEX_DESC_TW_MAP.put("������", "�O�m��");
		AIRCURE_INDEX_DESC_EN_MAP = new HashMap<String, String>();
		AIRCURE_INDEX_DESC_EN_MAP.put("����", "OK");
		AIRCURE_INDEX_DESC_EN_MAP.put("������", "Good");
		AIRCURE_INDEX_DESC_EN_MAP.put("��̫����", "Not Good");
		AIRCURE_INDEX_DESC_EN_MAP.put("�ϲ���", "Avoid if possible");
		AIRCURE_INDEX_DESC_EN_MAP.put("����", "Not recommended");
		AIRCURE_INDEX_DESC_EN_MAP.put("������", "Ideal");
		AIRCURE_INDEX_DESC_CN_MAP = new HashMap<String, String>();
		AIRCURE_INDEX_DESC_CN_MAP.put("����", "����");
		AIRCURE_INDEX_DESC_CN_MAP.put("������", "������");
		AIRCURE_INDEX_DESC_CN_MAP.put("��̫����", "��̫����");
		AIRCURE_INDEX_DESC_CN_MAP.put("�ϲ���", "�ϲ���");
		AIRCURE_INDEX_DESC_CN_MAP.put("����", "����");
		AIRCURE_INDEX_DESC_CN_MAP.put("������", "������");
		AIRCURE_INDEX_DESC_TW_MAP = new HashMap<String, String>();
		AIRCURE_INDEX_DESC_TW_MAP.put("����", "�m��");
		AIRCURE_INDEX_DESC_TW_MAP.put("������", "�^�m��");
		AIRCURE_INDEX_DESC_TW_MAP.put("��̫����", "��̫�m��");
		AIRCURE_INDEX_DESC_TW_MAP.put("�ϲ���", "�^����");
		AIRCURE_INDEX_DESC_TW_MAP.put("����", "����");
		AIRCURE_INDEX_DESC_TW_MAP.put("������", "�O�m��");
		TRAVEL_INDEX_DESC_EN_MAP = new HashMap<String, String>();
		TRAVEL_INDEX_DESC_EN_MAP.put("����", "OK");
		TRAVEL_INDEX_DESC_EN_MAP.put("������", "Good");
		TRAVEL_INDEX_DESC_EN_MAP.put("�ϲ���", "Avoid if possible");
		TRAVEL_INDEX_DESC_EN_MAP.put("����", "Not recommended");
		TRAVEL_INDEX_DESC_EN_MAP.put("������", "Ideal");
		TRAVEL_INDEX_DESC_CN_MAP = new HashMap<String, String>();
		TRAVEL_INDEX_DESC_CN_MAP.put("����", "����");
		TRAVEL_INDEX_DESC_CN_MAP.put("������", "������");
		TRAVEL_INDEX_DESC_CN_MAP.put("�ϲ���", "�ϲ���");
		TRAVEL_INDEX_DESC_CN_MAP.put("����", "����");
		TRAVEL_INDEX_DESC_CN_MAP.put("������", "������");
		TRAVEL_INDEX_DESC_TW_MAP = new HashMap<String, String>();
		TRAVEL_INDEX_DESC_TW_MAP.put("����", "�m��");
		TRAVEL_INDEX_DESC_TW_MAP.put("������", "�^�m��");
		TRAVEL_INDEX_DESC_TW_MAP.put("�ϲ���", "�^����");
		TRAVEL_INDEX_DESC_TW_MAP.put("����", "����");
		TRAVEL_INDEX_DESC_TW_MAP.put("������", "�O�m��");
		ULTRAVIOLET_INDEX_DESC_EN_MAP = new HashMap<String, String>();
		ULTRAVIOLET_INDEX_DESC_EN_MAP.put("�е�", "Moderate");
		ULTRAVIOLET_INDEX_DESC_EN_MAP.put("����", "Weak");
		ULTRAVIOLET_INDEX_DESC_EN_MAP.put("��", "Medium");
		ULTRAVIOLET_INDEX_DESC_EN_MAP.put("ǿ", "Strong");
		ULTRAVIOLET_INDEX_DESC_EN_MAP.put("��ǿ", "Very strong");
		ULTRAVIOLET_INDEX_DESC_CN_MAP = new HashMap<String, String>();
		ULTRAVIOLET_INDEX_DESC_CN_MAP.put("�е�", "�е�");
		ULTRAVIOLET_INDEX_DESC_CN_MAP.put("����", "����");
		ULTRAVIOLET_INDEX_DESC_CN_MAP.put("��", "��");
		ULTRAVIOLET_INDEX_DESC_CN_MAP.put("ǿ", "ǿ");
		ULTRAVIOLET_INDEX_DESC_CN_MAP.put("��ǿ", "��ǿ");
		ULTRAVIOLET_INDEX_DESC_TW_MAP = new HashMap<String, String>();
		ULTRAVIOLET_INDEX_DESC_TW_MAP.put("�е�", "����");
		ULTRAVIOLET_INDEX_DESC_TW_MAP.put("����", "����");
		ULTRAVIOLET_INDEX_DESC_TW_MAP.put("��", "��");
		ULTRAVIOLET_INDEX_DESC_TW_MAP.put("ǿ", "��");
		ULTRAVIOLET_INDEX_DESC_TW_MAP.put("��ǿ", "�܏�");
		DRESS_INDEX_DESC_EN_MAP = new HashMap<String, String>();
		DRESS_INDEX_DESC_EN_MAP.put("��", "Cool");
		DRESS_INDEX_DESC_EN_MAP.put("����", "Comfortable");
		DRESS_INDEX_DESC_EN_MAP.put("������", "Good");
		DRESS_INDEX_DESC_EN_MAP.put("����", "Very hot");
		DRESS_INDEX_DESC_EN_MAP.put("��", "Hot");
		DRESS_INDEX_DESC_EN_MAP.put("ů", "Warm");
		DRESS_INDEX_DESC_EN_MAP.put("����", "Cool");
		DRESS_INDEX_DESC_EN_MAP.put("���½ϵ�", "Cooler");
		DRESS_INDEX_DESC_EN_MAP.put("��", "Cold");
		DRESS_INDEX_DESC_EN_MAP.put("����", "Freezing");
		DRESS_INDEX_DESC_CN_MAP = new HashMap();
		DRESS_INDEX_DESC_CN_MAP.put("��", "��");
		DRESS_INDEX_DESC_CN_MAP.put("����", "����");
		DRESS_INDEX_DESC_CN_MAP.put("������", "������");
		DRESS_INDEX_DESC_CN_MAP.put("����", "����");
		DRESS_INDEX_DESC_CN_MAP.put("��", "��");
		DRESS_INDEX_DESC_CN_MAP.put("ů", "ů");
		DRESS_INDEX_DESC_CN_MAP.put("����", "����");
		DRESS_INDEX_DESC_CN_MAP.put("���½ϵ�", "���½ϵ�");
		DRESS_INDEX_DESC_CN_MAP.put("��", "��");
		DRESS_INDEX_DESC_CN_MAP.put("����", "����");
		DRESS_INDEX_DESC_TW_MAP = new HashMap();
		DRESS_INDEX_DESC_TW_MAP.put("��", "��");
		DRESS_INDEX_DESC_TW_MAP.put("����", "���m");
		DRESS_INDEX_DESC_TW_MAP.put("������", "�^���m");
		DRESS_INDEX_DESC_TW_MAP.put("����", "�ן�");
		DRESS_INDEX_DESC_TW_MAP.put("��", "��");
		DRESS_INDEX_DESC_TW_MAP.put("ů", "ů");
		DRESS_INDEX_DESC_TW_MAP.put("����", "�؛�");
		DRESS_INDEX_DESC_TW_MAP.put("���½ϵ�", "����^��");
		DRESS_INDEX_DESC_TW_MAP.put("��", "��");
		DRESS_INDEX_DESC_TW_MAP.put("����", "����");
		COMFORT_INDEX_DESC_EN_MAP = new HashMap();
		COMFORT_INDEX_DESC_EN_MAP.put("������", "High");
		COMFORT_INDEX_DESC_EN_MAP.put("����", "Middle");
		COMFORT_INDEX_DESC_EN_MAP.put("�ϲ�����", "Low");
		COMFORT_INDEX_DESC_EN_MAP.put("�ܲ�����", "Not comfortable");
		COMFORT_INDEX_DESC_EN_MAP.put("����", "Not recommended");
		COMFORT_INDEX_DESC_EN_MAP.put("��������", "Suitable conditions");
		COMFORT_INDEX_DESC_EN_MAP.put("����", "Ideal conditions");
		COMFORT_INDEX_DESC_CN_MAP = new HashMap();
		COMFORT_INDEX_DESC_CN_MAP.put("������", "������");
		COMFORT_INDEX_DESC_CN_MAP.put("����", "����");
		COMFORT_INDEX_DESC_CN_MAP.put("�ϲ�����", "�ϲ�����");
		COMFORT_INDEX_DESC_CN_MAP.put("�ܲ�����", "�ܲ�����");
		COMFORT_INDEX_DESC_CN_MAP.put("����", "����");
		COMFORT_INDEX_DESC_CN_MAP.put("��������", "��������");
		COMFORT_INDEX_DESC_CN_MAP.put("����", "����");
		COMFORT_INDEX_DESC_TW_MAP = new HashMap<String, String>();
		COMFORT_INDEX_DESC_TW_MAP.put("������", "�^���m");
		COMFORT_INDEX_DESC_TW_MAP.put("����", "���m");
		COMFORT_INDEX_DESC_TW_MAP.put("�ϲ�����", "�^�����m");
		COMFORT_INDEX_DESC_TW_MAP.put("�ܲ�����", "�ܲ����m");
		COMFORT_INDEX_DESC_TW_MAP.put("����", "����");
		COMFORT_INDEX_DESC_TW_MAP.put("��������", "�����m��");
		COMFORT_INDEX_DESC_TW_MAP.put("����", "�m��");
		EXERCISE_INDEX_DETAIL_CN_MAP = new HashMap<String, String>();
		CARWASH_INDEX_DETAIL_CN_MAP = new HashMap<String, String>();
		AIRCURE_INDEX_DETAIL_CN_MAP = new HashMap<String, String>();
		TRAVEL_INDEX_DETAIL_CN_MAP = new HashMap<String, String>();
		ULTRAVIOLET_INDEX_DETAIL_CN_MAP = new HashMap<String, String>();
		DRESS_INDEX_DETAIL_CN_MAP = new HashMap<String, String>();
		COMFORT_INDEX_DETAIL_CN_MAP = new HashMap<String, String>();
		EXERCISE_INDEX_DETAIL_CN_MAP.put("����",
				"�������ʣ��������£����������Ĵ��ʱ�������鲻ͬ����ε����ǻ����μӻ��⽡����");
		EXERCISE_INDEX_DETAIL_CN_MAP.put("������",
				"�糿�������������˳��������鳿����װ��Ҫ���ڵ������з�ʱѡ��ܷ�ص㣬�Է���ð��");
		EXERCISE_INDEX_DETAIL_CN_MAP.put("�ϲ���",
				"�糿�����仯�ϴ󣬽ϲ��˳���������ֳ��������ʵ����ٳ���ʱ�䣬ע�Ᵽů��Я����ߡ�");
		EXERCISE_INDEX_DETAIL_CN_MAP.put("����",
				"�糿�����ܲ����⻧�⳿�����������������ʵ��������������彡����");
		EXERCISE_INDEX_DETAIL_CN_MAP.put("������",
				"�������ʣ��������£����������Ĵ��ʱ�������鲻ͬ����ε����ǻ����μӻ��⽡����");
		CARWASH_INDEX_DETAIL_CN_MAP.put("����",
				"����ϴ����δ�������������������Ϻã��ʺϲ�ϴ������������ơ���������������ĳ������սྻ��");
		CARWASH_INDEX_DETAIL_CN_MAP.put("������",
				"������ϴ����δ��һ�����꣬������С����ϴһ�µ����������ܱ���һ�졣");
		CARWASH_INDEX_DETAIL_CN_MAP.put("�ϲ���", "�ϲ���ϴ�������ִ���ϴ������Ҫ���ý�����ˮ������׼����");
		CARWASH_INDEX_DETAIL_CN_MAP.put("����",
				"����ϴ����δ��24Сʱ���������仯������ڴ��ڼ�ϴ�������ܻ��ٴ�Ū�����İ�����");
		CARWASH_INDEX_DETAIL_CN_MAP.put("������",
				"����ϴ����δ�������������������Ϻã��ʺϲ�ϴ������������ơ���������������ĳ������սྻ��");
		AIRCURE_INDEX_DETAIL_CN_MAP.put("����",
				"�������ƣ����ճ��㣬������ɹ���Ͻ��Ѿ�δ�������������������һ��̫����ζ���ɣ�");
		AIRCURE_INDEX_DETAIL_CN_MAP.put("������",
				"��������������ɹ���Ͻ��Ѿ�δ�������������������һ��̫����ζ���ɡ�");
		AIRCURE_INDEX_DETAIL_CN_MAP.put("��̫����", "�������ã���̫������ɹ������ʱע�������仯��");
		AIRCURE_INDEX_DETAIL_CN_MAP.put("�ϲ���",
				"ż���Ľ�����ܻ���ʪ��ɹ�������̫������ɹ������ʱע�������仯��");
		AIRCURE_INDEX_DETAIL_CN_MAP
				.put("����", "�н�ˮ����������ɹ���������ɹ���ɣ���������׼��������Ŀռ䡣");
		AIRCURE_INDEX_DETAIL_CN_MAP.put("������",
				"�������ƣ����ճ��㣬������ɹ���Ͻ��Ѿ�δ�������������������һ��̫����ζ���ɣ�");
		TRAVEL_INDEX_DETAIL_CN_MAP.put("����",
				"�������ʣ�����������¶����ˣ��Ǹ�������Ŷ���������������������Σ������Ծ�������ܴ���Ȼ�ķ�⡣");
		TRAVEL_INDEX_DETAIL_CN_MAP.put("������", "���������ºͣ������仯���󣬽��������Σ��ǳ�������ĺ�ʱ����");
		TRAVEL_INDEX_DETAIL_CN_MAP.put("�ϲ���", "�����仯�ϴ󣬻�����д����鷳�����黹�Ƕ�ѡ�������ڻ��");
		TRAVEL_INDEX_DETAIL_CN_MAP.put("����", "�����仯�ܴ󣬻�����д����ܶ��鷳�����黹�Ƕ�ѡ�������ڻ��");
		TRAVEL_INDEX_DETAIL_CN_MAP.put("������",
				"�������ʣ�����������¶����ˣ��Ǹ�������Ŷ���������������������Σ������Ծ�������ܴ���Ȼ�ķ�⡣");
		ULTRAVIOLET_INDEX_DETAIL_CN_MAP.put("�е�",
				"���е�ǿ�������߷������������ʱ����Ϳ��SPF����15��PA+�ķ�ɹ����Ʒ����ñ�ӡ�̫������");
		ULTRAVIOLET_INDEX_DETAIL_CN_MAP.put("����",
				"���������߷��������������ر�������������ڻ��⣬����Ϳ��SPF��8-12֮��ķ�ɹ����Ʒ��");
		ULTRAVIOLET_INDEX_DETAIL_CN_MAP.put("��",
				"������ǿ�Ƚ������������ǰͿ��SPF��12-15֮�䡢PA+�ķ�ɹ����Ʒ��");
		ULTRAVIOLET_INDEX_DETAIL_CN_MAP.put("ǿ",
				"�����߷���ǿ������Ϳ��SPF20���ҡ�PA++�ķ�ɹ����Ʒ��������10����14�㱩¶���չ��¡�");
		ULTRAVIOLET_INDEX_DETAIL_CN_MAP.put("��ǿ",
				"�����߷��伫ǿ������Ϳ��SPF20���ϡ�PA++�ķ�ɹ����Ʒ���������Ⱪ¶���չ��¡�");
		DRESS_INDEX_DETAIL_CN_MAP.put("��", "�����ű�����װ�ȴ������װ������������������װ��");
		DRESS_INDEX_DETAIL_CN_MAP.put("����", "�����ű�����װ�ȴ������װ������������������װ��");
		DRESS_INDEX_DETAIL_CN_MAP.put("������",
				"�����ű����ס�����ţ������ȷ�װ������������Ӧ�ʵ����������żп�������ë�µȡ�");
		DRESS_INDEX_DETAIL_CN_MAP.put("����",
				"�������ȣ������Ŷ�������ȹ���̿㡢����T������������������������ļ���װ��");
		DRESS_INDEX_DETAIL_CN_MAP.put("��",
				"�������ȣ������Ŷ�ȹ���̿㡢����װ��T�����ļ���װ���������������ų�������͵��㡣");
		DRESS_INDEX_DETAIL_CN_MAP.put("ů", "����ˬ�������ų���Ŀ�ȴ������װ�����������ų����������ס�");
		DRESS_INDEX_DETAIL_CN_MAP.put("����", "����ˬ�������ż��¼ӱ���ë���ȴ����װ�����������ż��¼���ë����");
		DRESS_INDEX_DETAIL_CN_MAP.put("���½ϵ�",
				"�������������ź����׼�ë�µȴ����װ���������������Ŵ��¡������׼���ë����");
		DRESS_INDEX_DETAIL_CN_MAP.put("��",
				"�����䣬���������¡�Ƥ�п˼���ë���ȶ�����װ���������������ź����»򶬴��¡�");
		DRESS_INDEX_DETAIL_CN_MAP.put("����",
				"�����䣬���������¡�Ƥ�п˼���ë���ȶ�����װ���������������ź����»򶬴��¡�");
		COMFORT_INDEX_DETAIL_CN_MAP.put("������", "�����¶Ƚ�Ϊ�ȶ��������仯��С����Ϊ����");
		COMFORT_INDEX_DETAIL_CN_MAP.put("����", "�����¶Ƚ�Ϊ�ȶ��������仯��С����Ϊ����");
		COMFORT_INDEX_DETAIL_CN_MAP.put("�ϲ�����",
				"������Ȼ��������Ϊ�������������ȣ�����ʪ�Ƚϴ�����е������ȣ��ܲ����ʡ�");
		COMFORT_INDEX_DETAIL_CN_MAP.put("�ܲ�����", "����������ã����¶Ȳ������ˣ������ܻ�е������ʡ�");
		COMFORT_INDEX_DETAIL_CN_MAP.put("����", "���������仯�ϴ󣬿��ܻ�������Щ�����ʡ�");
		COMFORT_INDEX_DETAIL_CN_MAP.put("��������",
				"���첻̫��Ҳ��̫�䣬�������������������������������£�Ӧ��е��Ƚ���ˬ�����ʡ�");
		COMFORT_INDEX_DETAIL_CN_MAP.put("����",
				"���첻̫��Ҳ��̫�䣬�������������������������������£�Ӧ��е��Ƚ���ˬ�����ʡ�");
		EXERCISE_INDEX_DETAIL_EN_MAP = new HashMap();
		CARWASH_INDEX_DETAIL_EN_MAP = new HashMap();
		AIRCURE_INDEX_DETAIL_EN_MAP = new HashMap();
		TRAVEL_INDEX_DETAIL_EN_MAP = new HashMap();
		ULTRAVIOLET_INDEX_DETAIL_EN_MAP = new HashMap();
		DRESS_INDEX_DETAIL_EN_MAP = new HashMap();
		COMFORT_INDEX_DETAIL_EN_MAP = new HashMap();
		EXERCISE_INDEX_DETAIL_EN_MAP.put("����",
				"It's a good day for morning exercises!");
		EXERCISE_INDEX_DETAIL_EN_MAP.put("������", "Bring additional layers!");
		EXERCISE_INDEX_DETAIL_EN_MAP.put("�ϲ���", "Bring additional layers!");
		EXERCISE_INDEX_DETAIL_EN_MAP.put("����", "Exercise indoors!");
		EXERCISE_INDEX_DETAIL_EN_MAP.put("������",
				"It's a good day for morning exercises!");
		CARWASH_INDEX_DETAIL_EN_MAP.put("����",
				"It's a good day to wash your car!");
		CARWASH_INDEX_DETAIL_EN_MAP.put("������",
				"It's a good day to wash your car.");
		CARWASH_INDEX_DETAIL_EN_MAP.put("�ϲ���", "Hold off on washing your car.");
		CARWASH_INDEX_DETAIL_EN_MAP.put("����", "Hold off on washing your car.");
		CARWASH_INDEX_DETAIL_EN_MAP.put("������",
				"It's a good day to wash your car!");
		AIRCURE_INDEX_DETAIL_EN_MAP.put("����",
				"The weather is suitable for drying clothes.");
		AIRCURE_INDEX_DETAIL_EN_MAP.put("������", "Good drying conditions.");
		AIRCURE_INDEX_DETAIL_EN_MAP.put("��̫����", "Dry your clothing indoors.");
		AIRCURE_INDEX_DETAIL_EN_MAP.put("�ϲ���", "Dry your clothing indoors.");
		AIRCURE_INDEX_DETAIL_EN_MAP.put("����", "Dry your clothing indoors.");
		AIRCURE_INDEX_DETAIL_EN_MAP.put("������", "Ideal drying conditions.");
		TRAVEL_INDEX_DETAIL_EN_MAP.put("����", "Clear, sunny, and comfortable!");
		TRAVEL_INDEX_DETAIL_EN_MAP.put("������", "Mild and stable temperatures.");
		TRAVEL_INDEX_DETAIL_EN_MAP.put("�ϲ���",
				"Today's weather will be volatile.");
		TRAVEL_INDEX_DETAIL_EN_MAP.put("����",
				"Today's weather will be volatile.");
		TRAVEL_INDEX_DETAIL_EN_MAP.put("������", "Clear, sunny, and comfortable!");
		ULTRAVIOLET_INDEX_DETAIL_EN_MAP.put("�е�",
				"Use sunscreen and wear hat and sunglasses when outdoors.");
		ULTRAVIOLET_INDEX_DETAIL_EN_MAP.put("����",
				"Use sunscreen and wear hat and sunglasses when outdoors.");
		ULTRAVIOLET_INDEX_DETAIL_EN_MAP.put("��",
				"Use sunscreen and wear hat and sunglasses when outdoors.");
		ULTRAVIOLET_INDEX_DETAIL_EN_MAP.put("ǿ",
				"Avoid sun if possible. Use sunscreen if you need to go out!");
		ULTRAVIOLET_INDEX_DETAIL_EN_MAP.put("��ǿ",
				"Avoid sun if possible. Use sunscreen if you need to go out");
		DRESS_INDEX_DETAIL_EN_MAP.put("��", "Light jacket.");
		DRESS_INDEX_DETAIL_EN_MAP.put("����", "Light jacket.");
		DRESS_INDEX_DETAIL_EN_MAP.put("������", "Light jacket.");
		DRESS_INDEX_DETAIL_EN_MAP.put("����", "Summer clothing.");
		DRESS_INDEX_DETAIL_EN_MAP.put("��", "Summer clothing.");
		DRESS_INDEX_DETAIL_EN_MAP.put("ů", "Light jacket.");
		DRESS_INDEX_DETAIL_EN_MAP.put("����",
				"Remember to bring additional layers!");
		DRESS_INDEX_DETAIL_EN_MAP.put("���½ϵ�", "Bring a jacket!");
		DRESS_INDEX_DETAIL_EN_MAP.put("��", "Bundle up!");
		DRESS_INDEX_DETAIL_EN_MAP.put("����", "Bundle up!");
		COMFORT_INDEX_DETAIL_EN_MAP.put("������", "Temperature will be stable.");
		COMFORT_INDEX_DETAIL_EN_MAP.put("����", "Temperature will be stable.");
		COMFORT_INDEX_DETAIL_EN_MAP
				.put("�ϲ�����", "Temperature will be volatile!");
		COMFORT_INDEX_DETAIL_EN_MAP.put("�ܲ�����", "Hot and humid! :(");
		COMFORT_INDEX_DETAIL_EN_MAP.put("����", "Temperature will be volatile!");
		COMFORT_INDEX_DETAIL_EN_MAP.put("��������", "Cool and comfortable.");
		COMFORT_INDEX_DETAIL_EN_MAP.put("����", "Cool and comfortable.");
		EXERCISE_INDEX_DETAIL_TW_MAP = new HashMap();
		CARWASH_INDEX_DETAIL_TW_MAP = new HashMap();
		AIRCURE_INDEX_DETAIL_TW_MAP = new HashMap();
		TRAVEL_INDEX_DETAIL_TW_MAP = new HashMap();
		ULTRAVIOLET_INDEX_DETAIL_TW_MAP = new HashMap();
		DRESS_INDEX_DETAIL_TW_MAP = new HashMap();
		COMFORT_INDEX_DETAIL_TW_MAP = new HashMap();
		EXERCISE_INDEX_DETAIL_TW_MAP.put("����",
				"������ʣ��՚����£����������Ĵ�Õr�C�����h��ͬ���g�ε��˂��e�O���ӑ��⽡���ӡ�");
		EXERCISE_INDEX_DETAIL_TW_MAP.put("������",
				"�糿����l���^�m�˳��������h�������b��Ҫ�^춆α������L�r�x����L���c���Է���ð��");
		EXERCISE_INDEX_DETAIL_TW_MAP.put("�ϲ���",
				"�糿���׃���^���^���˳�������Գֳ�����Ո�m���p�ٳ����r�g��ע�Ᵽů�K�y����ߡ�");
		EXERCISE_INDEX_DETAIL_TW_MAP.put("����",
				"�糿���ܲՈ������⳿�������h���҃����m��呟����������w������");
		EXERCISE_INDEX_DETAIL_TW_MAP.put("������",
				"������ʣ��՚����£����������Ĵ�Õr�C�����h��ͬ���g�ε��˂��e�O���ӑ��⽡���ӡ�");
		CARWASH_INDEX_DETAIL_TW_MAP.put("����",
				"�m��ϴ܇��δ����m����o������^�ã��m�ϲ�ϴ��܇���{���녡��L��������������܇���B�՝��Q��");
		CARWASH_INDEX_DETAIL_TW_MAP.put("������",
				"�^�m��ϴ܇��δ��һ��o�꣬�L���^С����ϴһ�µ���܇�����ܱ���һ�졣");
		CARWASH_INDEX_DETAIL_TW_MAP.put("�ϲ���", "�^����ϴ܇����������ϴ��܇��Ҫ���ÞR����ˮ������ʂ䡣");
		CARWASH_INDEX_DETAIL_TW_MAP.put("����",
				"����ϴ܇��δ��24С�r�������׃��������ڴ����gϴ܇�����ܕ��ٴ�Ū�v���Đ�܇��");
		CARWASH_INDEX_DETAIL_TW_MAP.put("������",
				"�m��ϴ܇��δ����m����o������^�ã��m�ϲ�ϴ��܇���{���녡��L��������������܇���B�՝��Q��");
		AIRCURE_INDEX_DETAIL_TW_MAP.put("����",
				"�f��o녣����ճ��㣬�m�������s�o�Ѿ�δҊꖹ��������������һ��̫ꖵ�ζ���ɣ�");
		AIRCURE_INDEX_DETAIL_TW_MAP.put("������",
				"��ⲻ�e���m�������s�o�Ѿ�δҊꖹ��������������һ��̫ꖵ�ζ���ɡ�");
		AIRCURE_INDEX_DETAIL_TW_MAP.put("��̫�m��", "��ⲻ�ã���̫�m������Ո�S�rע�����׃����");
		AIRCURE_INDEX_DETAIL_TW_MAP.put("�ϲ���",
				"ż���Ľ�����ܕ��ܝ�����������̫�m������Ո�S�rע�����׃����");
		AIRCURE_INDEX_DETAIL_TW_MAP
				.put("����", "�н�ˮ�����m��������������񲻿ɣ�Ո���҃Ȝʂ������Ŀ��g��");
		AIRCURE_INDEX_DETAIL_TW_MAP.put("������",
				"�f��o녣����ճ��㣬�m�������s�o�Ѿ�δҊꖹ��������������һ��̫ꖵ�ζ���ɣ�");
		TRAVEL_INDEX_DETAIL_TW_MAP.put("����",
				"������ʣ��L���������ض��m�ˣ��ǂ������Ŷ���@�ӵ������m�����[�������ԱM������ܴ���Ȼ���L�⡣");
		TRAVEL_INDEX_DETAIL_TW_MAP.put("������", "������غͣ����׃�������^�m�����[���ǳ����[��ĺÕr�C��");
		TRAVEL_INDEX_DETAIL_TW_MAP.put("�ϲ���", "���׃���^�󣬕��o���Ў����韩�����h߀�Ƕ��x�����҃Ȼ�ӣ�");
		TRAVEL_INDEX_DETAIL_TW_MAP.put("����", "���׃���ܴ󣬕��o���Ў���ܶ��韩�����h߀�Ƕ��x�����҃Ȼ�ӣ�");
		TRAVEL_INDEX_DETAIL_TW_MAP.put("������",
				"������ʣ��L���������ض��m�ˣ��ǂ������Ŷ���@�ӵ������m�����[�������ԱM������ܴ���Ȼ���L�⡣");
		ULTRAVIOLET_INDEX_DETAIL_TW_MAP.put("�е�",
				"���еȏ������⾀ݗ����⣬����r���h�T��SPF���15��PA+�ķ����o�wƷ����ñ�ӡ�̫��R��");
		ULTRAVIOLET_INDEX_DETAIL_TW_MAP.put("����",
				"�������⾀ݗ����⣬�o���؄e���o�����L���ڑ��⣬���h�T��SPF��8-12֮�g�ķ����o�wƷ��");
		ULTRAVIOLET_INDEX_DETAIL_TW_MAP.put("��",
				"���⾀�����^�������h���Tǰ�T��SPF��12-15֮�g��PA+�ķ����o�wƷ��");
		ULTRAVIOLET_INDEX_DETAIL_TW_MAP.put("ǿ",
				"���⾀ݗ�䏊�����h�T��SPF20���ҡ�PA++�ķ����o�wƷ��������10�c��14�c��¶��չ��¡�");
		ULTRAVIOLET_INDEX_DETAIL_TW_MAP.put("��ǿ",
				"���⾀ݗ��O�������h�T��SPF20���ϡ�PA++�ķ����o�wƷ���M�����Ⱪ¶��չ��¡�");
		DRESS_INDEX_DETAIL_TW_MAP.put("��", "���h���������b�ȴ����^���b�������w�����������b��");
		DRESS_INDEX_DETAIL_TW_MAP.put("����", "���h���������b�ȴ����^���b�������w�����������b��");
		DRESS_INDEX_DETAIL_TW_MAP.put("������",
				"���h�������ס��_��ţ����ѝ�ȷ��b�������w���ߑ��m�������������A��������ë�µȡ�");
		DRESS_INDEX_DETAIL_TW_MAP.put("����",
				"����ןᣬ���h����������ȹ����ѝ������T���������I��������������ļ����b��");
		DRESS_INDEX_DETAIL_TW_MAP.put("��",
				"����^�ᣬ���h����ȹ����ѝ�������b��T�����ļ����b�������w���������L���r���͆�ѝ��");
		DRESS_INDEX_DETAIL_TW_MAP.put("ů", "�^��ˬ�����h���L���rѝ�ȴ����^���b���w���������L���r�����R�ס�");
		DRESS_INDEX_DETAIL_TW_MAP.put("����", "�^��ˬ�����h���W�¼ӱ���ë���ȴ�����b���w���������W�¼���ë����");
		DRESS_INDEX_DETAIL_TW_MAP.put("���½ϵ�",
				"���������h�������׼�ë�µȴ�����b�������w�����������¡������׼���ë����");
		DRESS_INDEX_DETAIL_TW_MAP.put("��",
				"����䣬���h�����¡�Ƥ�A�˼���ë���ȶ������b�������w�������������»򶬴��¡�");
		DRESS_INDEX_DETAIL_TW_MAP.put("����",
				"����䣬���h�����¡�Ƥ�A�˼���ë���ȶ������b�������w�������������»򶬴��¡�");
		COMFORT_INDEX_DETAIL_TW_MAP.put("������", "���՜ض��^�鷀�������׃���^С���^�����m");
		COMFORT_INDEX_DETAIL_TW_MAP.put("����", "���՜ض��^�鷀�������׃���^С���^�����m");
		COMFORT_INDEX_DETAIL_TW_MAP.put("�ϲ�����",
				"�����mȻ�����ꎞ������������ᣬ���ϝ���^�������е��ܐ��ᣬ�ܲ����m��");
		COMFORT_INDEX_DETAIL_TW_MAP.put("�ܲ�����", "���������ã����ضȲ����m�ˣ������ܕ��е������m��");
		COMFORT_INDEX_DETAIL_TW_MAP.put("����", "�������׃���^�󣬿��ܕ�������Щ�����m��");
		COMFORT_INDEX_DETAIL_TW_MAP.put("��������",
				"���첻̫��Ҳ��̫�䣬�L���������������@�ӵ����l���£������е����^��ˬ�����m��");
		COMFORT_INDEX_DETAIL_TW_MAP.put("����",
				"���첻̫��Ҳ��̫�䣬�L���������������@�ӵ����l���£������е����^��ˬ�����m��");
		INDEX_DETAIL_CN_MAP = new HashMap();
		INDEX_DETAIL_CN_MAP.put("����ָ��", DRESS_INDEX_DETAIL_CN_MAP);
		INDEX_DETAIL_CN_MAP.put("48Сʱ����ָ��", DRESS_INDEX_DETAIL_CN_MAP);
		INDEX_DETAIL_CN_MAP.put("ϴ��ָ��", CARWASH_INDEX_DETAIL_CN_MAP);
		INDEX_DETAIL_CN_MAP.put("����ָ��", TRAVEL_INDEX_DETAIL_CN_MAP);
		INDEX_DETAIL_CN_MAP.put("������ָ��", ULTRAVIOLET_INDEX_DETAIL_CN_MAP);
		INDEX_DETAIL_CN_MAP.put("48Сʱ������ָ��", ULTRAVIOLET_INDEX_DETAIL_CN_MAP);
		INDEX_DETAIL_CN_MAP.put("��ɹָ��", AIRCURE_INDEX_DETAIL_CN_MAP);
		INDEX_DETAIL_CN_MAP.put("����ָ��", EXERCISE_INDEX_DETAIL_CN_MAP);
		INDEX_DETAIL_CN_MAP.put("���ʶ�ָ��", COMFORT_INDEX_DETAIL_CN_MAP);
		INDEX_DETAIL_EN_MAP = new HashMap();
		INDEX_DETAIL_EN_MAP.put("����ָ��", DRESS_INDEX_DETAIL_EN_MAP);
		INDEX_DETAIL_EN_MAP.put("48Сʱ����ָ��", DRESS_INDEX_DETAIL_EN_MAP);
		INDEX_DETAIL_EN_MAP.put("ϴ��ָ��", CARWASH_INDEX_DETAIL_EN_MAP);
		INDEX_DETAIL_EN_MAP.put("����ָ��", TRAVEL_INDEX_DETAIL_EN_MAP);
		INDEX_DETAIL_EN_MAP.put("������ָ��", ULTRAVIOLET_INDEX_DETAIL_EN_MAP);
		INDEX_DETAIL_EN_MAP.put("48Сʱ������ָ��", ULTRAVIOLET_INDEX_DETAIL_EN_MAP);
		INDEX_DETAIL_EN_MAP.put("��ɹָ��", AIRCURE_INDEX_DETAIL_EN_MAP);
		INDEX_DETAIL_EN_MAP.put("����ָ��", EXERCISE_INDEX_DETAIL_EN_MAP);
		INDEX_DETAIL_EN_MAP.put("���ʶ�ָ��", COMFORT_INDEX_DETAIL_EN_MAP);
		INDEX_DETAIL_TW_MAP = new HashMap();
		INDEX_DETAIL_TW_MAP.put("����ָ��", DRESS_INDEX_DETAIL_TW_MAP);
		INDEX_DETAIL_TW_MAP.put("48Сʱ����ָ��", DRESS_INDEX_DETAIL_TW_MAP);
		INDEX_DETAIL_TW_MAP.put("ϴ��ָ��", CARWASH_INDEX_DETAIL_TW_MAP);
		INDEX_DETAIL_TW_MAP.put("����ָ��", TRAVEL_INDEX_DETAIL_TW_MAP);
		INDEX_DETAIL_TW_MAP.put("������ָ��", ULTRAVIOLET_INDEX_DETAIL_TW_MAP);
		INDEX_DETAIL_TW_MAP.put("48Сʱ������ָ��", ULTRAVIOLET_INDEX_DETAIL_TW_MAP);
		INDEX_DETAIL_TW_MAP.put("��ɹָ��", AIRCURE_INDEX_DETAIL_TW_MAP);
		INDEX_DETAIL_TW_MAP.put("����ָ��", EXERCISE_INDEX_DETAIL_TW_MAP);
		INDEX_DETAIL_TW_MAP.put("���ʶ�ָ��", COMFORT_INDEX_DETAIL_TW_MAP);
		INDEX_DESC_CN_MAP = new HashMap();
		INDEX_DESC_CN_MAP.put("����ָ��", DRESS_INDEX_DESC_CN_MAP);
		INDEX_DESC_CN_MAP.put("48Сʱ����ָ��", DRESS_INDEX_DESC_CN_MAP);
		INDEX_DESC_CN_MAP.put("ϴ��ָ��", CARWASH_INDEX_DESC_CN_MAP);
		INDEX_DESC_CN_MAP.put("����ָ��", TRAVEL_INDEX_DESC_CN_MAP);
		INDEX_DESC_CN_MAP.put("������ָ��", ULTRAVIOLET_INDEX_DESC_CN_MAP);
		INDEX_DESC_CN_MAP.put("48Сʱ������ָ��", ULTRAVIOLET_INDEX_DESC_CN_MAP);
		INDEX_DESC_CN_MAP.put("��ɹָ��", AIRCURE_INDEX_DESC_CN_MAP);
		INDEX_DESC_CN_MAP.put("����ָ��", EXERCISE_INDEX_DESC_CN_MAP);
		INDEX_DESC_CN_MAP.put("���ʶ�ָ��", COMFORT_INDEX_DESC_CN_MAP);
		INDEX_DESC_EN_MAP = new HashMap();
		INDEX_DESC_EN_MAP.put("����ָ��", DRESS_INDEX_DESC_EN_MAP);
		INDEX_DESC_EN_MAP.put("48Сʱ����ָ��", DRESS_INDEX_DESC_EN_MAP);
		INDEX_DESC_EN_MAP.put("ϴ��ָ��", CARWASH_INDEX_DESC_EN_MAP);
		INDEX_DESC_EN_MAP.put("����ָ��", TRAVEL_INDEX_DESC_EN_MAP);
		INDEX_DESC_EN_MAP.put("������ָ��", ULTRAVIOLET_INDEX_DESC_EN_MAP);
		INDEX_DESC_EN_MAP.put("48Сʱ������ָ��", ULTRAVIOLET_INDEX_DESC_EN_MAP);
		INDEX_DESC_EN_MAP.put("��ɹָ��", AIRCURE_INDEX_DESC_EN_MAP);
		INDEX_DESC_EN_MAP.put("����ָ��", EXERCISE_INDEX_DESC_EN_MAP);
		INDEX_DESC_EN_MAP.put("���ʶ�ָ��", COMFORT_INDEX_DESC_EN_MAP);
		INDEX_DESC_TW_MAP = new HashMap();
		INDEX_DESC_TW_MAP.put("����ָ��", DRESS_INDEX_DESC_TW_MAP);
		INDEX_DESC_TW_MAP.put("48Сʱ����ָ��", DRESS_INDEX_DESC_TW_MAP);
		INDEX_DESC_TW_MAP.put("ϴ��ָ��", CARWASH_INDEX_DESC_TW_MAP);
		INDEX_DESC_TW_MAP.put("����ָ��", TRAVEL_INDEX_DESC_TW_MAP);
		INDEX_DESC_TW_MAP.put("������ָ��", ULTRAVIOLET_INDEX_DESC_TW_MAP);
		INDEX_DESC_TW_MAP.put("48Сʱ������ָ��", ULTRAVIOLET_INDEX_DESC_TW_MAP);
		INDEX_DESC_TW_MAP.put("��ɹָ��", AIRCURE_INDEX_DESC_TW_MAP);
		INDEX_DESC_TW_MAP.put("����ָ��", EXERCISE_INDEX_DESC_TW_MAP);
		INDEX_DESC_TW_MAP.put("���ʶ�ָ��", COMFORT_INDEX_DESC_TW_MAP);
		INDEX_EN_MAP = new HashMap();
		INDEX_EN_MAP.put("����ָ��", "Clothing");
		INDEX_EN_MAP.put("48Сʱ����ָ��", "48 hours Clothing");
		INDEX_EN_MAP.put("ϴ��ָ��", "Car wash index");
		INDEX_EN_MAP.put("����ָ��", "Leisure");
		INDEX_EN_MAP.put("������ָ��", "UV index");
		INDEX_EN_MAP.put("48Сʱ������ָ��", "48 hours UV index");
		INDEX_EN_MAP.put("��ɹָ��", "Drying index");
		INDEX_EN_MAP.put("����ָ��", "Morning exercise");
		INDEX_EN_MAP.put("���ʶ�ָ��", "Comfort");
		INDEX_CN_MAP = new HashMap();
		INDEX_CN_MAP.put("����ָ��", "����ָ��");
		INDEX_CN_MAP.put("48Сʱ����ָ��", "48Сʱ����ָ��");
		INDEX_CN_MAP.put("ϴ��ָ��", "ϴ��ָ��");
		INDEX_CN_MAP.put("����ָ��", "����ָ��");
		INDEX_CN_MAP.put("������ָ��", "������ָ��");
		INDEX_CN_MAP.put("48Сʱ������ָ��", "48Сʱ������ָ��");
		INDEX_CN_MAP.put("��ɹָ��", "��ɹָ��");
		INDEX_CN_MAP.put("����ָ��", "����ָ��");
		INDEX_CN_MAP.put("���ʶ�ָ��", "���ʶ�ָ��");
		INDEX_TW_MAP = new HashMap();
		INDEX_TW_MAP.put("����ָ��", "����ָ��");
		INDEX_TW_MAP.put("48Сʱ����ָ��", "48Сʱ����ָ��");
		INDEX_TW_MAP.put("ϴ��ָ��", "ϴ܇ָ��");
		INDEX_TW_MAP.put("����ָ��", "���[ָ��");
		INDEX_TW_MAP.put("������ָ��", "���⾀");
		INDEX_TW_MAP.put("48Сʱ������ָ��", "48Сʱ���⾀");
		INDEX_TW_MAP.put("��ɹָ��", "����ָ��");
		INDEX_TW_MAP.put("����ָ��", "����ָ��");
		INDEX_TW_MAP.put("���ʶ�ָ��", "���mָ��");
		SURPORTTED_LANGUAGE_LIST = new ArrayList();
		SURPORTTED_LANGUAGE_LIST.add(Locale.US.toString().toLowerCase());
		SURPORTTED_LANGUAGE_LIST.add(Locale.CHINA.toString().toLowerCase());
		SURPORTTED_LANGUAGE_LIST.add(Locale.TAIWAN.toString().toLowerCase());
		INDEX_LANGUAGE_MAP = new HashMap();
		INDEX_LANGUAGE_MAP
				.put(Locale.US.toString().toLowerCase(), INDEX_EN_MAP);
		INDEX_LANGUAGE_MAP.put(Locale.CHINA.toString().toLowerCase(),
				INDEX_CN_MAP);
		INDEX_LANGUAGE_MAP.put(Locale.TAIWAN.toString().toLowerCase(),
				INDEX_TW_MAP);
		INDEX_DESC_LANGUAGE_MAP = new HashMap();
		INDEX_DESC_LANGUAGE_MAP.put(Locale.US.toString().toLowerCase(),
				INDEX_DESC_EN_MAP);
		INDEX_DESC_LANGUAGE_MAP.put(Locale.CHINA.toString().toLowerCase(),
				INDEX_DESC_CN_MAP);
		INDEX_DESC_LANGUAGE_MAP.put(Locale.TAIWAN.toString().toLowerCase(),
				INDEX_DESC_TW_MAP);
		EXERCISE_INDEX_DESC_LANGUAGE_MAP = new HashMap();
		EXERCISE_INDEX_DESC_LANGUAGE_MAP.put(
				Locale.US.toString().toLowerCase(), EXERCISE_INDEX_DESC_EN_MAP);
		EXERCISE_INDEX_DESC_LANGUAGE_MAP.put(Locale.CHINA.toString()
				.toLowerCase(), EXERCISE_INDEX_DESC_CN_MAP);
		EXERCISE_INDEX_DESC_LANGUAGE_MAP.put(Locale.TAIWAN.toString()
				.toLowerCase(), EXERCISE_INDEX_DESC_TW_MAP);
		CARWASH_INDEX_DESC_LANGUAGE_MAP = new HashMap();
		CARWASH_INDEX_DESC_LANGUAGE_MAP.put(Locale.US.toString().toLowerCase(),
				CARWASH_INDEX_DESC_EN_MAP);
		CARWASH_INDEX_DESC_LANGUAGE_MAP.put(Locale.CHINA.toString()
				.toLowerCase(), CARWASH_INDEX_DESC_CN_MAP);
		CARWASH_INDEX_DESC_LANGUAGE_MAP.put(Locale.TAIWAN.toString()
				.toLowerCase(), CARWASH_INDEX_DESC_TW_MAP);
		AIRCURE_INDEX_DESC_LANGUAGE_MAP = new HashMap();
		AIRCURE_INDEX_DESC_LANGUAGE_MAP.put(Locale.US.toString().toLowerCase(),
				AIRCURE_INDEX_DESC_EN_MAP);
		AIRCURE_INDEX_DESC_LANGUAGE_MAP.put(Locale.CHINA.toString()
				.toLowerCase(), AIRCURE_INDEX_DESC_CN_MAP);
		AIRCURE_INDEX_DESC_LANGUAGE_MAP.put(Locale.TAIWAN.toString()
				.toLowerCase(), AIRCURE_INDEX_DESC_TW_MAP);
		ULTRAVIOLET_INDEX_DESC_LANGUAGE_MAP = new HashMap();
		ULTRAVIOLET_INDEX_DESC_LANGUAGE_MAP.put(Locale.US.toString()
				.toLowerCase(), ULTRAVIOLET_INDEX_DESC_EN_MAP);
		ULTRAVIOLET_INDEX_DESC_LANGUAGE_MAP.put(Locale.CHINA.toString()
				.toLowerCase(), ULTRAVIOLET_INDEX_DESC_CN_MAP);
		ULTRAVIOLET_INDEX_DESC_LANGUAGE_MAP.put(Locale.TAIWAN.toString()
				.toLowerCase(), ULTRAVIOLET_INDEX_DESC_TW_MAP);
		DRESS_INDEX_DESC_LANGUAGE_MAP = new HashMap();
		DRESS_INDEX_DESC_LANGUAGE_MAP.put(Locale.US.toString().toLowerCase(),
				DRESS_INDEX_DESC_EN_MAP);
		DRESS_INDEX_DESC_LANGUAGE_MAP.put(
				Locale.CHINA.toString().toLowerCase(), DRESS_INDEX_DESC_CN_MAP);
		DRESS_INDEX_DESC_LANGUAGE_MAP.put(Locale.TAIWAN.toString()
				.toLowerCase(), DRESS_INDEX_DESC_TW_MAP);
		COMFORT_INDEX_DESC_LANGUAGE_MAP = new HashMap();
		COMFORT_INDEX_DESC_LANGUAGE_MAP.put(Locale.US.toString().toLowerCase(),
				COMFORT_INDEX_DESC_EN_MAP);
		COMFORT_INDEX_DESC_LANGUAGE_MAP.put(Locale.CHINA.toString()
				.toLowerCase(), COMFORT_INDEX_DESC_CN_MAP);
		COMFORT_INDEX_DESC_LANGUAGE_MAP.put(Locale.TAIWAN.toString()
				.toLowerCase(), COMFORT_INDEX_DESC_TW_MAP);
		TRAVEL_INDEX_DESC_LANGUAGE_MAP = new HashMap();
		TRAVEL_INDEX_DESC_LANGUAGE_MAP.put(Locale.US.toString().toLowerCase(),
				TRAVEL_INDEX_DESC_EN_MAP);
		TRAVEL_INDEX_DESC_LANGUAGE_MAP.put(Locale.CHINA.toString()
				.toLowerCase(), TRAVEL_INDEX_DESC_CN_MAP);
		TRAVEL_INDEX_DESC_LANGUAGE_MAP.put(Locale.TAIWAN.toString()
				.toLowerCase(), TRAVEL_INDEX_DESC_TW_MAP);
		INDEX_DETAIL_LANGUAGE_MAP = new HashMap();
		INDEX_DETAIL_LANGUAGE_MAP.put(Locale.US.toString().toLowerCase(),
				INDEX_DETAIL_EN_MAP);
		INDEX_DETAIL_LANGUAGE_MAP.put(Locale.CHINA.toString().toLowerCase(),
				INDEX_DETAIL_CN_MAP);
		INDEX_DETAIL_LANGUAGE_MAP.put(Locale.TAIWAN.toString().toLowerCase(),
				INDEX_DETAIL_TW_MAP);
		EXERCISE_INDEX_DETAIL_LANGUAGE_MAP = new HashMap();
		CARWASH_INDEX_DETAIL_LANGUAGE_MAP = new HashMap();
		AIRCURE_INDEX_DETAIL_LANGUAGE_MAP = new HashMap();
		ULTRAVIOLET_INDEX_DETAIL_LANGUAGE_MAP = new HashMap();
		DRESS_INDEX_DETAIL_LANGUAGE_MAP = new HashMap();
		COMFORT_INDEX_DETAIL_LANGUAGE_MAP = new HashMap();
		TRAVEL_INDEX_DETAIL_LANGUAGE_MAP = new HashMap();
		AQI_LEVEL_CN_MAP = new HashMap();
		AQI_LEVEL_CN_MAP.put(Integer.valueOf(0), "����Ⱦ");
		AQI_LEVEL_CN_MAP.put(Integer.valueOf(50), "��");
		AQI_LEVEL_CN_MAP.put(Integer.valueOf(100), "��");
		AQI_LEVEL_CN_MAP.put(Integer.valueOf(150), "�����Ⱦ");
		AQI_LEVEL_CN_MAP.put(Integer.valueOf(200), "�ж���Ⱦ");
		AQI_LEVEL_CN_MAP.put(Integer.valueOf(300), "�ض���Ⱦ");
		AQI_LEVEL_CN_MAP.put(Integer.valueOf(500), "������Ⱦ");
		AQI_LEVEL_EN_MAP = new HashMap();
		AQI_LEVEL_EN_MAP.put(Integer.valueOf(0), "Excellent");
		AQI_LEVEL_EN_MAP.put(Integer.valueOf(50), "Good");
		AQI_LEVEL_EN_MAP.put(Integer.valueOf(100), "Moderate");
		AQI_LEVEL_EN_MAP.put(Integer.valueOf(150), "Caution");
		AQI_LEVEL_EN_MAP.put(Integer.valueOf(200), "Unhealthy");
		AQI_LEVEL_EN_MAP.put(Integer.valueOf(300), "Dangerous");
		AQI_LEVEL_EN_MAP.put(Integer.valueOf(500), "Hazardous");
		AQI_LEVEL_TW_MAP = new HashMap();
		AQI_LEVEL_TW_MAP.put(Integer.valueOf(0), "�ޛ@Ⱦ");
		AQI_LEVEL_TW_MAP.put(Integer.valueOf(50), "��");
		AQI_LEVEL_TW_MAP.put(Integer.valueOf(100), "��");
		AQI_LEVEL_TW_MAP.put(Integer.valueOf(150), "�p�ț@Ⱦ");
		AQI_LEVEL_TW_MAP.put(Integer.valueOf(200), "�жț@Ⱦ");
		AQI_LEVEL_TW_MAP.put(Integer.valueOf(300), "�ضț@Ⱦ");
		AQI_LEVEL_TW_MAP.put(Integer.valueOf(500), "���؛@Ⱦ");
		AQI_LEVEL_LANGUAGE_MAP = new HashMap();
		AQI_LEVEL_LANGUAGE_MAP.put(Locale.US.toString().toLowerCase(),
				AQI_LEVEL_EN_MAP);
		AQI_LEVEL_LANGUAGE_MAP.put(Locale.CHINA.toString().toLowerCase(),
				AQI_LEVEL_CN_MAP);
		AQI_LEVEL_LANGUAGE_MAP.put(Locale.TAIWAN.toString().toLowerCase(),
				AQI_LEVEL_TW_MAP);
		AQI_DESC_CN_MAP = new HashMap();
		AQI_DESC_CN_MAP.put(Integer.valueOf(0), "������Ⱥ���ڻ����������ɻ��");
		AQI_DESC_CN_MAP.put(Integer.valueOf(50), "������Ⱥ���ڻ����������ɻ��");
		AQI_DESC_CN_MAP.put(Integer.valueOf(100), "�Կ��������ر����е���ȺӦ�ü��ٻ�����");
		AQI_DESC_CN_MAP.put(Integer.valueOf(150),
				"��ͯ�����˼����ࡢ����ϵͳ����������ȺӦ�ü��ٳ�ʱ�䡢��ǿ�ȵĻ��������");
		AQI_DESC_CN_MAP.put(Integer.valueOf(200),
				"��ͯ�����˼����ࡢ����ϵͳ����������ȺӦ�ü��ٳ�ʱ�䡢��ǿ�ȵĻ��������һ����Ⱥ�������ٻ����˶���");
		AQI_DESC_CN_MAP.put(Integer.valueOf(300),
				"��ͯ�����˼����ࡢ����ϵͳ����������ȺӦͣ�������ڣ�ֹͣ�����˶���һ����Ⱥ���ٻ����˶���");
		AQI_DESC_CN_MAP.put(Integer.valueOf(500),
				"��ͯ�����˼����ࡢ����ϵͳ����������ȺӦͣ�������ڣ��������������һ����ȺӦ�ñ��⻧����ע�������");
		AQI_DESC_EN_MAP = new HashMap();
		AQI_DESC_EN_MAP.put(Integer.valueOf(0),
				"It's a great day to be active outside!");
		AQI_DESC_EN_MAP.put(Integer.valueOf(50),
				"It's a great day to be active outside!");
		AQI_DESC_EN_MAP
				.put(Integer.valueOf(100),
						"People with preexisting medical conditions should reduce prolonged or heavy exertion.");
		AQI_DESC_EN_MAP
				.put(Integer.valueOf(150),
						"People with heart or lung disease, older adults, and young children should reduce prolonged or heavy exertion.");
		AQI_DESC_EN_MAP.put(Integer.valueOf(200),
				"Reduce prolonged or heavy exertion.");
		AQI_DESC_EN_MAP.put(Integer.valueOf(300),
				"Avoid prolonged or heavy exertion.");
		AQI_DESC_EN_MAP.put(Integer.valueOf(500),
				"Remain indoors and reduce your level of activity.");
		AQI_DESC_TW_MAP = new HashMap();
		AQI_DESC_TW_MAP.put(Integer.valueOf(0), "������Ⱥ���ڑ����������ɻ�ӡ�");
		AQI_DESC_TW_MAP.put(Integer.valueOf(50), "������Ⱥ���ڑ����������ɻ�ӡ�");
		AQI_DESC_TW_MAP.put(Integer.valueOf(100), "���՚��|���؄e���е���Ⱥ��ԓ�p�ّ����ӡ�");
		AQI_DESC_TW_MAP.put(Integer.valueOf(150),
				"��ͯ�����˼����K������ϵ�y����������Ⱥ��ԓ�p���L�r�g���ߏ��ȵđ���呟���");
		AQI_DESC_TW_MAP.put(Integer.valueOf(200),
				"��ͯ�����˼����K������ϵ�y����������Ⱥ��ԓ�p���L�r�g���ߏ��ȵđ���呟���һ����Ⱥ�m���p�ّ����\�ӡ�");
		AQI_DESC_TW_MAP.put(Integer.valueOf(300),
				"��ͯ�����˼����K������ϵ�y����������Ⱥ��ͣ�����҃ȣ�ֹͣ�����\�ӣ�һ����Ⱥ�p�ّ����\�ӡ�");
		AQI_DESC_TW_MAP.put(Integer.valueOf(500),
				"��ͯ�����˼����K������ϵ�y����������Ⱥ��ͣ�����҃ȣ��K�p���w����ӣ�һ����Ⱥ��ԓ��������ӁKע����o��");
		AQI_DESC_LANGUAGE_MAP = new HashMap();
		AQI_DESC_LANGUAGE_MAP.put(Locale.US.toString().toLowerCase(),
				AQI_DESC_EN_MAP);
		AQI_DESC_LANGUAGE_MAP.put(Locale.CHINA.toString().toLowerCase(),
				AQI_DESC_CN_MAP);
		AQI_DESC_LANGUAGE_MAP.put(Locale.TAIWAN.toString().toLowerCase(),
				AQI_DESC_TW_MAP);
		AQI_SOURCE_LANGUAGE_MAP = new HashMap();
		AQI_SOURCE_LANGUAGE_MAP.put(Locale.US.toString().toLowerCase(),
				"China National Environmental Monitoring Center");
		AQI_SOURCE_LANGUAGE_MAP.put(Locale.CHINA.toString().toLowerCase(),
				"�й����������վ");
		AQI_SOURCE_LANGUAGE_MAP.put(Locale.TAIWAN.toString().toLowerCase(),
				"�Ї��h���O�y��վ");
		PROVINCE_FAKE_CITY_MAP = new HashMap<String,String>();
		PROVINCE_FAKE_CITY_MAP.put("101050000", "������");
		PROVINCE_FAKE_CITY_MAP.put("101060000", "����");
		PROVINCE_FAKE_CITY_MAP.put("101070000", "����");
		PROVINCE_FAKE_CITY_MAP.put("101080000", "���ɹ�");
		PROVINCE_FAKE_CITY_MAP.put("101090000", "�ӱ�");
		PROVINCE_FAKE_CITY_MAP.put("101100000", "ɽ��");
		PROVINCE_FAKE_CITY_MAP.put("101110000", "����");
		PROVINCE_FAKE_CITY_MAP.put("101120000", "ɽ��");
		PROVINCE_FAKE_CITY_MAP.put("101130000", "�½�");
		PROVINCE_FAKE_CITY_MAP.put("101140000", "����");
		PROVINCE_FAKE_CITY_MAP.put("101150000", "�ຣ");
		PROVINCE_FAKE_CITY_MAP.put("101160000", "����");
		PROVINCE_FAKE_CITY_MAP.put("101170000", "����");
		PROVINCE_FAKE_CITY_MAP.put("101180000", "����");
		PROVINCE_FAKE_CITY_MAP.put("101190000", "����");
		PROVINCE_FAKE_CITY_MAP.put("101200000", "����");
		PROVINCE_FAKE_CITY_MAP.put("101210000", "�㽭");
		PROVINCE_FAKE_CITY_MAP.put("101220000", "����");
		PROVINCE_FAKE_CITY_MAP.put("101230000", "����");
		PROVINCE_FAKE_CITY_MAP.put("101240000", "����");
		PROVINCE_FAKE_CITY_MAP.put("101250000", "����");
		PROVINCE_FAKE_CITY_MAP.put("101260000", "����");
		PROVINCE_FAKE_CITY_MAP.put("101270000", "�Ĵ�");
		PROVINCE_FAKE_CITY_MAP.put("101280000", "�㶫");
		PROVINCE_FAKE_CITY_MAP.put("101290000", "����");
		PROVINCE_FAKE_CITY_MAP.put("101300000", "����");
		PROVINCE_FAKE_CITY_MAP.put("101310000", "����");
		PROVINCE_FAKE_CITY_MAP.put("101340000", "̨��");
	}
}
