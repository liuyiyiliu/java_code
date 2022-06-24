package com.lyi.d1_static_test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月23日 10:12
 */
public class ArraysUtils {
    public static void main(String[] args) {

        int[]  ages1 = null;
        int[]  ages2 = {};
        int[] ages = new int[]{10,1,2,3,4};


        System.out.println(arraysToString(ages1));
        System.out.println(arraysToString(ages2));
        System.out.println(arraysToString(ages));


    }

    public static String arraysToString(int[] nums){

        if(nums == null){
            return null;
        }

        String s = Arrays.toString(nums);
        return s;
    }

    public static double getAverage(int[] nums){
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 1 ; i <= nums.length-2 ; i++) {
            Integer num1 = nums[i];
            sum += num1;
        }
        return sum/(nums.length-2);
    }

}
