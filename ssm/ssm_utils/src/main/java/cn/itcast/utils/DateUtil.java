package cn.itcast.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static String DateToStr(Date date){

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(date);
        return format;
    }
}
