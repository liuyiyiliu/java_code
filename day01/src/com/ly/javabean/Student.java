package com.ly.javabean;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月21日 9:10
 */
public class Student {
    private  String userName;
    private  int age;
    private String hobby;

    public Student() {
    }

    public Student(String userName, int age, String hobby) {
        this.userName = userName;
        this.age = age;
        this.hobby = hobby;
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

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
