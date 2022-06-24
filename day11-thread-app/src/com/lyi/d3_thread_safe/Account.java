package com.lyi.d3_thread_safe;

public class Account {
    private String loginId;
    private double money;

    public Account() {
    }

    public Account(String loginId, double money) {
        this.loginId = loginId;
        this.money = money;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void saveMoney(double money) {
        String name = Thread.currentThread().getName();
        if(this.money>=money){
            System.out.println(name + "的余额" + money);
            this.money -= money;
            System.out.println(name + "的余额" + this.money);
        }else{
            System.out.println("余额不足");
        }

    }
}
