package com.ly.d2_collection_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月29日 21:46
 */
public class Test {

    public static void main(String[] args) {
//        学习LinkHashSet 特点 有序 不重复 无索引
        Set<String> set = new LinkedHashSet<>();
        set.add("String");
        set.add("String");
        set.add("JAVA");
        set.add("JAVA");
        set.add("Spring");
        set.add("Spring");
        System.out.println(set);
    }
}
