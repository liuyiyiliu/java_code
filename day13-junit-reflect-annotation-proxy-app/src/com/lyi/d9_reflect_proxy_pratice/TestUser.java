package com.lyi.d9_reflect_proxy_pratice;

import java.util.ArrayList;

public class TestUser {
	public static void main(String[] args) {
		User user = new User("Qy132","lyi","123123");
		User user1 = new User("Qy112","lyi","123123");
		User user2 = new User("Qy132","lyi","123123");
		User user3 = new User("Qy142","lyi","123123");
		ArrayList<User> users = new ArrayList<User>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		UserService userService = new UserServiceImpl();
		userService.login(user.getUsername(),user.getPassword());// 登录
		userService.delete(users,user1.getUserId());  //删除
		userService.getUsers();

		System.out.println("===============动态代理=================");
		UserService proxyUserService = ProxyUtil.getProxyUserService(userService);
		proxyUserService.login(user.getUsername(),user.getPassword());// 登录
		proxyUserService.delete(users,user1.getUserId());  //删除
		proxyUserService.getUsers();


	}
}
