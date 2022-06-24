package com.lyi.d4_thread_synchronized_code;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String loginId;
    private double money;
    private final Lock lock = new ReentrantLock();

    public Account() {
    }

    public Account(String loginId, double money) {
        this.loginId = loginId;
        this.money = money;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

//    静态方法用类名.class  实例方法用this 调用synchronized
//    public static void run(){
//        synchronized (Account.class) {
//            System.out.println("11");
//        }
//    }


//    1.同步代码块
//    public void saveMoney(double money) {
//        String name2 = Thread.currentThread().getName();
//        synchronized (this) {
//            if(this.money>=money){
//                System.out.println(name2 + "的余额" + money);
//                this.money -= money;
//                System.out.println(name2 + "的余额" + this.money);
//            }else{
//                System.out.println("余额不足");
//            }
//        }
//    }

//    2.同步方法
// public synchronized void saveMoney(double money) {
//        String name2 = Thread.currentThread().getName();
//            if(this.money>=money){
//                System.out.println(name2 + "的余额" + money);
//                this.money -= money;
//                System.out.println(name2 + "的余额" + this.money);
//            }else{
//                System.out.println("余额不足");
//            }
//
//    }

//    3.手动加锁
     public void saveMoney(double money) {
        String name2 = Thread.currentThread().getName();

         lock.lock();
         try {
             if(this.money>=money){
                 System.out.println(name2 + "的余额" + money);
                 this.money -= money;
                 System.out.println(name2 + "的余额" + this.money);
//                 System.out.println(10/0); 防止执行语句有问题 不走解锁的动作
             }else{
                 System.out.println("余额不足");
             }
         } finally {
             lock.unlock();
         }

     }
}
