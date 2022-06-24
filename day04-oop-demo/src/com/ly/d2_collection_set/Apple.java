package com.ly.d2_collection_set;

import java.util.Objects;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月29日 22:36
 */
public class Apple implements Comparable<Apple> {
    private String name;
    private String color;
    private int weight;
    private double price;

    public Apple() {
    }

    public Apple(String name, String color, int weight, double price) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Apple)) return false;
        Apple apple = (Apple) o;
        return getWeight() == apple.getWeight() &&
                Double.compare(apple.getPrice(), getPrice()) == 0 &&
                Objects.equals(getName(), apple.getName()) &&
                Objects.equals(getColor(), apple.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getColor(), getWeight(), getPrice());
    }



    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }

    /**
     * 方法一 类实现Comparable
     *    o1.compare(o2)
     * @param o
     * @return
     */
    @Override
    public int compareTo(Apple o) {
//        按照重量排序的  即使两个一样 也认为第一个大
        return this.getWeight()-o.getWeight(); //去重重量重复的元素
//        return this.getWeight()-o.getWeight()>=0 ? 1:-1;  保留重量重复的元素

    }
}
