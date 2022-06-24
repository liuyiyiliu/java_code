package com.ly.loop;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月18日 15:27
 */
public class ForTest {
    public static void main(String[] args) {

        int count = 0;
        for (int i = 100; i <999 ; i++) {
            int a = i % 10;
            int b =  i / 10 % 10;
            int c = i/100;
            if(a*a*a+ b*b*b+c*c*c == i){
                System.out.print(i + "\t");
                count++;
            }
        }
        System.out.println();
        System.out.println("水仙花数的数量是：" + count);
    }
}
