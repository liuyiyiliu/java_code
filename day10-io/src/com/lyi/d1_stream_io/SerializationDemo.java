package com.lyi.d1_stream_io;

import java.io.*;

/**
 * 序列化与反序列化: 对象流写一个 读取对象和保存对象的工具类  序列化ID是为了保证成功进行反序列化
 */
public class SerializationDemo {
    public static void main(String[] args) throws Exception {
        Student student = new Student("包子1",25);
        Student student2 = new Student("包子2",25);
        Student student3 = new Student("包子3",25);
        writeObject(student);
        writeObject(student2);
        writeObject(student3);

        Object o = readObject();
        System.out.println(o);
    }

    // 保存对象，序列化
    public static void writeObject(Object o){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("day01-io/src/testSerialization"));
            oos.writeObject(o);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("保存对象异常" + e.getMessage());

        }
        System.out.println("序列化完成");
    }

    // 读取对象，反序列化
    public static  Object readObject() throws Exception {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(
                    new FileInputStream("day01-io/src/testSerialization2"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("读取对象异常" + e.getMessage());
        }
        Student student = (Student) ois.readObject();
        return student;
    }
}
