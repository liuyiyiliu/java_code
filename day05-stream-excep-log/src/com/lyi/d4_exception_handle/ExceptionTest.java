package com.lyi.d4_exception_handle;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年06月04日 13:16
 */
public class ExceptionTest {
    public static void main(String[] args) {

    }
    public static void printPrice(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入你的电脑价格");
        String next = scanner.next();
        Double price = Double.valueOf(next);




    }
}
