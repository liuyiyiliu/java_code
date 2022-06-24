package com.lyi.d8_api_zhengze;

import java.util.Scanner;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月27日 7:26
 */
public class Test {
    public static void main(String[] args) {
//        要求输入字符串的长度6-20位

            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入的你的验证码");
            String str = scanner.next();
        while (true) {
            Boolean command = checkQQ(str);
            if(command==true){
                System.out.println(command);
                break;
            }else{
                    System.out.println("您输入的密码有误 请重新输入");
                    String str2 = scanner.next();
                    str = str2;
            }
        }


    }
    public static  Boolean checkQQ(String str){
        if( str == null || str.length()> 20 || str.length()<6){
            return false;
        }
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c < '0' || c > '9')
                    return false;
            }
            return  true;
        }


}
