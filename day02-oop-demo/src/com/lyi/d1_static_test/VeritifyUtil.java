package com.lyi.d1_static_test;

import java.util.Random;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月23日 10:03
 */

public class VeritifyUtil {

    /**
     * 随机生成数字
     * @param  n  需要生成的位数
     * @return 字符串
     */
    public static String randomCode(int n){

        String code = "";
        String  datas = "0123456789";
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int index = random.nextInt(datas.length());
            code += index;
        }
        return code;
    }
}
