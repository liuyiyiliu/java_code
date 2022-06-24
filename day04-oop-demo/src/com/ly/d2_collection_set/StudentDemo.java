package com.ly.d2_collection_set;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月29日 21:31
 */
public class StudentDemo {
    public static void main(String[] args) {
//        让Set集合把重复的对象删除一个（去重复）

//        Set去重复原因：  1.先判断Hash值是否相等 2.判断equals是否相等
        Set<Student> set = new HashSet<>();
        Student student = new Student("卢小家",22,'男');
        Student student2 = new Student("卢小家",22,'男');
        Student student3 = new Student("卢小家2",22,'男');
        set.add(student);
        set.add(student2);
        set.add(student3);
        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());
        System.out.println(set);


    }
}
