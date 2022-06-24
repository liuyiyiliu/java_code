package com.lyi.d1_static_code;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月23日 16:40
 */
public class StaticDemo2 {


    public StaticDemo2(){
        System.out.println("=========无参构造器被触发执行============");
    }

    /**
     * 实例代码块: 无static修饰 属于对象，每次构建对象时，都会触发一次执行
     */
    {
        System.out.println("==========实例代码块被触发执行===========");
    }
    public static void main(String[] args) {
//        理解实例代码块（构造代码块）
       StaticDemo2 staticDemo2 =  new StaticDemo2();

    }
}
