package com.lyi.d6_thread_pool;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) {


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
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(3,5,5, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
        MyRunnable myRunnable = new MyRunnable();

        tpe.execute(myRunnable);
        tpe.execute(myRunnable);
        tpe.execute(myRunnable);

        tpe.execute(myRunnable);
        tpe.execute(myRunnable);

        tpe.execute(myRunnable);
        tpe.execute(myRunnable);
        tpe.execute(myRunnable);
        tpe.execute(myRunnable);
        tpe.execute(myRunnable);

//Running, pool size = 5, active threads = 5, queued tasks = 5, completed tasks = 0
//        tpe.execute(myRunnable);

//        tpe.shutdownNow(); //强制 会丢失任务

//        tpe.shutdown(); // 柔和


    }
}
