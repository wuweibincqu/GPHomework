package com.wwb.pattern.delegate;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.delegate
 * @ClassName DelegateTest
 * @author: wuwb
 * @date: 2019/8/19 17:09
 */
public class DelegateTest {
	public static void main(String[] args) {
		new Boss().command("加密",new Leader());
		new Boss().command("解密",new Leader());
	}
}
