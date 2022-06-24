package com.lyi.d3_reflect_contructor;



import com.lyi.d4_reflect_field.Student;
import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 *
 * 目标：创建class对象 获得constructor对象  创建对象
 * @author 95848
 */
public class ReflectDemo {


    @Test
    public void getConstructors(){
        // 1.获取Class对象
        Class<?> aClass = Student.class;

        // 2.包含一个数组 Constructor对象反射由此表示的类的所有公共构造函数
        Constructor<?>[] constructors = aClass.getConstructors();
        // 3.遍历所有的公共的构造方法
        for (Constructor<?> constructor : constructors) {
            System.out.println("构造器名称:" + constructor.getName() +
                    ";构造器的参数个数：" + constructor.getParameterCount());
        }

    }

    @Test
    public void getDeclaredConstructors(){
        // 1.获取Class对象
        Class<?> aClass = Student.class;
        // 2.包含一个数组 Constructor对象反射由此表示的类的所有公共构造 类对象
        Constructor<?>[] constructors = aClass.getDeclaredConstructors();
        // 3.遍历所有的公共的构造方法
        for (Constructor<?> constructor : constructors) {
            System.out.println("构造器名称:" + constructor.getName() +
                    ";构造器的参数个数：" + constructor.getParameterCount());
        }

    }

    @Test
    public void getDeclaredConstructor() throws Exception {
    //    目的： 获得有参的方法的构造器
        Class<?> aClass = Student.class;
        /**
         * parameterTypes – 参数数组
         */
        Constructor<?> constructor = aClass.getDeclaredConstructor(String.class,int.class);
        Student student = (Student) constructor.newInstance("张三", 500);
        System.out.println(student);


    }


}
