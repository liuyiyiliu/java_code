package com.lyi.d1_logback_aplicat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年06月04日 19:19
 */
public class Test {
/**
 *
 * 学习配置logback日志框架，记录程序的执行情况到控制台 到文件中
 *   1.导入jar包
 *   2.配置logback.xml 在src 下面
 *   3.获取日志对象 调取日志方法 public static final  Logger LOGGER = LoggerFactory.getLogger("Test")
 *
 *
 */

// 创建日志对象 代表日志技术
    public static final  Logger LOGGER = LoggerFactory.getLogger("Test");

public static void main(String[] args) {
    try {
        LOGGER.debug("main方法开始执行了");
        LOGGER.info("开始记录第二行日志-------------");
        int a = 2;
        int b = 0;
        LOGGER.trace("a =" + a);
        LOGGER.trace("b =" + b);
        System.out.println(a/b);
    } catch (Exception e) {
        e.printStackTrace();
        LOGGER.error("功能出现异常:" + e);
    }

}

}
