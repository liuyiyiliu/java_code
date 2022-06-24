package com.lyi.d1_static_singleinstance;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月23日 19:19
 */
public class SingleInstance2 {
//    目标：理解懒汉单列模式(1.私有构造器 2.当对象需要使用时，才创建)

//    私有化 防止第一次拿到null
    private static SingleInstance2 instance;
    private SingleInstance2(){
    }

    public static SingleInstance2 getInstance(){
        if(instance == null){
            instance = new SingleInstance2();
        }
        return  instance;
    }

}
