package com.lyi.d4_decorator_pattern;

import java.util.Arrays;

/**
 * 测试方法
 */
public class DecoratorPattern {
	public static void main(String[] args) {
		InputStream is = new BufferedInputStream(new FileInputStream());
		System.out.println(is.read());
		System.out.println(is.read(new byte[3]));

		//byte[] bytes = new byte[4];
		//bytes[0] = 97;
		//bytes[1] = 98;
		//bytes[2] = 98;
		//System.out.println(Arrays.toString(bytes));
	}
}
