package com.lyi.d1_junit;


import org.junit.*;

public class TestUserService {

    @Before
    public void before(){
        System.out.println("在before方法执行之前");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("在beforeClass方法执行之前");
    }

    @After
    public void after(){
        System.out.println("在after方法执行之后");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("在afterClass方法执行之后");
    }
//    1.公开 无参数 无返回值
//    2.添加Test注释
    @Test
    public void testLoginName(){
        UserService userService = new UserService();
        String name = userService.loginName("admin2", "123123");
        Assert.assertEquals("你登录的业务有问题！！！",
                "登录成功",
                name);
    }

    @Test
    public void testQueryName(){
        UserService userService = new UserService();
        userService.queryName();
    }
}
