package com.ly.practise;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月21日 19:10
 */
public class Account {
    /**
     * 1.定义账户类，用于后期创建账号对象封装用户的账户信息;
     * 2.账号类中信息至少包含(卡号、姓名、密码、余额、取现额度)
     * 3.需要准备ArrayList的集合，用于存储系统用户的账户对象
     * 4，需要展现欢迎页包含2个功能： 开户功能、登录账户
     */
    private String cardId;
    private String userName;
    private String passWord;
    private Double leftMoney;
    private Double quotaMoney; //取现额度



    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Double getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(Double leftMoney) {
        this.leftMoney = leftMoney;
    }

    public Double getQuotaMoney() {
        return quotaMoney;
    }

    public void setQuotaMoney(Double quotaMoney) {
        this.quotaMoney = quotaMoney;
    }

    public Account(String cardId, String userName, String passWord, Double leftMoney, Double quotaMoney) {
        this.cardId = cardId;
        this.userName = userName;
        this.passWord = passWord;
        this.leftMoney = leftMoney;
        this.quotaMoney = quotaMoney;
    }

    public Account() {
    }
}
