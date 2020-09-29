package com.qfedu.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * projectName: T3_db_ddoa
 * author: GSL
 * time: 2020/9/29 16:00
 * description:
 */
public class CustomerDateConvert implements Converter<String, Date> {
    private SimpleDateFormat[] sdfs=new SimpleDateFormat[]{
            new SimpleDateFormat ("yyyy-MM-dd"),
            new SimpleDateFormat ("yyyyMMdd"),
            new SimpleDateFormat ("yyyy年MM月dd日"),
            new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss")
    };

    @Override
    public Date convert (String s) {
        if(s==null||s.isEmpty ()){
            return null;
        }
        for (SimpleDateFormat sdf : sdfs) {
            try {
                return sdf.parse (s);
            } catch (ParseException e) {
                e.printStackTrace ();
                continue;
            }
        }
        return null;
    }
}