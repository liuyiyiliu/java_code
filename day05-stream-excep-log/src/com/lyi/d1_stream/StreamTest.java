package com.lyi.d1_stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年06月03日 17:53
 */
public class StreamTest {
//    了解stream流

    /**
     * Stream流式思想的核心:
     *   1.首先得到数组或者集合的Stream的流(传送带)
     *   2.接着用Stream流处理集合或者数组的元素
     *   3.stream流替换或者简化集合操作的API
     * 集合获取流的API:
     *   1.default Stream<E> stream();
     * 小结:
     *   集合获取Stream流用： stream()
     *   数组用: Arrays.stream(数组) Arrays.of(数组)
     * @param args
     */
    public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    Collections.addAll(names,"刘兰","刘买","刘巧芳","刘建媛","李媛","严寒");
    System.out.println(names);
//    取出首字母是刘的 并且打印出来
    ArrayList<String> words = new ArrayList<>();
    for (String name : names) {
        if(name.startsWith("刘")){
            words.add(name);
        }
    }
    System.out.println(words);
    names.stream().
            filter(s -> s.startsWith("刘")).
            filter(s -> s.length() == 3).
            forEach(s -> System.out.println(s));
    
//    获取流的几种方式
//        Collection 获取流
        Collection<Object> objects = new ArrayList<>();
        objects.stream();
//        Map 获取流
        HashMap<String, Integer> maps = new HashMap<>();
//        键流
        Stream<String> keys = maps.keySet().stream();
//        值流
        Stream<Integer> values = maps.values().stream();
//        键值流(整体)
        Stream<Map.Entry<String, Integer>> keyAndvalue = maps.entrySet().stream();

//        数组获取流
        String[]  myFamily = {"刘兰","刘买","刘巧芳","刘建媛"};
        Arrays.stream(myFamily).forEach(s-> System.out.println(s));
    }
}
