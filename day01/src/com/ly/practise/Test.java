package com.ly.practise;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月20日 10:50
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入机票价格:");
        double price = scanner.nextDouble();

        System.out.println("请输入月份（1-12）:");
        int month = scanner.nextInt();

        System.out.println("请输入飞机舱类型:");
        String type = scanner.next();


        double endPrice = calculate(price, month, type);
        System.out.println("您总共需要支付金额是：" + endPrice);

    }

    /**
     *  根据输入的价格、月份、飞机舱型 计算 最终机票价格
     * @param price
     * @param month
     * @param type
     * @return  price
     */
    public static  double  calculate(double price, int month, String type) {
        if(month >= 5 && month<=10){
            switch (type) {
                case "头等舱":
                    price *= 0.9;
                    break;
                case "经济舱":
                    price *= 0.75;
                    break;
                default:
                    System.out.println("您输入的仓位类型有误---");
                    return -1;
            }
        }else if(month == 11 || month == 12 || month>=1 || month <= 4){
            switch (type) {
                case "头等舱":
                     price *= 0.65;
                     break;
                case "经济舱":
                    price *= 0.45;
                    break;
                    default:
                        return -1;

            }
        }else{

            System.out.println("你输入的月份有误，请重新输入");
            return  -1;
        }


        return price;
    }
}
