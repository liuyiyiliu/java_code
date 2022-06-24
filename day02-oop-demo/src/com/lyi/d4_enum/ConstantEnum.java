package com.lyi.d4_enum;

import java.util.Scanner;



/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月24日 13:00
 */
public class ConstantEnum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的操作:");
        System.out.println("1.向上走");
        System.out.println("2.向下走");
        System.out.println("3.向左走");
        System.out.println("4.向右走");
        String flag = scanner.next();

        // 把字符串转化为枚举类型
        move(Enum.valueOf(Direation.class,flag));

    }
    public static void move(Direation d) {

        switch (d) {
            case UP:
                System.out.println("向上走");
                break;
            case DOWN:
                System.out.println("向下走");
                break;
            case LEFT:
                System.out.println("向左走");
                break;
            case RIGHT:
                System.out.println("向右走");
                break;
        }
    }

}
