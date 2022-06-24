package com.lyi.d4_api_object;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月25日 16:57
 */
public class Test {
//    目标 掌握Object的 toString 方法的  类要重写toString 方法
public static void main(String[] args) {
    Student student = new Student("lusib",'男',22);
    System.out.println(student.toString());
}
}
