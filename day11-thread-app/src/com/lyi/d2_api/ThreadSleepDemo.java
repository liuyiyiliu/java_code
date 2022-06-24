package com.lyi.d2_api;

public class ThreadSleepDemo {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 5; i++) {
            if(i==3){
                Thread.sleep(3000);
            }
            System.out.println(i);
        }
    }
}
