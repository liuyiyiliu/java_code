package com.lyi.d2_stream_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年06月04日 10:07
 */
public class TestDemoCollect {
//    把流转化为集合或者数组
public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    Collections.addAll(names,"刘兰","刘买","刘巧芳","刘建媛","李媛","严寒");
    System.out.println(names);

//    获取流的对象
    Stream<String> liu = names.stream().filter(s -> s.startsWith("刘"));
    List<String> collect = liu.collect(Collectors.toList());
    System.out.println(collect);

}
}
