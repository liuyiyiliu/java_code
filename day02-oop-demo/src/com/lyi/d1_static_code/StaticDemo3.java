package com.lyi.d1_static_code;

import java.util.ArrayList;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月23日 18:15
 */
public class StaticDemo3 {

    public static ArrayList<String> cards = new ArrayList<>();

    static {
        String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] colours = {"♦","♠","♥","♣"};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < colours.length; j++) {
                String card = numbers[i] + colours[j];
                cards.add(card);
            }
        }
        cards.add("大鬼");
        cards.add("小鬼");

    }

    public static void main(String[] args) {
        System.out.println("新牌" + cards);
    }

}
