package com.ly.d2_collection_test;

import java.util.*;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年06月01日 16:29
 */
public class GameDemo {
    /**
     * 1.定义一个静态的集合存储54张牌
     * @param args
     */
    public static void main(String[] args) {
/**
 * 1.做牌
 * 2.洗牌
 * 3.定义3个玩家
 * 4.发牌
 * 5.排序（拓展，了解）
 * 6.看牌
 */
        ArrayList<String> list = new ArrayList<>();
        String[] nums = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] colors = {"♥","♣","♦","♠"};
        int index = 0;
        for (int i = 0; i < nums.length ; i++) {
            for (int j = 0; j < colors.length; j++) {
                 String num= colors[j]+nums[i];
                 list.add(num);
            }
        }
        list.add("大鬼");
        list.add("小鬼");
        System.out.println("新牌：" + list);
        Collections.shuffle(list);
        System.out.println("洗牌 :" + list);

        ArrayList<String> game = new ArrayList<>();
        ArrayList<String> game2 = new ArrayList<>();
        ArrayList<String> game3 = new ArrayList<>();

//        需要保留三张牌作为底牌
//        for (int i = 0; i < list.size()-3; i++) {
//
//            if(i % 3 == 0){
//                game.add(list.get(i));
//            }else if(i % 3 == 1){
//                game2.add(list.get(i));
//            }else if(i % 3 == 2){
//                game3.add(list.get(i));
//            }
//        }
//        sortCards(game);
        Collections.sort(game);
        Collections.sort(game2);
        Collections.sort(game3);
        System.out.println(game);
        System.out.println(game2);
        System.out.println(game3);




            System.out.print(list);


    }

    /**
     * 自定义排序方式
     * @param game
     */
    private static void sortCards(ArrayList<String> game) {
        Collections.sort(game, new Comparator<String>(){

            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
    }
}
