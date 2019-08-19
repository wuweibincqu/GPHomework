package com.wwb.pattern.proxy.staticproxy;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.proxy.staticproxy
 * @ClassName StaticProxyTest
 * @author: wuwb
 * @date: 2019/8/15 11:43
 */
public class StaticProxyTest {
	public static void main(String[] args) {
		Father father = new Father(new Son());
		father.findLove();
	}
}
