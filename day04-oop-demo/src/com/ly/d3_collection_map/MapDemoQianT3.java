package com.ly.d3_collection_map;

import java.util.*;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年06月03日 9:27
 */
public class MapDemoQianT3 {
    //        业务场景 当一个人可以选择多个景区的时候 我需要计算哪一个景区选取的人 多 String 是指人 List<String>指景区
    public static void main(String[] args) {

//        记录每个学生选取的景点
        Map<String, List<String>> data = new HashMap<>();
        List<String> select1 = new ArrayList<>();
//        指定集合里面添加元素
        Collections.addAll(select1,"A","B","C");
        data.put("闫贵宝",select1);
       ;
        List<String> select2 = new ArrayList<>();
        Collections.addAll(select2,"A","C");
        data.put("卢思冰",select1);

        List<String> select3 = new ArrayList<>();
        Collections.addAll(select3,"A","B","C","D");
        data.put("乔明刚",select3);

        System.out.println(data);

//        获取每个景点的选择人的数量
        Map<String, Integer>  infos = new HashMap<>();

//        提取所有人选择的景点信息
        Collection<List<String>> values = data.values();
//      values =  [[A, B, C], [A, B, C, D], [A, B, C]]
//                    value
        System.out.println(values);

        for (List<String> value : values) {
            for (String s : value) {
//                System.out.print(s); //指的是 ABCABCDABC
                if(infos.containsKey(s)){
                    infos.put(s,infos.get(s)+1);
                }else{
                    infos.put(s,1);
                }
            }
        };
        System.out.println(infos);






    }
}
