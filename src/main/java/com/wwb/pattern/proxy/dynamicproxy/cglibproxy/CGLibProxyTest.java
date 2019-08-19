package com.wwb.pattern.proxy.dynamicproxy.cglibproxy;

import org.springframework.cglib.core.DebuggingClassWriter;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.proxy.dynamicproxy.cglibproxy
 * @ClassName CGLibProxyTest
 * @author: wuwb
 * @date: 2019/8/19 14:22
 */
public class CGLibProxyTest {
	public static void main(String[] args) {
		try {

			//利用cglib 的代理类可以将内存中的class 文件写入本地磁盘
			System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,
					"D:\\workspace\\IDEACode\\GPPro\\src\\main\\java\\com\\wwb\\pattern\\proxy");

			Customer obj = (Customer)new CGLibMeiPo().getInstance(Customer.class);
			obj.findLove();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
