package com.ly.arraylist;

import java.util.ArrayList;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月21日 17:57
 */
public class TestArrayList {

    //集合中剔除分数低于60分
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(80.0);
        arrayList.add(55.0);
        arrayList.add(45.0);
        arrayList.add(90.0);
        arrayList.add(100.0);

        System.out.println(arrayList);

//      从前面遍历 要考虑到删除之后 索引值向前进1
//        for (int i = 0; i < arrayList.size(); i++) {
//            if(arrayList.get(i) <= 60 ){
//                arrayList.remove(i);
//                i--;
//            }
//        }
        System.out.println(arrayList);
//      从后面遍历 剔除 不用考虑到元素会向前进1
        for (int i = arrayList.size() -1 ; i >= 0; i--) {
            if (arrayList.get(i) <= 60) {
                arrayList.remove(i);
            }
        }
        System.out.println(arrayList);
    }
}
