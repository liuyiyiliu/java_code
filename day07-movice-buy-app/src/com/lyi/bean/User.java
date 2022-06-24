package com.lyi.bean;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年06月04日 22:53
 */
public class User {
    private String loginName;
    private String password;
    private String realName;
    private char gender;
    private String phone;
    private double accountNumber; // 账户金额

    public User(String loginName, String password, String realName, char gender, String phone, double accountNumber) {
        this.loginName = loginName;
        this.password = password;
        this.realName = realName;
        this.gender = gender;
        this.phone = phone;
        this.accountNumber = accountNumber;
    }

    public User() {
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", realName='" + realName + '\'' +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
