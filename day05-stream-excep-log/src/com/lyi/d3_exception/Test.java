package com.lyi.d3_exception;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年06月04日 10:15
 */
public class Test {
    /**
     * 编译时 异常 和 运行时 异常
     *      1.把异常抛出去
     *      2.通过try-catch-finally
     */
    public static void main(String[] args) {
        System.out.println("程序开始-----");
//        ArithmeticException: 数据操作异常
        try {
            check(10,0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("程序结束-----");

//        ArrayIndexOutOfBoundsException 越界异常
        int[] num ={1,2,3};
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        try {
            System.out.println(num[3]);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        NullPointerException  空指针异常
        String name= null;
        try {
            System.out.println(name.length());
        } catch (Exception e) {
            e.printStackTrace();
        }

//      NumberFormatException： 数字转换异常
        String s = "123aa";
        int i = 0;
        try {
            i = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println(i);

//      ClassCastException: 类型转换异常
        Object obj = 1;
        String s2 = (String)obj;

    }
    public static void check(int a, int b) throws Exception {
        int c = a/b;
        System.out.println(c);
    }
}
