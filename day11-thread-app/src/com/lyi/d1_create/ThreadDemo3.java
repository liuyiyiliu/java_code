package com.lyi.d1_create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 目标: 创建线程三；优缺点
 */
public class ThreadDemo3 {
    public static void main(String[] args) {

//        1.2 创建Callable对象
        Callable myCallable = new MyCallable(10);
        /**
         * 1.3 封装成线程任务对象
         *   作用一: FutureTask实现Runnable接口,可以给Thread调用
         *   作用二: FutureTask通过get方法可以获取结果内容
         */
        FutureTask ft = new FutureTask<String>(myCallable);

//        2.把线程任务对象交给Thread处理
        Thread thread = new Thread(ft);
//        3.调用Thread的start方法启动线程,执行任务
         thread.start();


        Callable myCallable2 = new MyCallable(100);
        FutureTask ft2 = new FutureTask<String>(myCallable2);
        Thread thread2 = new Thread(ft2);
        thread2.start();

//        4.线程执行完毕后,通过FutureTask的get方法去获取任务执行的结果
        String call = null;
        try {
//        等待线程1结束后才会执行get方法
            call = (String) ft.get();
            System.out.println("第一个线程执行的结果:"+ call);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        Object call2 = null;
        try {
            call2 = ft2.get();
            System.out.println("第一个线程执行的结果是:"+ call2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}

/**
 * 1.得到任务对象
 *   1.1定义类实现Callable接口 重写call方法 封装要做的事情:申明线程执行任务结束后的结果返回值类型
 *   1.2 用FutureTask把Callable对象封装成线程任务对象
 */
class MyCallable implements Callable<String>{
    int n;
    public MyCallable(int n){
        this.n = n;
    }
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return "子线程执行的结果是:" + sum;
    }
}
