package com.ly.d2_collection_set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月29日 22:35
 */
public class TreeTest {
    public static void main(String[] args) {
//        目标: TreeSet 自定义排序
        Set<Apple> set = new TreeSet<>();
        set.add(new Apple("青苹果","红色2",25,15.8));
        set.add(new Apple("红富士1","红色1",151,15.6));
        set.add(new Apple("红富士","红色",15,9.8));
        set.add(new Apple("黑富士","黑色",20,30.8));
        System.out.println(set);

//        方法二 集合自带比较规则 （就近原则）
        Set<Apple> apples = new TreeSet<>(new Comparator<Apple>() {

            @Override
            public int compare(Apple o1, Apple o2) {
//                return o1.getWeight() - o2.getWeight(); 升序
//                return o2.getWeight() - o1.getWeight();  降序
//                当对浮点型进行比较时
                return Double.compare(o1.getPrice(), o2.getPrice()); //升序

            }
        });
        apples.add(new Apple("青苹果2","红色2",25,15.8));
        apples.add(new Apple("红富士1","红色1",151,15.6));
        apples.add(new Apple("红富士","红色",15,9.8));
        apples.add(new Apple("黑富士","黑色",20,30.8));
        System.out.println(apples);

    }
}
