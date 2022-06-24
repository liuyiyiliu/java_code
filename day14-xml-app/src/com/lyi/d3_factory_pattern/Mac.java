package com.lyi.d3_factory_pattern;

public  class Mac extends Computer{

	@Override
	void start() {
		System.out.println(getName() + "你好,尊贵的苹果用户！！！" );
	}
}
