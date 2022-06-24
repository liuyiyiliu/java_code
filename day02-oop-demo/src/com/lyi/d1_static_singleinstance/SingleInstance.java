package com.lyi.d1_static_singleinstance;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月23日 19:12
 */
public class SingleInstance {
//    学习饿汉单列模式： 1.私有构造器  2.在访问对象之前  对象已经提前准备好一个

    public static  SingleInstance instance = new SingleInstance();
    private SingleInstance(){
    }
}
