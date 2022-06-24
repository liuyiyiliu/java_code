package com.lyi.d1_stream_io;

import java.io.FileWriter;
import java.util.Properties;

public class PropertyDemo {
    public static void main (String[] args) throws Exception {
//        键值对信息存储到属性文件中去
        Properties properties = new Properties();
        properties.setProperty("zhangsan","18");
        System.out.println(properties);
/**
 *  参数一： 输入流管道
 */
        properties.store(new FileWriter( "day01-io/src/user.properties"),"This is Properties!!!");
    }
}
