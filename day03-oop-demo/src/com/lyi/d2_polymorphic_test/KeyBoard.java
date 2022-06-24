package com.lyi.d2_polymorphic_test;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月25日 10:54
 */
public class KeyBoard implements USB {
    private String name;

    public KeyBoard(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name + "插入电脑");
    }

    @Override
    public void disconnect() {
        System.out.println(name + "拔出电脑");
    }

    public  void print(){
        System.out.println(name + "输入我爱你JAVA");
    }
}
