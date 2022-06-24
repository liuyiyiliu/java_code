package com.ly.d2_collection_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年06月01日 22:47
 */
public class GameDemo2 {
    public   static List<Card>  allCards = new ArrayList<>();
    static{
        String[] sizes = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] colors = {"♥","♣","♦","♠"};

        int index = 0 ;
        for (String size : sizes ) {
            index ++;
            for (String color : colors) {
                Card card = new Card(size, color, index);
                allCards.add(card);
            }
        }
        Card smallcard = new Card("", "小鬼",++index);
        Card bigcard   = new Card("", "大鬼",++index);
        allCards.add(smallcard);
        allCards.add(bigcard);

    }
    public static void main(String[] args) {

        System.out.println("新牌：" + allCards );
        Collections.shuffle(allCards);

        System.out.println("洗牌：" + allCards );


        List<Card> lu = new ArrayList<>();
        List<Card> liu = new ArrayList<>();
        List<Card> yan = new ArrayList<>();

        //        需要保留三张牌作为底牌

        for (int i = 0; i < allCards.size()-3; i++) {
            if(i % 3 == 0){
                lu.add(allCards.get(i));
            }else if(i % 3 == 1){
                liu.add(allCards.get(i));
            }else if(i % 3 == 2){
                yan.add(allCards.get(i));
            }
        }
        List<Card> lastThreeCards = allCards.subList(allCards.size() - 3, allCards.size());

        sortCards(lu);
        sortCards(liu);
        sortCards(yan);
        sortCards(lastThreeCards);

        System.out.println(lu);
        System.out.println(liu);
        System.out.println(yan);

        System.out.println(lastThreeCards);



    }

    private static void sortCards(List<Card> list) {
        Collections.sort(list,new Comparator<Card>() {

            @Override
            public int compare(Card o1, Card o2) {
                return o1.getIndex()-o2.getIndex();
            }
        });
    }
}
