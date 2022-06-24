package com.lyi.d7_api_integer;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月27日 14:20
 */
public class Test {
    public static void main(String[] args) {
//        引用数据 和 基本数据 区别 容错率 高 但是效率低

//        转化为String
        Integer age = 15;
        System.out.println(age.toString());

//        String转化为Int
        String age2 = "20";
        int age3 = Integer.parseInt(age2);
        System.out.println(age3);
//        int age = null; 报错


    }
}
