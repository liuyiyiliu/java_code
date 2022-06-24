package com.lyi.d4_exception_handle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年06月04日 10:42
 */
public class ExceptionDemo3 {
//    编译时异常 为了提醒你在代码某些地方可能出错 处理异常的方式 1.内部处理 2.外部使用
public static void main(String[] args) {
    System.out.println("程序开始时------------");
    parseDate("2022-6-4 10:46:55");
    System.out.println("程序结束时------------");

}


// 捕获异常
    private static void parseDate(String date)  {

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy、MM-dd HH:mm:ss");
            Date parse = sdf.parse(date);
            System.out.println(parse);
            FileInputStream fileInputStream = new FileInputStream("C:/liuyi");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
