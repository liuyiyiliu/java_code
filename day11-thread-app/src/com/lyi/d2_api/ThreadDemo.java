package com.lyi.d2_api;

public class ThreadDemo {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.setName("线程一");
        thread.start();

        Thread thread2 = new MyThread();
        thread2.setName("线程二");
        thread2.start();

        Thread mainThread = Thread.currentThread();
        String name = mainThread.getName();
        for (int i = 4; i < 7; i++) {
            System.out.println(name + "----主线程main执行的内容:" + i);
        }

    }
}
