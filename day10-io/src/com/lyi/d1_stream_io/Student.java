package com.lyi.d1_stream_io;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 4166821694106462912L;
    private String userName;
    private int age;

    public Student() {
    }

    public Student(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "Student{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }
}
