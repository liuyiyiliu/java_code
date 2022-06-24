package com.lyi.d3_udp_test;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * 客户端：发送者 多发
 */
public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
        System.out.println("=======客户端1启动========");

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

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请说:");
            String s = scanner.nextLine();
            if("exit".equals(s)){
                System.out.println("系统关闭");
                datagramSocket.close();
                break;
            }
//        字符串转化为字节数组
            byte[] bytes = s.getBytes();
            DatagramPacket datagramPacket1 = new DatagramPacket(bytes,bytes.length,
                     InetAddress.getLocalHost(),8888);
//        3.发生数据出去
            datagramSocket.send(datagramPacket1);
        }


    }
}
