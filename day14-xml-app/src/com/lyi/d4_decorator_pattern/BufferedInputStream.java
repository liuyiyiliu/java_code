package com.lyi.d4_decorator_pattern;

/**
 * 装饰类： 用来增强功能
 */
public class BufferedInputStream extends InputStream{

	private InputStream is;
	public BufferedInputStream(InputStream is) {
		this.is = is;
	}
	@Override
	public int read() {
		System.out.println("提供8KB的缓冲区去读取数据");
		return is.read();
	}

	@Override
	public int read(byte[] buffer) {
		System.out.println("提供8KB的缓冲区去读取数据");
		return is.read(buffer);
	}
}
