package com.lyi.d3_constant;

import com.sun.org.apache.xml.internal.res.XMLErrorResources_tr;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月24日 10:28
 */
public class ConstantDemo {

//    作为经常出现的常量的替换
    public static final  String SCHOOL_NAME = "南京大学";

    public  static final String USER_NAME= "admin";

    // 常量作为信息标签和分类  实现软编码形式
    public static final int UP = 1;
    public static final int DOWN = 2;
    public static final int LEFT = 3;
    public static final int RIGHT = 4;
    public static void main(String[] args) {
        System.out.println(SCHOOL_NAME);
        System.out.println(SCHOOL_NAME);
        System.out.println(SCHOOL_NAME);

        if (USER_NAME.equals("")){

        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的操作:");
        System.out.println("1.向上走");
        System.out.println("2.向下走");
        System.out.println("3.向左走");
        System.out.println("4.向右走");
        int flag = scanner.nextInt();
        switch (flag){
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
