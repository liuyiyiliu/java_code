package com.lyi.d8_reflect_annotation;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 获取Book注解上的数据
 */
public class AnnotationDemo {
	public static void main(String[] args) throws Exception {

		parseClass();
		parseMethod();

		}
		public static void parseClass(){
			// 1.先得到类对象
			Class<BookStore> bookStoreClass = BookStore.class;
			// 2.判断这个类上面是否有注解类  参数： annotationClass——注解类型对应的Class对象
			if (bookStoreClass.isAnnotationPresent(Book.class)) {
				// 3.获取该注解对象 参数： annotationClass
				Book declaredAnnotation = bookStoreClass.getDeclaredAnnotation(Book.class);
				System.out.println(declaredAnnotation.value());
				System.out.println(declaredAnnotation.price());
				System.out.println(Arrays.toString(declaredAnnotation.authors()));
			}
		}

	public static void parseMethod() throws Exception {
		// 1.先得到类对象
		Class<BookStore> bookStoreClass2 = BookStore.class;
		// 1.1 获取这个类的下面指定的方法
		Method run = bookStoreClass2.getDeclaredMethod("run");
		// 2.判断这个类上面是否有注解类
		if (run.isAnnotationPresent(Book.class)) {
			// 3.获取该注解对象
			Book declaredAnnotation = run.getDeclaredAnnotation(Book.class);
			System.out.println(declaredAnnotation.value());
			System.out.println(declaredAnnotation.price());
			System.out.println(Arrays.toString(declaredAnnotation.authors()));
		}
	}
	}

