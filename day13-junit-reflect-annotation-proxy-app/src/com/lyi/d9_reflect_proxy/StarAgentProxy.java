package com.lyi.d9_reflect_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StarAgentProxy {
	/**
	 * 设计一个方法  返回一个明星对象的代理对象
	 */
	public static Skill getProxySkill(Star star){
		/**
		 * Object newProxyInstance(ClassLoader loader,
		 *       Class<?>[] interfaces,
		 *       InvocationHandler h)
		 *
		 loader – 定义代理类的类加载器
		 interfaces – 代理类要实现的接口列表
		 h - 将方法调用分派到的调用处理程序
		 */
		return (Skill) Proxy.newProxyInstance(star.getClass().getClassLoader(),
				star.getClass().getInterfaces(), new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						//method – Method实例对应于代理实例上调用的接口方法。
						//obj – 调用底层方法的对象 args – 一个对象数组，其中包含在代理实例上的方法调用中传递的参数值
						System.out.println("收定金");
						Object rs = method.invoke(star);
						System.out.println("收尾款，并且把杨接回来！！");
						return rs;
					}
				});
	}
}
