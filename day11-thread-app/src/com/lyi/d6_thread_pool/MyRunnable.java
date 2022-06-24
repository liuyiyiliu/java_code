package com.lyi.d6_thread_pool;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+ "正在执行HelloWorld=====>" + i);
        }

        try {
            System.out.println(Thread.currentThread().getName() + "正在睡眠");
            Thread.sleep(10000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
