package com.lyi.d9_reflect_proxy;

/**
 *  背景：杨超越从普通人到明星了 需要找一个代理帮他处理任务
 *
 *
 */
public class ProxyDemo {
	public static void main(String[] args) {
		Star star = new Star();
		star.setName("杨超越");
		Skill proxySkill = StarAgentProxy.getProxySkill(star);
		proxySkill.sing();

	}

}
