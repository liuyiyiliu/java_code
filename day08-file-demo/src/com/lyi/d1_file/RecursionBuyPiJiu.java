package com.lyi.d1_file;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年06月08日 9:42
 */
public class RecursionBuyPiJiu {

//    总共啤酒   剩余盖子 剩余瓶子
    public static  int totalAmount;
    public static  int leftCapAmount;
    public static  int leftBattleAmount;



    public static void main(String[] args) {

        buyPiJiu(10);

        System.out.println("可购买啤酒数" + totalAmount);
        System.out.println("剩余瓶盖数" + leftCapAmount);
        System.out.println("剩余空瓶数" + totalAmount);
    }

    /**
     * 目标: 学习 分啤酒  10元 可以买几瓶   2元/瓶  4盖子 可以换一瓶 2个空瓶 换一瓶
     */
    public static void buyPiJiu(int n ){
//        现有的钱本身可以买多少瓶
        int buyNumber = n / 2;
        totalAmount += buyNumber;


//        统计本轮总的盖子数和瓶子数
        int capAmount = leftCapAmount + buyNumber;
        int battleAmount = leftBattleAmount + buyNumber;


//        把瓶子和盖子换算成钱
        int allMoney = 0;

        if(capAmount>=4){
            allMoney += (capAmount/4) * 2;
        }
         leftCapAmount = capAmount % 4;


        if(battleAmount>=2){
            allMoney +=  (battleAmount/2) * 2;
        }
        leftBattleAmount = battleAmount % 2;

        if(allMoney>=2){
            buyPiJiu(allMoney);
        }



    }
}
