package com.lyi.d1_static_test;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月23日 10:10
 */
public class Student {
    private  String name;
    private  int age;

    private Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        System.out.println(VeritifyUtil.randomCode(3));

        Student student = new Student();
    }
}
