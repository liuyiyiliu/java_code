package com.lyi.d3_reflect_contructor;

public class Student {
    private String userName;
    private int age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private Student() {
        System.out.println("无参构造方法");
    }

    public Student(String userName, int age) {
        System.out.println("有参构造方法");
        this.userName = userName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }
}
