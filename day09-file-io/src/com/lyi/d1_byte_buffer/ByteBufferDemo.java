package com.lyi.d1_byte_buffer;

import java.io.*;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年06月09日 21:50
 */
public class ByteBufferDemo {
    public static  final String SRC_FILE = "D:\\MyStudy\\test\\movie\\11-SpringBoot集成MybatisPlus.mp4";
    public static  final String DESC_FILE = "D:\\MyStudy\\test\\";
    public static void main(String[] args) throws Exception {
        Write();
        write2();

    }

    /**
     * 缓冲流
     */
    private static void write2() {
        Long startTime = System.currentTimeMillis();
        try(
                FileInputStream fis = new FileInputStream(SRC_FILE);
                BufferedInputStream bis = new BufferedInputStream(fis);
                FileOutputStream os = new FileOutputStream(DESC_FILE + "video2.avi");
                BufferedOutputStream bos = new BufferedOutputStream(os);
                ){
            byte[] buffer = new byte[1024];
            int len;
            while((len = bis.read(buffer))!= -1){
                bos.write(buffer,0,len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("使用低级的字节按照数组的形式复制文件需要耗时:" + (endTime  - startTime)/1000.0 + "s");
    }

    /**
     * 字节输入流 + 读取字节数组
     */
    private static void Write() {

        Long startTime = System.currentTimeMillis();
        try(
//        1. 字节输入流管道与原视频接通
                FileInputStream fileInputStream = new FileInputStream(SRC_FILE);

//        2.创建一个字节输出流管道与目标文件接通
                FileOutputStream fileOutputStream = new FileOutputStream(DESC_FILE + "video.avi");
        ){
//        3.定义一个字节数组转移数据
            byte[] buffer = new byte[1024];
            int len; // 定义每次读取的字节数

            while((len = fileInputStream.read(buffer))!= -1){
                fileOutputStream.write(buffer,0,len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("使用低级的字节按照数组的形式复制文件需要耗时:" + (endTime  - startTime)/1000.0 + "s");
    }
}
