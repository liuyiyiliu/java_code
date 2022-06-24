package com.lyi.d5_udp_multicast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 * 服务端： 接收者
 */
public class ServerDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("=======服务端启动========");
//        1.创建接收者对象： 注册端口号(人)
        MulticastSocket multicastSocket = new MulticastSocket(8888);
        multicastSocket.joinGroup(InetAddress.getByName("224.0.0.1"));
//        2.创建一个数据包对象接收数据
          byte[] bytes = new byte[1024*64];
          DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length);
//        3.等待接收数据
        multicastSocket.receive(datagramPacket);

//        4.取出数据即可
        System.out.println("得到：" + new String(bytes,0,datagramPacket.getLength()));


//        5.获取发送端的IP和端口号
        InetAddress ip = datagramPacket.getAddress();
        System.out.println(ip);

        int port = datagramPacket.getPort();
        System.out.println(port);


        multicastSocket.close();
    }
}
