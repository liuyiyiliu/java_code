package com.lyi.d9_socket_sms;


import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * 目标： 客户端  发送消息 和  接收服务端消息
 */
public class SocketDemo {
    public static void main(String[] args) {
        System.out.println("==========客户端==========");

        try {
//        1.创建Socket
            /**
             * public Socket(String host, int port)
             * 1.服务端的IP和端口号
             */
            Socket socket = new Socket("127.0.0.1",7777);

//            创建一个独立线程专门这个客户端的读消息（服务端随时转发信息）
             new ClientReader(socket).start();

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
class ClientReader extends Thread{
    private Socket socket;
    public ClientReader(Socket socket){
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
                System.out.println("收到了：" + msg);
            }
        } catch (Exception e) {
            System.out.println("服务端提出群聊！");
        }
    }
}
