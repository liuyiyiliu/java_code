package com.lyi.d5_abstract;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月24日 18:17
 */
public abstract class ParCard {
    private String userName;
    private double leftMoney;

    public abstract void apply(double money);

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(double leftMoney) {
        this.leftMoney = leftMoney;
    }
}
