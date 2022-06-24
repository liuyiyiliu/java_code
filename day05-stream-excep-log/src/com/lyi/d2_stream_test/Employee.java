package com.lyi.d2_stream_test;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年06月04日 8:34
 */
public class Employee {
    private String name;
    private char gender;
    private double salary;
    private double bonus;
    private String punishment;

    public Employee() {
    }

    public Employee(String name, char gender, double salary, double bonus, String punishment) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.bonus = bonus;
        this.punishment = punishment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getPunishment() {
        return punishment;
    }

    public void setPunishment(String punishment) {
        this.punishment = punishment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", punishment='" + punishment + '\'' +
                '}';
    }
}
