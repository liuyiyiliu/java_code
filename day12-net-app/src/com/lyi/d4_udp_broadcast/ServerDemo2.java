package com.lyi.d4_udp_broadcast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 服务端： 接收者
 */
public class ServerDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("=======服务端启动========");
//        1.创建接收者对象： 注册端口号(人)
           DatagramSocket datagramSocket = new DatagramSocket(9999);
//        2.创建一个数据包对象接收数据
          byte[] bytes = new byte[1024*64];
          DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length);
//        3.等待接收数据
          datagramSocket.receive(datagramPacket);

//        4.取出数据即可
        System.out.println("得到：" + new String(bytes,0,datagramPacket.getLength()));


//        5.获取发送端的IP和端口号
        InetAddress ip = datagramPacket.getAddress();
        System.out.println(ip);

        int port = datagramPacket.getPort();
        System.out.println(port);


        datagramSocket.close();
    }
}
