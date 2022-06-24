package com.lyi.d2_final_code;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月24日 9:27
 */
public class Test2 {


    //    静态成员变量
    public final static int age = 15;

//   final 修饰实例成员变量（调用对象的时候 使用 只能赋值一次 导致创建对象时候 只有这一个name 几乎不用）
    public final String name = "孙悟空";

    public static void main(String[] args) {
/**
 * 目标： final修饰变量: 变量有且只能被赋值一次
 * 局部变量
 * 成员变量
 *     静态成员变量
 *     实例成员变量
 */
//局部变量
        final double rate = 3.14;
//        rate = 3.19;
//        Student.age = 20;
        //   final修饰局部变量
        buy(0.8);

        //   final 修饰实例成员变量（调用对象的时候 使用 只能赋值一次 导致创建对象时候 只有这一个name 几乎不用）
        Test2 test2 = new Test2();
        System.out.println(test2.name);

// final 修饰引用数据类型时 地址值不能改变 但是指向的对象内容可以改变
        final Teacher teacher = new Teacher("篮球、音乐");
     // teacher= null;
        teacher.setHobby("体育");
        System.out.println(teacher.getHobby());





    }

//   final修饰局部变量
    public static  void buy(final  double z){
//           z = 0.1; 第二次赋值
    }

}


