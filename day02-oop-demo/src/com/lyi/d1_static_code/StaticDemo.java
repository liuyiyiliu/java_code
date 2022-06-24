package com.lyi.d1_static_code;

import java.util.ArrayList;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月23日 16:27
 */
public class StaticDemo {

    public static  String schoolName;
    public static ArrayList<String> cards = new ArrayList<>();

    /**
     *  静态代码块:  有static修饰，属于类，与类一起一起优先加载一次，自动触发执行
     *  作用: 可以用于初始化静态资源
     */
    static {
        System.out.println("=============静态代码块被触发执行================");
        schoolName = "卢思滨";
    }


    public static void main(String[] args) {

        System.out.println("================main方法执行==============");
        System.out.println(schoolName);
    }
}
