package com.lyi.d5_api_stringbuilder;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月26日 18:38
 */
public class StringBuilderDemo {
//    可变的字符串类，可以看成是一个容器
//    目的: 提高字符串的操作效率 如拼接和修改
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
//        链式编程
        StringBuilder append = sb.append("我").append("爱").append("中国");
        System.out.println(append);
//        反转
        StringBuilder reverse = new StringBuilder("123").reverse();
        System.out.println(reverse);
        System.out.println(reverse.length());
//        获取当前类的类型  class java.lang.StringBuilder
        System.out.println(reverse.getClass());
//        只是拼接提高效率 最终还是要回归字符串 class java.lang.String
        System.out.println(reverse.toString().getClass());


    }
}
