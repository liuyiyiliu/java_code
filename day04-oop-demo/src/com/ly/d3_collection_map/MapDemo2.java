package com.ly.d3_collection_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.BiConsumer;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年06月02日 9:29
 */
public class MapDemo2 {
    public static void main(String[] args) {
//      目标:  80个学生选择景点 看哪一个景点选择的人多


        String[] sights = {"A","B","C","D"};
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 80; i++) {
//            获取80个学生选择的景点目标
            sb.append(sights[random.nextInt(sights.length)]);
        }
        System.out.println(sb);
//        定义map集合存储每个景点选择的数量 A=17, B=16, C=18, D=29
        Map<Character, Integer>  map = new HashMap<>();
//        遍历80个学生选择的数据
        for (int i = 0; i < sb.length(); i++) {
//            提取当前所选的景点字符
            char ch = sb.charAt(i);
//            判断是否在集合里面
            if(map.containsKey(ch)){
//                存在 让 integer + 1
                 map.put(ch,map.get(ch) + 1);
            }else{
                map.put(ch,1);
            }
        }
        System.out.println(map);



    }
}
