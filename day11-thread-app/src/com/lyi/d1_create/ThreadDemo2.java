package com.lyi.d1_create;

/**
 *  创建线程二； 此线程的优缺点
 */
public class ThreadDemo2 {
    public static void main(String[] args) {

//        3.创建任务对象
        MyRunnable childThread = new MyRunnable();
//        4.把任务对象交给线程处理
        new Thread(childThread).start();

        for (int i = 4 ; i < 7; i++) {
            System.out.println("主线程所跑内容:" + i);
        }
    }
}

// 1.实现接口
class MyRunnable implements Runnable{
//    2.重写方法
    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println("子线程所跑内容:" + i);
        }
    }
}
