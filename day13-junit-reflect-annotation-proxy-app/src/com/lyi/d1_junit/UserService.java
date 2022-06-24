package com.lyi.d1_junit;

public class UserService {
    public  String loginName(String userName , String  password){

        if("admin".equals(userName) && "123123".equals(password)){
            return "登录成功";
        }else{
            return  "账号或密码有误，请重新输入！！";
        }
    }

    public void queryName(){
        System.out.println(10/2);
        System.out.println("你查询的用户不存在！！！");
    }
}
