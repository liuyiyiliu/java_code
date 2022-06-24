package com.lyi.d8_socket_threadpool;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

/**
 * 创建网络编程 服务端  使用线程池 来解决创建 N(会话)——N(线程) 的问题
 * 作用：服务端复用线程处理多个客户端 可以避免系统瘫痪  / 适合客户端通信时长较短的场景
 */
public class ServerDemo2 {
//    1. 使用静态变量记住一个线程池对象
    public static ExecutorService pool =  new ThreadPoolExecutor(1,2,6, TimeUnit.SECONDS,
         new ArrayBlockingQueue<>(3),Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
    public static void main(String[] args) throws Exception {
        System.out.println("=========服务端==========");
//        1.注册端口
            ServerSocket serverSocket = new ServerSocket(7777);
        while (true) {
//        2.调用accept方法：等待客户端socket的连接请求，建立socket通道
            Socket socket = serverSocket.accept();
            System.out.println(socket.getRemoteSocketAddress() + "上线了");
            Runnable target = new ServerReaderRunnable(socket);
            pool.execute(target);
        }

    }
}
