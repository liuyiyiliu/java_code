package com.ly.practise;

import java.util.Random;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月20日 12:05
 */
public class test3 {
    public static void main(String[] args) {
        String cake = getCake(5);
        System.out.println(cake);
    }

//    定义方法 随机产生一个5位的验证码，每位可能是数字、大写字母、小写字母  0  1 2

    /**
     * 方法返回值类型是String
     * 参数是位数
     * @return
     */
    public static  String getCake(int n){
        String code = "";
        Random random = new Random();
//        1.定义一个for循环,循环n次，一次生成随机字符
        for (int j = 0; j < n; j++) {
//            2.生成随机字符： 英文大写 小写 数字
            int type = random.nextInt(3);
            switch (type){
                case 0 :
//                    数字
                    int num =(random.nextInt(10) );
                    code += num;
                    break;
                case 1 :
//                    大写字母 (A65 -Z 65 +25)
                    char bigCh =(char) (random.nextInt(26) +65);
                    code += bigCh;
                    break;
                case 2 :
//                    小写字母(a97 -z 97+25)
                    char smallCh =(char) (random.nextInt(26) + 97);
                    code += smallCh;
                    break;
            }
        }
        return code;
    }
}
