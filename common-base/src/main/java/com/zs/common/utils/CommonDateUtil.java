package com.zs.common.utils;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 张帅
 * @date 2020-12-11
 * 日期工具类
 */
public class CommonDateUtil {

    public static final String DEFAULT_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String YMD_FORMAT = "yyyy-MM-dd";
    public static final String YMD = "yyyyMMdd";


    public static Date minuteOperation(Date date, int minute) {
        if (date != null) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(12, minute);
            return cal.getTime();
        } else {
            return null;
        }
    }


    public static long between(Date start, Date end, TimeUnit unit) {
        if (start != null && end != null) {
            unit = unit == null ? TimeUnit.DAYS : unit;
            long duration = start.getTime() - end.getTime();
            return unit.convert(duration, TimeUnit.MILLISECONDS);
        } else {
            return 0L;
        }
    }

    public static Date getDateByLongDate(Long millis) {
        if (millis == null) {
            return new Date();
        } else {
            Calendar cal = Calendar.getInstance();
            cal.setTimeInMillis(millis);
            return cal.getTime();
        }
    }

    public static String getFormatDate(Date date, String format) {
//        if (StringUtil.isEmpty(format)) {
//            format = "yyyy-MM-dd HH:mm:ss";
//        }

        if (date != null) {
            SimpleDateFormat df = new SimpleDateFormat(format);
            return df.format(date);
        } else {
            return null;
        }
    }

    /**
     * date 转 string
     * @param date
     * @param format
     * @return
     */
    public static String dateToString(Date date, String format) {
        format = "yyyy-MM-dd HH:mm:ss";
        if (date != null) {
            SimpleDateFormat df = new SimpleDateFormat(format);
            return df.format(date);
        } else {
            return null;
        }
    }






}
