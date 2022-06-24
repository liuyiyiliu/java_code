package com.lyi.d1_file;

import java.io.File;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年06月06日 23:04
 *  学习创建文件
 */
public class FileCreate {

    /**
     * 1. 通过绝对路径访问
     * 2.通过相对路径
     * @param args
     */
    public static void main(String[] args) {

//        绝对路径
        File file = new File("D:\\Resource");
        long size = file.length();
        System.out.println(size);

        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.isDirectory());//false
        System.out.println(file.isFile()); //true
        System.out.println(file.exists()); //true

//        listFiles获取第一层的目录
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }


//        相对路径: 一般定位模块中的文件的 相对到工程下
        File file2 = new File("day08-file-demo/src/data.txt");
        System.out.println(file2.length());

//        3. File 创建对象 可以是文件也可以是文件夹

        File file3 = new File("D:\\Resource");
//        判断这个路径是否存在 这个文件夹存在否
        boolean exists = file3.exists();
        System.out.println(exists);


    }
}
