package com.ly.array;

import java.util.Random;
import java.util.Scanner;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月19日 10:43
 */
public class ArrayDemo {
    public static void main(String[] args) {

        int[] nums = {-12,-18,-10};
        for (int num : nums) {
            System.out.println(num);
        }
        System.out.println(max(nums));

        int  max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > max){
                max = nums[i];
            }
        }
        System.out.println(max);

    }
//    获取最大值
    public static int max(int[] nums){
        int max = nums[0];;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
//
}
