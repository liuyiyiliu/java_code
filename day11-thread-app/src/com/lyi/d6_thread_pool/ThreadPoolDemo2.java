package com.lyi.d6_thread_pool;

import java.util.concurrent.*;

/**
 * ThreadPoolExecutor 创建线程池
 */
public class ThreadPoolDemo2 {
    public static void main(String[] args) throws Exception {


/***
 *
 *             int corePoolSize,
*              int maximumPoolSize,
*              long keepAliveTime,
*              TimeUnit unit,
*              BlockingQueue<Runnable> workQueue,
*              ThreadFactory threadFactory,
*             RejectedExecutionHandler handler    AbortPolicy 报异常  CallerRunPolicy 主线程服务
 */
        ThreadPoolExecutor pool = new ThreadPoolExecutor(3,5,5, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        Future<String> sum1 = pool.submit(new MyCallable(100));
        Future<String> sum2 = pool.submit(new MyCallable(200));
        Future<String> sum3 = pool.submit(new MyCallable(300));
        Future<String> sum4 = pool.submit(new MyCallable(400));

        System.out.println(sum1.get());
        System.out.println(sum2.get());
        System.out.println(sum3.get());
        System.out.println(sum4.get());



    }
}
