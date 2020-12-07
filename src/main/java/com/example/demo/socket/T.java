package com.example.demo.socket;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @Author: ZhangZhenhua
 * @Date: 2020/9/24 16:12
 */
public class T {
    public static void main(String[] args) throws ParseException {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = "2020-11-23 12:55:00";
        String str2 = "2020-11-23 16:15:00";
        long time = format.parse(str).getTime();
        long time2 = format.parse(str2).getTime();
        System.out.println(time);
        System.out.println(time2);
    }
}
