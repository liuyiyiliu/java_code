package com.lyi.d1_create;

/**
 *  创建线程二(匿名内部类)
 */
public class ThreadDemo2Other {
    public static void main(String[] args) {

        Runnable childThread = new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 2; i++) {
                    System.out.println("子线程1:" + i);
                }
            }
        };
        new Thread(childThread).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 2; i++) {
                    System.out.println("子线程2:" + i);
                }
            }
        }
        ).start();

        new Thread(() -> {
                for (int i = 0; i < 2; i++) {
                    System.out.println("子线程3:" + i);
                }
        }
        ).start();


        for (int i = 4 ; i < 7; i++) {
            System.out.println("主线程所跑内容:" + i);
        }
    }
}
