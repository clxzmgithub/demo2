package com.java8;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by zhongming.xu on 11/21/2017
 */
public class DateUtil {

    public static String YYYY_MM_DD = "yyyy-MM-dd";
    public static String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
    public static String YYYYMMDD_HHMM = "yyyyMMdd_HHmm";
    public static String MMddHHmm = "MMddHHmm";
    public static String HH = "HH";
    public static final int HOUR_MINUTE = 60;
    public static final String MINUTE_UNIT = "分钟";
    public static final String HOUR_UNIT = "小时";
    public static String MM_DD = "MM/dd";
    public static String HH_MM_SS = "HH:mm:ss";
    public static String MM_DD_HH_MM = "MM-dd HH:mm";
    public static String HHMM = "HH:mm";
    public static String YYYYMMDD = "yyyyMMdd";
    public static String YYYYMM = "yyyyMM";
    public static String MM_DD_CN = "MM月dd日";

    public static final String YEARS = "YEARS";
    public static final String MONTHS = "MONTHS";
    public static final String DAYS = "DAYS";
    public static final String HOURS = "HOURS";
    public static final String MINUTES = "MINUTES";

    public static Date addDate(Date date, int days) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days);
        return cal.getTime();
    }


    public static LocalDate toLocalDate(String date, String pattern) {
        return LocalDate.parse(date, java.time.format.DateTimeFormatter.ofPattern(pattern));
    }

    public static LocalDate toLocalDate(String date) {
        return LocalDate.parse(date, java.time.format.DateTimeFormatter.ofPattern(DateUtil.YYYY_MM_DD));
    }
}
