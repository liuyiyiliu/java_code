package com.ly.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月20日 11:14
 */
public class Test2 {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入n的值（要求大于等于101）：" );
//        int i = sc.nextInt();
//        List suShu = getSuShu(i);
//        System.out.println(suShu);

        for (int j = 101; j <= 200 ; j++) {
            boolean flag = true;
            for (int k = 2; k < j/2; k++) {
                if(j % k == 0){
                     flag = false;
                     break;
                }
            }
            if (flag) {
                System.out.print(j + "\t");
            }
            
        }
    }

    /**
     * 素数规则 除以2 一直到他本身的一半 并且结果只有1 和 本身
     * @param n
     * @return
     */
    public static List getSuShu(int n){

        ArrayList arrayList = new ArrayList();
        for (int i = 1; i <= n; i++) {
//            判断当前遍历的这个数据是否是素数
            for (int j = 2; j <= i/2; j++) {
                if(i%j  == 0){
                    return arrayList;
                }else{
                    arrayList.add(i);
                }
            }

        }
        return arrayList;
    }
}
