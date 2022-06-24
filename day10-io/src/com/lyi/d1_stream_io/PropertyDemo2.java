package com.lyi.d1_stream_io;

import java.io.FileReader;
import java.util.Properties;

public class PropertyDemo2 {
    public static void main(String[] args) throws Exception {

//        属性文件中 加载到键值对象
        Properties properties = new Properties();
        System.out.println(properties);

        properties.load(new FileReader("day01-io/src/user.properties"));
        System.out.println(properties);

        Object zhangsan = properties.get("zhangsan");
        System.out.println(zhangsan);



    }
}
