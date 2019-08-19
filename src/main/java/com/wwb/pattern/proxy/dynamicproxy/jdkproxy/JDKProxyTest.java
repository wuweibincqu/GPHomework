package com.wwb.pattern.proxy.dynamicproxy.jdkproxy;

import com.wwb.pattern.proxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.proxy.dynamicproxy.jdkproxy
 * @ClassName JDKProxyTest
 * @author: wuwb
 * @date: 2019/8/15 14:06
 */
public class JDKProxyTest {

	public static void main(String[] args) throws Exception {
		Person person = (Person) new JDKMeipo().getInstance(new Customer());
		person.findLove();


		//通过反编译工具可以查看源代码
		byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
		FileOutputStream os = new FileOutputStream("$Proxy0.class");
		os.write(bytes);
		os.close();
	}
}
