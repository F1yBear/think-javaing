package com.fexo.thread.concurrency;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

/**
 * @author  wangfeixiong
 */
public class ThreadPoolStady {

    public static void main(String[] args) {
        new ThreadPoolStady().run();
    }

    public void run() {
        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");
        stringList.add("5");
        stringList.add("6");
        Executor poolExecutor    = Executors.newFixedThreadPool(6);

        Map<String, String> stringMap = new HashMap<>();
        stringList.forEach(value -> {
            poolExecutor.execute(() -> {
                stringMap.put(value, value);
                System.out.println(value);
            });
        });
        while (1==1) {
            stringMap.forEach((key, value) -> {
                System.out.println(key + ":" + value);
            });
        }
    }
}
