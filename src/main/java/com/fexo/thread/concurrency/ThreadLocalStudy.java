package com.fexo.thread.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 当前线程变量学习，当前线程变量在线程池中的使用
 * @author F1yBear
 */
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
        @Override
        public void run() {
            if (flag) {
                name.set(this.getName());
                flag = false;
            }
            System.out.println(this.getName() + name.get());
            //remove很重要，如果没有remove当前线程缓存会在其他线程复用，形成脏数据
            name.remove();
        }
    }
}
