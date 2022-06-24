package com.ly.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年06月10日 22:15
 */
public class Test {
    public static void main(String[] args) {
        Student liu = new Student("liu", 20.0);
        Student liu2 = new Student("liu2", 19.0);

        int i = liu.compareTo(liu2);
        System.out.println(i);

        String name = "123@569";
        String substring = name.substring(0, name.indexOf("@"));
        System.out.println(substring);
        int i1 = name.indexOf(name.substring(0, name.indexOf("@")));
        System.out.println(i1);

        List<String> list = new ArrayList<>();
        Collections.addAll(list,"一","二","三");
        int i2 = list.indexOf("一");

        System.out.println(i2);
    }

    private static void sort() {
    }

}
