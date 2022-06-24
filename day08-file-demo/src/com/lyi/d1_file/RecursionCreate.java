package com.lyi.d1_file;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年06月07日 15:27
 */
public class RecursionCreate {

    /**
     * 递归三步骤
     *   1.公式
     *   2.终结点
     *   3.方向走向终结点
     * @param args
     */
    public static void main(String[] args) {

        System.out.println( 2 + "的阶乘是:"+ multip(2));

        System.out.println("---------------------------");

        System.out.println("阶加是: " + sum(3));

        System.out.println(test(1));
    }

    /**
     * 求 1*2*（n-1）=f(n-1)*n
     * @param n
     * @return
     */
    public  static  int  multip(int n){
        if(n==1){
            return 1;
        }else{
            return multip(n-1) * n;
        }
    }

    public static  int sum(int n){
        if(n==1){
            return 1;
        }else{
            return sum(n-1) + n;
        }
    }
    public static  int  test(int n){
        if(n==10){
            return  1;
        }else{
            return  (test(n+1) +1) *2;
        }
    }
}
