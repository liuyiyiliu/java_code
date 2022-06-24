package com.lyi.d7_socket_oneandone;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 创建网络编程 服务端
 */
public class ServerDemo2 {
    public static void main(String[] args) {
        System.out.println("=========服务端=========");
        try {
//        1.注册端口
            ServerSocket serverSocket = new ServerSocket(7777);
//        2.调用accept方法：等待客户端socket的连接请求，建立socket通道
            Socket socket = serverSocket.accept();
//        3.从socket通道中获取字节输入流
            InputStream inputStream = socket.getInputStream();
//        4.把字节输入流包装成缓冲字符输入流进行消息的接收
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//        5.按照行读取信息
            String msg;
//            readLine只读取一行代码 所以打印流要println()
            while((msg = bufferedReader.readLine())!= null){
                    System.out.println(socket.getRemoteSocketAddress() + "发送了：" + msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
