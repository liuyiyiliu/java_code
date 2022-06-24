package com.lyi.d3_thread_safe;

/**
 *  小明和小红去银行取钱10000,账户余额是10000
 */
public class ThreadDemo {
    public static void main(String[] args) {

//        1.创建一个共享的账户对象a
        Account acc = new Account("IBC", 10000);

//        2.定义两个线程对象 代表小红和小明进来了
        Thread thread = new DrawThread(acc,"小明");
        thread.start();

        Thread thread2 = new DrawThread(acc,"小红");
        thread2.start();

    }
}
