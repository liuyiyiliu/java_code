package com.lyi.d2_udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * 客户端：发送者
 */
public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
        System.out.println("=======客户端启动========");

//        1.创建发送者对象: 发送端自带默认的端口号
        DatagramSocket datagramSocket = new DatagramSocket();
//        2.创建一个数据包对象封装数据(韭菜盒子)
        /**
         * public DatagramPacket(byte buf[], int length,
         *                           InetAddress address, int port)
         * 参数1： 传输的字节数据（韭菜）
         * 参数2： 自己长度（韭菜长度）
         * 参数3： ip地址
         * 参数4： 端口号
         */

//        字符串转化为字节数组
        byte[] bytes = "我是一个韭菜盒子，你想要吗?".getBytes();
        DatagramPacket datagramPacket1 = new DatagramPacket(bytes,bytes.length,
                 InetAddress.getLocalHost(),8888);
//        3.发生数据出去
        datagramSocket.send(datagramPacket1);

        datagramSocket.close();
    }
}
