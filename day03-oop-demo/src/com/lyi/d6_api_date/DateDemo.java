package com.lyi.d6_api_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月26日 19:11
 */
public class DateDemo {
    public static void main(String[] args) throws ParseException {

        System.out.println("-----------------------------");

        //       1.创建一个Date类的对象： 代表系统此刻日期时间对象
        Date date = new Date();
        System.out.println(date);
        //        2.获取当前时间毫秒值
        long time = date.getTime();
        time += (60*60+121) *1000;
        //        3.时间毫秒值 转化为日期 / setTime(time)
        Date date1 = new Date(time);
        date.setTime(time);
        System.out.println(date1);
        System.out.println(date);


//      格式化这个日期对象(指定最终格式化的形式)
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//       格式化日期转化为指定格式
        String format = sdf.format(date);
        System.out.println(format);

        //121s 之后字符串时间
        String format1 = sdf.format(date.getTime() + 121 * 1000);
        System.out.println(format1);

//      把字符串转化为日期
        String str = "2022-05-27 14:17:55";
        Date parse = sdf.parse(str);
        System.out.println(parse);



    }
}
