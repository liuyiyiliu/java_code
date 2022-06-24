package com.lyi.d2_polymorphic_test;

import sun.text.resources.pl.CollationData_pl;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月25日 10:35
 *
 * 目标： USB设备模拟
 * 1. 定义USB接口: 拔出和插入
 * 2. 定义2个USB的实现类： 键盘和鼠标
 * 3. 创建一个电脑对象，创建USB设备对象，安装启动
 */
public class Test {
    public static void main(String[] args) {

        Computer computer = new Computer("联想拯救者");
        computer.start();
        USB usb = new KeyBoard("Lenovo键盘");
        computer.installUSB(usb);
    }
}
