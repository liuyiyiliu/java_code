package com.lyi.d5_abstract;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月24日 18:20
 */
public class PlatCard extends ParCard {
    @Override
    public void apply(double money) {
        System.out.println( getUserName()+"的余额是" + getLeftMoney());
        System.out.println("按理说应该支付的金额" + money);

        Double platMoney = 0.8*money;
        System.out.println("实际支付金额" + platMoney);
        if(getLeftMoney()< money){
            System.out.println("所支付金额大于余额");
        }else {
            setLeftMoney(getLeftMoney()-platMoney);
        }

    }
}
