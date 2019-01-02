package com.fexo.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DateDome {

    public static void main(String[] args) {
        LocalDateTime ii = LocalDateTime.parse("2018年12月11 23 11 12", DateTimeFormatter.ofPattern("yyyy年MM月dd HH mm ss"));

        Date date = new Date();
        System.out.println(ii);
    }
}
