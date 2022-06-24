package com.lyi.d7_timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 使用Timer创建定时器 单线程 缺点: 当其中一个线程挂掉或者延迟时,影响其他线程
 */
public class TimerDemo {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行了:AAA" + new Date());
            }
        },3000,2000);

        Timer timer2 = new Timer();
        timer2.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行了:BBB" + new Date());
            }
        },3000,2000);

    }
}
