package com.lyi.d3_reflect_contructor;

import com.lyi.d4_reflect_field.Student;
import org.junit.Test;

import java.lang.reflect.Constructor;

public class ReflectDemo2 {

	@Test
	public void getDeclaredConstructor() throws Exception {
	//	 通过无参构造器获取对象
		Class<Student> studentClass = Student.class;
		Constructor<Student> cons = studentClass.getDeclaredConstructor();
		System.out.println(cons.getName()+"\t" + cons.getParameterCount());
		cons.setAccessible(true);
		// 对于私有的方法 需要暴力反射
		Student student = cons.newInstance();
		System.out.println(student);

		System.out.println("============有参构造器=============");
		//通过有参构造器获取对象
		Class<Student> studentClass2 = Student.class;
		Constructor<Student> cons2 = studentClass2.getDeclaredConstructor(String.class,int.class);
		//  parameterTypes – 参数数组  返回值：具有指定参数列表的构造函数的Constructor对象
		System.out.println(cons2.getName()+"\t" + cons2.getParameterCount());
		//initargs – 作为参数传递给构造函数调用的对象数组, 返回值：通过调用此对象表示的构造函数创建的新对象
		Student student1 = cons2.newInstance("张三"   ,500);
		System.out.println(student1);

	}


}
