package com.ly.array;

import java.util.Random;
import java.util.Scanner;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月19日 14:28
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
//        目标： 键盘录入一组工号，最终要随机输出一组出来作为排名
//        1.动态初始话数组，存储5个工号
        int[] codes = new int[5];
//
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < codes.length; i++) {
            System.out.println("请输入第" +(i+1) + "员工号");
            int code = scanner.nextInt();
            codes[i] = code;
        }

        Random random = new Random();
        for (int i = 0; i < codes.length ; i++) {
            //随机获得数组里面的一个索引
            int index = random.nextInt(codes.length);
            int temp = codes[index];
            codes[index] = codes[i];
            codes[i] = temp;
        }
        System.out.println("---------------------------------随机排序------------------");
        for (int i = 0; i < codes.length; i++) {
            System.out.println(codes[i]);
        }

    }
}
