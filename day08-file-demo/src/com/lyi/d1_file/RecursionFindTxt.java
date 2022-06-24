package com.lyi.d1_file;

import java.io.File;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年06月08日 8:36
 */
public class RecursionFindTxt {
    public static void main(String[] args) {
        File file = new File("D:\\MyStudy");
        String fileName = "hello.txt";

        searchFile(file,fileName);
    }

    /**
     *  目标: 搜索某个目录下的全部文件，找到我们需要的文件
     * @param dir  被搜索的目录
     * @param fileName  被搜的文件名称
     */
    public static void searchFile(File dir,String fileName){
//        1.判断dir是目录
        if(dir.isDirectory() && dir != null){

//           2.获取当前目录下的一级文件对象
            File[] files = dir.listFiles();  // null []

//            3.判断一级文件对象是否存在   存在才遍历
            if(files.length > 0 && files != null) {
                for (File file : files) {
//                    4.判断一级文件对象时 文件 还是目录
                    if(file.isFile() ){
//                       6. 如果名称是我们要找的 直接输出来 即可
                        if(file.getName().contains(fileName)){
                            System.out.println(file.getAbsolutePath());
                        }
                    }else{
//                       5. 当前对象还是文件夹 继续循环
                        searchFile(file,fileName);
                    }
                }
            }
        }else{
            System.out.println("该目录不存在");
        }

    }
}
