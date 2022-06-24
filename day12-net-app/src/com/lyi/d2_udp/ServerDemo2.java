package com.lyi.d2_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * 服务端： 接收者 多收
 */
public class ServerDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("=======服务端1启动========");
//        1.创建接收者对象： 注册端口号(人)
           DatagramSocket socket = new DatagramSocket(8888);
//        2.创建一个数据包对象接收数据
          byte[] bytes = new byte[1024*64];
          DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length);
        while (true) {
//        3.等待接收数据
            socket.receive(datagramPacket);
//        4.取出数据即可
            System.out.println("她说：" + new String(bytes,0,datagramPacket.getLength())+
                     ";她的ip:" + datagramPacket.getAddress()+";她的端口号：" + datagramPacket.getPort());
        }
    }
}
