package com.lyi.d4_decorator_pattern;

import java.util.Arrays;

/**
 * 原始类： 定义功能
 */
public class FileInputStream extends InputStream{
	@Override
	public int read() {
		System.out.println("低性能的输入一个字符a");
		return 97;
	}

	@Override
	public int read(byte[] buffer) {
		buffer[0] = 97;
		buffer[1] = 98;
		buffer[2] = 99;
		System.out.println("低性能的输入三个字节" + Arrays.toString(buffer));
		return 3;
	}
}
