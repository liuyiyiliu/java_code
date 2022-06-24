package com.lyi.d1_inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Java代码学习 IP相关类
 */
public class InetAddressDemo {
    public static void main(String[] args) throws Exception {

//        获取本机地址对象
        InetAddress ip = InetAddress.getLocalHost();

//       获取IP地址
        System.out.println(ip.getHostAddress());

//       获取主机名称
        System.out.println(ip.getHostName());
//      获取域名的IP
        InetAddress ip2 = InetAddress.getByName("www.baidu.com");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());
//      获取公网IP对象
        InetAddress ip3 = InetAddress.getByName("36.152.44.96");
        System.out.println(ip3.getHostName());

//       判断是否可以接通： ping 5s之前是否可通
        System.out.println(ip3.isReachable(5000));


    }
}
