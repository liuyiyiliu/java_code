package com.lyi.d1_static_singleinstance;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月23日 19:22
 */
public class TestSingleInstance2 {
    public static void main(String[] args) {
        SingleInstance2 instance2 = SingleInstance2.getInstance();
        SingleInstance2 instance3 = SingleInstance2.getInstance();

        System.out.println(instance2 == instance3);
    }
}
