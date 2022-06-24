package com.lyi.d9_reflect_proxy_pratice;

import java.util.ArrayList;
import java.util.List;


/**
 * 用户业务接口
 * @author 95848
 */
public interface UserService {
	public void login(String username, String password);
	public void delete(ArrayList<User> users, String userId);
	public String getUsers();
}
