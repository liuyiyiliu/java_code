package com.lyi.d8_socket_threadpool;


import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 目标： 客户端
 */
public class SocketDemo {
    public static void main(String[] args) {
        System.out.println("=========客户端==========");

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
            Scanner scanner = new Scanner(System.in);
//            放入循环 形成不断发送
            while (true) {
                System.out.println("请说：");
                String msg = scanner.nextLine();
//         4.发送信息
                printWriter.println(msg);
                printWriter.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
