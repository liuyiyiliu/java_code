package com.lyi.d4_reflect_field;

import org.junit.Test;

import java.lang.reflect.Field;

public class FieldDemo {

	@Test
	public void getDeclaredFields() throws Exception {

		//获取所有成员变量
		Class<Student> studentClass = Student.class;
		//表示该类的所有声明字段的Field对象数组
		for (Field field : studentClass.getDeclaredFields()) {
			System.out.println(field.getName()+ "\t" + field.getType());
		}

		//获得指定成员变量
		Class<Student> studentClass1 = Student.class;
		//name – 字段的名称 此类中指定字段的Field对象
		Field declaredField = studentClass1.getDeclaredField("age");
		System.out.println(declaredField.getName()+ "\t" + declaredField.getType());




	}

}
