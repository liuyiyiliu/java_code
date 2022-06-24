package com.lyi.d2_reflect_create;

/**
 *  第一步： 获取Class类对象
 * @author 95848
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {

//        1.通过类名.Class
        Class<Student> studentClass = Student.class;
        System.out.println(studentClass);

//        2.通过类的静态方法：forName(全限名：包名+类名)
        Class<?> forName = Class.forName("com.lyi.d2_reflect_create.Student");
        System.out.println(forName);

//        3.通过对象自身的方法 对象.getClass
        Student student = new Student("张三");
        System.out.println(student.getClass());
    }
    public static void print(){
        System.out.println("你好！！");
    }
}
