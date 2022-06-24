package com.lyi.d4_api_object;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月25日 22:25
 */
public class Test2 {
    public static void main(String[] args) {
//        目标： equals方法
        Student student = new Student("张三",'男',25);
        Student student2 = new Student("张三",'男',25);
        System.out.println(student.equals(student2));
        System.out.println(student == student2);
    }
}
