package com.lyi.d5_abstract;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月24日 18:21
 */
public class SilverCard extends ParCard {

    @Override
    public void apply(double money) {
        System.out.println("余额" + getLeftMoney());
        System.out.println("应该支付金额" + money);
        double silberMoney = 0.85 * money;
        System.out.println("实际支付" + silberMoney);
        setLeftMoney(getLeftMoney()-money);

    }
}
