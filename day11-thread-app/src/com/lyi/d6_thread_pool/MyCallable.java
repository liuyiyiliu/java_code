package com.lyi.d6_thread_pool;

import java.util.concurrent.Callable;

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
        return  Thread.currentThread().getName()+ "执行1-" + n + "的结果是:" + sum;
    }
}
