package com.lyi.bean;

import java.util.Date;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年06月04日 22:49
 */
public class Movie {
    private String name;
    private String actor;
    private double time;
    private double price;
    private int leftPicket;
    private Date createTime; //开始时间

    public Movie() {
    }

    public Movie(String name, String actor, double time, double price, int leftPicket, Date createTime) {
        this.name = name;
        this.actor = actor;
        this.time = time;
        this.price = price;
        this.leftPicket = leftPicket;
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getLeftPicket() {
        return leftPicket;
    }

    public void setLeftPicket(int leftPicket) {
        this.leftPicket = leftPicket;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
