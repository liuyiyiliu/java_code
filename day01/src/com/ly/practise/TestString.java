package com.ly.practise;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月21日 9:19
 */
public class TestString {
    public static void main(String[] args) {
        String s = "abc";
        String s2 = "ab";
        String s3 = s2 + "c";

        System.out.println(s==s3);



        String s4 = "a" + "b" + "c";
        System.out.println(s4 == s);
    }
}
