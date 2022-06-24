package com.lyi.d8_socket_threadpool;



import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerReaderRunnable implements Runnable{
    private Socket socket;
    public ServerReaderRunnable (Socket socket){
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
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(socket.getRemoteSocketAddress() + "下线了");
        }
    }
}
