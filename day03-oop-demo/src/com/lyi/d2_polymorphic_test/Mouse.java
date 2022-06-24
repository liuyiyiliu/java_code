package com.lyi.d2_polymorphic_test;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月25日 10:54
 */
public class Mouse implements USB{

    @Override
    public void connect() {
        System.out.println("插入鼠标");
        move();
    }

    @Override
    public void disconnect() {
        System.out.println("拔出鼠标");
    }

    public  void move(){
        System.out.println("移动鼠标到安全文件夹");
    }
}
