package com.fexo.thread.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalStudy {
   private static ThreadLocal<String> name = new ThreadLocal<>();

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(1);
        for (int index = 0; index < 10; index++) {
            pool.execute(new MyThread());
        }
        pool.shutdown();
    }

    private static class MyThread extends Thread {
        private static boolean flag = true;
        public void run() {
            if (flag) {
                name.set(this.getName());
                flag = false;
            }
            System.out.println(this.getName() + name.get());
            name.remove();
        }
    }
}
