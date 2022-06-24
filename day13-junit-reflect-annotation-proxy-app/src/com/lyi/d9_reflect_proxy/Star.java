package com.lyi.d9_reflect_proxy;

/**
 *
 * 创建一个实体类 实现方法
 * @author 95848
 */
public class Star implements Skill{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void sing() {
		System.out.println(name + "唱歌非常好听！");
	}
}
