package com.ly.string;

import java.util.Random;
import java.util.Scanner;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月21日 11:25
 */
public class TestString {
    public static void main(String[] args) {
        String datas = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(datas.length());
            char c = datas.charAt(index);
            System.out.print(c);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入十一位的手机号");

        String num = scanner.next();
        String subStart = num.substring(0, 3);
        String subEnd = num.substring(7);
        String code = subStart + "****" +subEnd;
        System.out.println(code);


    }
}
