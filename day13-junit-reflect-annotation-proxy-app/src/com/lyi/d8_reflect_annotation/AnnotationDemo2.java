package com.lyi.d8_reflect_annotation;

import java.lang.reflect.Method;

/**
 * 执行注解的方法
 */
public class AnnotationDemo2 {
	@Mytest
	public void test1() throws Exception {
		System.out.println("========方法一=========");
	}
	public void test2() throws Exception {System.out.println("========方法二=========");}
	public void test3() throws Exception {System.out.println("========方法三=========");}

	public static void main(String[] args) throws Exception {
		AnnotationDemo2 demo = new AnnotationDemo2();
		Class aClass = AnnotationDemo2.class;
		Method[]  methods = aClass.getDeclaredMethods();
		for (Method method : methods) {
			if(method.isAnnotationPresent(Mytest.class)) {
				method.invoke(demo);
			}
		}
	}
}
