package com.lyi.d9_socket_sms;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * 创建网络编程 服务端   即时通信 MSG 原理： 我发信息给服务端 服务端转发其他客户端 (群发)
 * 作用：
 */
public class ServerDemo2 {
//    1. 定义一个静态List集合来存储当前全部在线的Socket通道
    public static List<Socket> allOnlineSockets = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        System.out.println("=========服务端==========");
//        1.注册端口
            ServerSocket serverSocket = new ServerSocket(7777);
        while (true) {
//        2.调用accept方法：等待客户端socket的连接请求，建立socket通道
            Socket socket = serverSocket.accept();
            System.out.println(socket.getRemoteSocketAddress() + "上线了");
            allOnlineSockets.add(socket); //上线完成
            new ServerReader(socket).start();
        }

    }
}


class ServerReader extends   Thread{

    private Socket socket;
    public ServerReader(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        try{
//        3.从socket通道中获取字节输入流
            InputStream inputStream = socket.getInputStream();
//        4.把字节输入流包装成缓冲字符输入流进行消息的接收
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//        5.按照行读取信息
            String msg;
//            readLine只读取一行代码 所以打印流要println()
            while((msg = bufferedReader.readLine())!= null){
                System.out.println(socket.getRemoteSocketAddress() + "上线了：" + msg);
//                把这个消息进行端口转发给全部客户端的socket管道
                sendMsgToAll(msg);
            }
        } catch (Exception e) {
            System.out.println(socket.getRemoteSocketAddress() + "下线了");
            ServerDemo2.allOnlineSockets.remove(socket);
        }
    }

    private void sendMsgToAll(String msg) throws Exception {
        for (Socket allSocket : ServerDemo2.allOnlineSockets) {
            PrintWriter printWriter = new PrintWriter(allSocket.getOutputStream());
            printWriter.println(msg);
            printWriter.flush();
        }
    }

}
