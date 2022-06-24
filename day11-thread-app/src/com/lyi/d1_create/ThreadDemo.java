package com.lyi.d1_create;

/**
 * 创建线程一；优缺点：单继承 不能使用其他的线程
 */
public class ThreadDemo {
    public static void main(String[] args) {
//        3.创建对象
        Thread thread = new MyThread();
//        4.启动对象
        thread.start();
        for (int i = 4 ; i < 7; i++) {
            System.out.println("主线程所跑内容:" + i);
        }
    }
}

/**
 * 1.自定义线程继承
 */
class MyThread extends Thread{
    // 2.实现继承的run方法
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("子线程所跑内容:" + i);
        }
    }
}
