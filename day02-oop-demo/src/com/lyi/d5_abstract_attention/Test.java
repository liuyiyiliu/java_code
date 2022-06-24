package com.lyi.d5_abstract_attention;

import com.lyi.d5_abstract.ParCard;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月24日 20:40
 */
public class Test {
    public static void main(String[] args) {
//        目标: 理解抽象类的特征和注意事项
//         1.类有的成员(成员变量、方法、构造器) 抽象类都具备
//        2.抽象类中不一定有抽象方法，有抽象方法一定是抽象类
//        3.一个类继承了抽象类，一定要重写类中所有抽象方法
//        4.不能用abstract 修饰变量、代码快、构造器
//        5. 抽象类得到了抽象方法，失去了创建对象的能力

//        抽象类不能创建方法 为什么呢？
//        假设验证： 可以常见对象 那么parCard.apply方法是可以用的 但是他只有声明 没有方法体
//        ParCard parCard = new ParCard() ;

//        final(最终 不能被继承) 与 abstract(用来给子类继承 重写方法) 互斥关系
    }
}

