package com.lyi.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年06月04日 22:58
 */
public class Customer extends User {
    private String roleName;
    private String property;
    private double mark;
    //    定义一个属性存储购买记录(一对多或一的 关系)
    private Map<String,Boolean> getBuyMovies = new HashMap<>();


    public Map<String, Boolean> getGetBuyMovies() {
        return getBuyMovies;
    }

    public void setGetBuyMovies(Map<String, Boolean> getBuyMovies) {
        this.getBuyMovies = getBuyMovies;
    }

    public Customer(String loginName, String password, String realName, char gender, String phone, double accountNumber) {
        super(loginName, password, realName, gender, phone, accountNumber);
    }

    public Customer() {
    }

    public Customer(String loginName, String password, String realName, char gender, String phone, double accountNumber, String roleName, String property) {
        super(loginName, password, realName, gender, phone, accountNumber);
        this.roleName = roleName;
        this.property = property;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "roleName='" + roleName + '\'' +
                ", property='" + property + '\'' +
                "} " + super.toString();
    }
}
