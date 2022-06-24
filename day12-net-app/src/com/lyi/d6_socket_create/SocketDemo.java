package com.lyi.d6_socket_create;


import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 目标： 学习Socket网络编程入门开发 客户端  1 发  1 收
 */
public class SocketDemo {
    public static void main(String[] args) {
        System.out.println("=========客户端=========");

        try {
//        1.创建Socket
            /**
             * public Socket(String host, int port)
             * 1.服务端的IP和端口号
             */
            Socket socket = new Socket("127.0.0.1",7777);
//         2.从socket通信管道获取字节输出流 用来发送数据
            OutputStream outputStream = socket.getOutputStream();
//         3.低级流包装成打印流
            PrintWriter printWriter = new PrintWriter(outputStream);
//         4.发送信息
            printWriter.println("我是客户端，你好，可以交个朋友吗？");

            printWriter.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
