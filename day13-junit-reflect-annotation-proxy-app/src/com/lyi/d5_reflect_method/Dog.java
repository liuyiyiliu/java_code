package com.lyi.d5_reflect_method;

public class Dog {
	private String name;

	public Dog() {
	}

	public Dog(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private void run(){
		System.out.println("狗跑的很快！！！");
	}

	private void eat(String name){
		System.out.println("狗喜欢吃！！！" + name);
	}

	private String buy(String name){
		System.out.println("狗穿了新" + name);
		return "狗很开心";
	}
}
