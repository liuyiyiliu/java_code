package com.lyi.d9_reflect_proxy_pratice;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {

	public static <T> T getProxyUserService(T userService) {
		return (T) Proxy.newProxyInstance(userService.getClass().getClassLoader(),
				userService.getClass().getInterfaces(),
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						long startTime = System.currentTimeMillis();
						Object rs = method.invoke(userService, args);
						long endTime = System.currentTimeMillis();
						System.out.println(method.getName() + "耗时：" +(endTime - startTime)/1000 + " seconds");
						return rs;
					}
				});
	}
}
