package com.qfedu.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * projectName: T3_db_ddoa
 * author: GSL
 * time: 2020/9/29 15:48
 * description:
 */
public class DataConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        System.out.println("自定义日期转换器");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return simpleDateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
