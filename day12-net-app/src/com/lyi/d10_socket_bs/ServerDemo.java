package com.lyi.d10_socket_bs;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.*;

public class ServerDemo {
    //    1. 使用静态变量记住一个线程池对象
    public static ExecutorService pool =  new ThreadPoolExecutor(3,5,6, TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
    public static void main(String[] args) {
        System.out.println("==========服务端启动==========");
        try {
//        1.注册端口
            ServerSocket serverSocket = new ServerSocket(8088);
//            2.循环接收浏览器发送的请求
            while (true) {
                Socket socket = serverSocket.accept();
//            3.用线程池去处理任务
                pool.execute(new SocketReader(socket));
                System.out.println(socket.getRemoteSocketAddress()+"访问了网页");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class SocketReader implements Runnable{
    private Socket socket;
    public SocketReader(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        try {

//            浏览器与本线程建立socket管道联系
//            响应消息给浏览器显示
            OutputStream outputStream = socket.getOutputStream();
//         3.低级流包装成打印流
            PrintWriter printWriter = new PrintWriter(outputStream);
                printWriter.println("HTTP/1.1 200 OK"); //协议类型和版本 响应成功的消息
                printWriter.println("Content-Type:text/html;charset=UTF-8"); // 响应的数据类型： 文本/网页
            //必须要发送一个空行
            printWriter.println();
//            才可以响应数据回去给浏览器
            printWriter.println("撸死彬是猴！！");

                printWriter.flush();
                printWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
