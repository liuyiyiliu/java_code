package com.lyi.d2_api;

public class MyThread extends Thread {
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(MyThread.currentThread().getName()+"---执行的内容是:" + i);
        }
    }
}
