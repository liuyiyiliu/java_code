package com.lyi.d5_api_stringbuilder;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月26日 18:47
 */
public class Test {
    public static void main(String[] args) {
//        设计一个方法 用于输出整型数组的内容
        int[] arr2 = null;
        System.out.println(getArr(arr2));

        int[] arr3 = {};
        System.out.println(getArr(arr3));

        int[] arr = {11,22,33,44,55};
        System.out.println(getArr(arr));
    }

    /**
     * 要考虑输入的数组是否为Null 空  有值
     * @param arr
     * @return
     */
    public static String  getArr(int[] arr){

        if(arr != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i < arr.length; i++) {
//                if (i == arr.length - 1) {
//                    sb.append(arr[i]);
//                } else {
//                    sb.append(arr[i]).append(",");
//                }
                sb.append(arr[i]).append(i == arr.length-1 ? "":",");
            }
            sb.append("]");
            return sb.toString();
        }else {
            return null;
        }
    }
}
