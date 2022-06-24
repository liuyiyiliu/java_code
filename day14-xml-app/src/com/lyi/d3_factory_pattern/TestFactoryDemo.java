package com.lyi.d3_factory_pattern;

public class TestFactoryDemo {
	public static void main(String[] args) {
		Computer c = FactoryPattern.createComputer("huawei");
		c.start();

		Computer c2 = FactoryPattern.createComputer("oppo");
		c2.start();


	}
}
