package com.lyi.d5_abstract;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月24日 18:02
 */
public class Test {
    public static void main(String[] args) {
//        目标： 先理解抽象类 然后在了解他的使用场景
        Dog dog = new Dog();
        dog.run();

        PlatCard platCard = new PlatCard();
         platCard.setUserName("路四百");
         platCard.setLeftMoney(10000);
         platCard.apply(1000);

        System.out.println("你的余额是：" + platCard.getLeftMoney());

    }
}
