package com.lyi.d4_api_object;

import java.util.Objects;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月26日 18:24
 */
public class Test3 {
    public static void main(String[] args) {
//        目的： 学习Objects equals 方法
        Student student = new Student("张三",'男',25);
        Student student2 = new Student("张三",'男',25);
        System.out.println(Objects.equals(student,student2));

    }
}
