package com.wwb.pattern.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.singleton
 * @ClassName ContainerSingleton
 * @author: wuwb
 * @date: 2019/8/13 19:12
 */
public class ContainerSingleton {

	private ContainerSingleton(){}
	private static Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();
	public static Object getBean(String className){
		synchronized (ioc) {
			if (!ioc.containsKey(className)) {
				Object obj = null;
				try {
					obj = Class.forName(className).newInstance();
					ioc.put(className, obj);
				} catch (Exception e) {
					e.printStackTrace();
				}
				return obj;
			} else {
				return ioc.get(className);
			}
		}
	}
}
