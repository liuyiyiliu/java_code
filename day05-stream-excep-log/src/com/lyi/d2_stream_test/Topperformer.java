package com.lyi.d2_stream_test;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年06月04日 9:03
 */
public class Topperformer {
    private String name;
    private Double salary;

    public Topperformer(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Topperformer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Topperformer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
