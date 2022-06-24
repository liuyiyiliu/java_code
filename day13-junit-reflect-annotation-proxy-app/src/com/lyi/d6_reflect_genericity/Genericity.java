package com.lyi.d6_reflect_genericity;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;


/**
 * 绕过编译阶段为集合添加数据
 * @author 95848
 */
public class Genericity {

	@Test
	public void getClassArrayList() throws Exception {

		//ArrayList 在编译阶段 移除泛型
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<String> list2 = new ArrayList<String>();
		System.out.println(list.getClass()==list2.getClass());

		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(1);
		list3.add(2);
		Class<? extends ArrayList> genericityClass = list3.getClass();
		Method add = genericityClass.getDeclaredMethod("add", Object.class);
		boolean rs = (boolean) add.invoke(list3, "白马");
		System.out.println(rs);

		System.out.println(list3);


	}
}
