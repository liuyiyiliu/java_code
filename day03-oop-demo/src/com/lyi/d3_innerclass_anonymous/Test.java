package com.lyi.d3_innerclass_anonymous;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月25日 12:00
 */
public class Test {
    public static void main(String[] args) {
//        目的简化代码编写
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("老虎相当猛的");
            }
        };

       a.run();
    }
}

class Tiger extends  Animal{

    @Override
    public void run() {
        System.out.println("老虎相当猛的");
    }
}

abstract class Animal{
    public abstract void run();
}
