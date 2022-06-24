package com.lyi.d7_socket_threadsingle;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * 创建网络编程 服务端 处理多个客户端发送信息的问题 如 音乐酒吧
 */
public class ServerDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("=========服务端==========");
//        1.注册端口
            ServerSocket serverSocket = new ServerSocket(7777);
        while (true) {
//        2.调用accept方法：等待客户端socket的连接请求，建立socket通道
            Socket socket = serverSocket.accept();
            System.out.println(socket.getRemoteSocketAddress() + "上线了");

            new ServerSocketThread(socket).start();
        }

    }
}
