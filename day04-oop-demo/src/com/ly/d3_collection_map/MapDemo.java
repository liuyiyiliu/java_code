package com.ly.d3_collection_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年06月02日 9:05
 */
public class MapDemo {
    public static void main(String[] args) {
//        5个学生选择景点 看哪个景点选择的人多
        ArrayList<String> list = new ArrayList<>();
        int index = 0;
        int index2 = 0;
        int index3 = 0;
        int index4 = 0;

        Map<Integer, String>  map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        map.put(5,"A");
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String>  entry: entries ){
            String value = entry.getValue();
            list.add(value);
        }

        for (String s : list ) {
            if(s.equals("A")){
                index++;
            }else if(s.equals("B")){
                index2++;
            }else if(s.equals("C")){
                index3++;
            }else {
                index4++;
            }
        }
        System.out.println(index);
        System.out.println(index2);
        System.out.println(index3);
        System.out.println(index4);


    }
}
