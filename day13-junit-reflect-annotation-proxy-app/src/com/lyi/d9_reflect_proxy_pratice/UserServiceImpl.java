package com.lyi.d9_reflect_proxy_pratice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class UserServiceImpl  implements UserService{
	@Override
	public void login(String username, String password) {
		long startTime = System.currentTimeMillis();
		String name = "lyi";
		String word = "123123";
		if (username.equals(name) && password.equals(word)) {
			System.out.println("登录成功");
		}
		else{
			System.out.println("登录失败");
		}
		long endTime = System.currentTimeMillis();
		System.out.println("耗时：" +(endTime - startTime)/1000 + " seconds");
	}

	@Override
	public  void  delete(ArrayList<User> users, String userId) {
		long startTime = System.currentTimeMillis();
		try {
			Thread.sleep(3000);
			Iterator<User> userIterator = users.iterator();
			while(userIterator.hasNext()){
				User user = userIterator.next();
				if (user.getUserId().equals(userId)) {
					userIterator.remove();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		long endTime = System.currentTimeMillis();
		System.out.println("耗时：" +(endTime - startTime)/1000 + " seconds");

	}

	@Override
	public String  getUsers() {
		long startTime = System.currentTimeMillis();
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("耗时：" +(endTime - startTime)/1000 + " seconds");
		return "查询成功";
	}
}
