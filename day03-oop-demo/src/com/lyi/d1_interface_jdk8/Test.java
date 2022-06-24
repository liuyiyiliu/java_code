package com.lyi.d1_interface_jdk8;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月25日 10:06
 */
public class Test {
    public static void main(String[] args) {
        BasketBallMan basketBallMan = new BasketBallMan();
        basketBallMan.run();
//        basketBallMan.connect()  接口里面的静态方法只能接口调用
        SportManInter.connect();
    }
}
