package com.hspedu.date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * JunXing
 * 2023/2/20 7:58
 * IntelliJ IDEA
 */
public class Date01 {
    public static void main(String[] args) throws ParseException {
        //获取当前时间
        Date date = new Date();
        System.out.println(date);

        /**
         * 转换获取时间的格式
         */
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = simpleDateFormat.format(date);
        System.out.println(format);

        Date date1 = new Date(233333333);
        System.out.println(date1);

        //将格式化String 转换成对应的Date
        String s = "1996年01月01日 10:20:30 星期一";
        Date parse = simpleDateFormat.parse(s);
        System.out.println(parse);
    }
}
