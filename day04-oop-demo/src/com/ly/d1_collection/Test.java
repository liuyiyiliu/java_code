package com.ly.d1_collection;

import com.sun.org.apache.xml.internal.res.XMLErrorResources_tr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月28日 15:20
 */
public class Test {
    public static void main(String[] args) {
//        学习 iterator 方法   多态   父类引用子类对象  List集合特点 有序 重复 有索引
        Collection<String> list = new ArrayList<String>();
        list.add("卢");
        list.add("卢");
        list.add("JAVA");
        list.add("JAVA");
        list.add("卢");
        System.out.println(list);
//       无序 不重复 无索引
        Collection<String> list1 = new HashSet<>();
        list1.add("卢");
        list1.add("卢");
        list1.add("JAVA");
        list1.add("JAVA");
        list1.add("卢");
        System.out.println(list1);

//        循环遍历删除元素
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if(iterator.next().equals("JAVA")){
                iterator.remove();
            }
        }
        System.out.println(list);

// lambda表达式
        list1.forEach(s -> {
            System.out.println(s);
        });
    }
}
