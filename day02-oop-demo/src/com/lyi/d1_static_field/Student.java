package com.lyi.d1_static_field;

/**
 * @Description: TODO
 * @author: liu yi
 * @date: 2022年05月22日 21:07
 */
public class Student {
    private String name;
    private  int age;
    private static int  maxNum = 100;

    public static int getMaxAge(int age1,int age2){
        return age1>age2 ? age1 : age2;
    }

    public void study(){
        System.out.println( name + "和我一起打篮球");
    }

    public Student() {
    }

    public static void main(String[] args) {
//        通过对象和类名访问，不推荐对象访问
        System.out.println(Student.getMaxAge(10, 12));
        System.out.println(Student.maxNum);

        Student student = new Student();
        student.name = "卢思冰";
        student.study();
    }
}
