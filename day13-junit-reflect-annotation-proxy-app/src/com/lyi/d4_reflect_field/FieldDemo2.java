package com.lyi.d4_reflect_field;

import org.junit.Test;

import java.lang.reflect.Field;

public class FieldDemo2 {

	@Test
	public void getParameterField() throws Exception {


		Class<Student> studentClass = Student.class;
		Field ageF = studentClass.getDeclaredField("age");
		// 暴力打开私有成员的变量的访问大小
		ageF.setAccessible(true);
		Student student = new Student();
		//	设置成员变量的值
		//参数：obj - 应修改其字段的对像 value – 被修改的obj字段的新值
		ageF.set(student,20);
		//获得成员变量的值
		System.out.println(ageF.get(student));
	}
}
