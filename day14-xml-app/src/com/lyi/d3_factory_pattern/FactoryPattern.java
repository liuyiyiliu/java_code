package com.lyi.d3_factory_pattern;

import java.util.concurrent.Callable;

public class FactoryPattern {
	public static Computer createComputer(String info){
		switch (info){
			case "huawei":
				Computer c = new Huawei();
				c.setName("huawei");
				c.setPrice(9999.0);
				return c;
			case "mac":
				Computer c2 = new Mac();
				c2.setName("mac");
				c2.setPrice(12999.0);
				return c2;
			default:
				return null;
		}
	}
}
