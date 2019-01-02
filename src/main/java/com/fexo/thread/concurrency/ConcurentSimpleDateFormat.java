package com.fexo.thread.concurrency;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author F1yBear
 */
public class ConcurentSimpleDateFormat {
    private static SimpleDateFormat FORMAT = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
    private static String[] dateArray = {"2018-11-21", "2018-11-22", "2018-11-20"};

    public static void main(String[] args) throws ParseException {
        //threadSafeDateMethod();
        threadUnsafeDateMethod();
    }

    /**
     * 线程安全的调用dateFormat
     */
    private static void threadSafeDateMethod() {
        for (String date : dateArray) {
            new Thread(() -> {
                while (true) {
                    try {
                        synchronized (FORMAT) {
                            Date date1 = FORMAT.parse(date);
                            String name = FORMAT.format(date1);
                            if (!name.equals(date)) {
                                throw new RuntimeException(Thread.currentThread().getName() + "并发异常");
                            }
                        }
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }

    /**
     * 线程不安全的调用dateFormat
     */
    private static void threadUnsafeDateMethod() {
        for (String date : dateArray) {
            new Thread(() -> {
                while (true) {
                    try {
                        Date date1 = FORMAT.parse(date);
                        String name = FORMAT.format(date1);
                        if (!name.equals(date)) {
                            throw new RuntimeException(Thread.currentThread().getName() + "并发异常");
                        }
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }

}

