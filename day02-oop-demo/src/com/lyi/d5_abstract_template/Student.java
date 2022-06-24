package com.lyi.d5_abstract_template;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月24日 23:18
 */
public abstract  class Student {
    public  final void call(){
        System.out.println("\t\t\t<<我的爸爸>>\t\t\t");
        write();
        System.out.println("我的爸爸最棒了！！！");
    }
    public abstract void write();
}
