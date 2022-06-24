package com.lyi.d2_commons_io;

import javafx.scene.shape.Path;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CommonsDemo {
    public static void main(String[] args) throws Exception{

//        复制文件
        IOUtils.copy(new FileInputStream("day01-io/src/user.properties"),
                new FileOutputStream("day01-io/src/user.properties2"));
//        文件复制到某个文件夹
        FileUtils.copyFileToDirectory(new File("day01-io/src/user.properties"),
                new File("D:/Resource"));
//        文件夹复制到文件夹
        FileUtils.copyDirectoryToDirectory(new File("D:/Resource"),
                new File("D:/Resources"));

//        删除文件夹
        FileUtils.deleteDirectory(new File("D:/Resources"));
//        jdk1.7 推出一行复制出内容  New IO

    }
}
