package com.lyi.d4_api_object;

import java.util.Objects;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月25日 16:51
 */
public class Student {
    private String userName;
    private char   sex;
    private  int age;

    public Student(String userName, char sex, int age) {
        this.userName = userName;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "userName='" + userName + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getSex() == student.getSex() &&
                getAge() == student.getAge() &&
                Objects.equals(getUserName(), student.getUserName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserName(), getSex(), getAge());
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
