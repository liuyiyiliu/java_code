package com.ly.array;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月19日 17:10
 */
public class BubbleSort {
    public static void main(String[] args) {

        char[] chars ={'a','b','c','d'};
        char date[] = {'a','b','c'};
        System.out.println(chars);
        System.out.println(date);
        System.out.println(chars + ":"+date);


//        从小到大排序
        int[] nums = {5,4,10,1,50};

        for (int i = 0; i < nums.length-1 ; i++) {
            for (int j = 0;j< nums.length-1-i ; j++){
                if(nums[j] > nums[j+1]){
                     int temp = nums[j+1];
                     nums[j+1] = nums[j];
                     nums[j] = temp;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }


    }
}
