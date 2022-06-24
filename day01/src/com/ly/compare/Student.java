package com.ly.compare;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年06月10日 22:13
 */
public class Student implements Comparable<Student> {
    private String userName;
    private double price;

    public Student() {
    }

    public Student(String userName, double price) {
        this.userName = userName;
        this.price = price;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(this.getPrice() , o.getPrice());
    }
}
