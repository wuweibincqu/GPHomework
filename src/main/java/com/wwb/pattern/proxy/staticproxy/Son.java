package com.wwb.pattern.proxy.staticproxy;

import com.wwb.pattern.proxy.Person;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.proxy.staticproxy
 * @ClassName Son
 * @author: wuwb
 * @date: 2019/8/15 11:32
 */
public class Son implements Person{


	@Override
	public void findLove() {
		System.out.println("指如削葱根，口若含朱丹");
	}
}
