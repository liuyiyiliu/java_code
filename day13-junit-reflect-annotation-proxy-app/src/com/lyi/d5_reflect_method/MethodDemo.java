package com.lyi.d5_reflect_method;

import org.junit.Test;

import java.lang.reflect.Method;
import java.net.DatagramPacket;

public class MethodDemo {

	@Test
	public void getDeclaredMethods() throws Exception {
		//通过getDeclaredMethods获取所有方法
		Class<Dog> dogClass = Dog.class;
		for (Method declaredMethod : dogClass.getDeclaredMethods()) {
			System.out.println(declaredMethod.getName() + ": " + declaredMethod.getParameterCount());
		}
	}

	@Test
	public void getDeclaredMethod() throws Exception {
		//通过getDeclaredMethods获取所有方法
		Class<Dog> dogClass = Dog.class;
		Method method = dogClass.getDeclaredMethod("run");
		method.setAccessible(true);
		Dog dog = new Dog();
		Object result = method.invoke(dog);
		System.out.println(result);




		//name – 方法的名称  parameterTypes – 参数数组回报： 与指定名称和参数匹配的此类方法的Method对象
		Method method1 = dogClass.getDeclaredMethod("buy", String.class);
		method1.setAccessible(true);
		Dog dog1 = new Dog();
		//obj – 调用底层方法的对象 args – 用于方法调用的参数  回报：使用参数args在obj上调度此对象表示的方法的结果
		Object result2 = method1.invoke(dog1, "衣服");
		System.out.println(result2);

	}
}
