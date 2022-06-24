package com.lyi.d2_api;

public class ThreadDemo2 {
    public static void main(String[] args) {
        Thread thread = new MyThread("线程一");
        thread.start();

        Thread thread2 = new MyThread("线程二");
        thread2.start();

        Thread mainThread = Thread.currentThread();
        mainThread.setName("主线程Main");
        String name = mainThread.getName();
        for (int i = 4; i < 7; i++) {
            System.out.println(name + "----执行的内容:" + i);
        }

    }
}
