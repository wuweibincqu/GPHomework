package com.wwb.prototype.deep;

import org.junit.Test;

/**
 * @Description TODO
 * @Package: com.wwb.prototype.deep
 * @ClassName DeepCloneTest
 * @author: wuwb
 * @date: 2019/8/14 15:50
 */
public class DeepCloneTest {

	@Test
	public void testShallowClone() throws CloneNotSupportedException {
		QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();

		QiTianDaSheng copy = (QiTianDaSheng)qiTianDaSheng.shallowClone();

		System.out.println("source : " + qiTianDaSheng);
		System.out.println("copy : " + copy);

		System.out.println("source jin : " + qiTianDaSheng.jinGuBang);
		System.out.println("copy jin : " + copy.jinGuBang);
	}


	@Test
	public void testDeepClone() throws CloneNotSupportedException {
		QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
		QiTianDaSheng deepClone = (QiTianDaSheng) qiTianDaSheng.clone();
		QiTianDaSheng shallowClone = (QiTianDaSheng) qiTianDaSheng.shallowClone();

		System.out.println("原生 jin : " + qiTianDaSheng.jinGuBang);
		System.out.println("浅克 jin : " + shallowClone.jinGuBang);
		System.out.println("深克 jin : " + deepClone.jinGuBang);
		/*
		 *  原生 jin : com.wwb.prototype.deep.JinGuBang@1376c05c
		 *	浅克 jin : com.wwb.prototype.deep.JinGuBang@1376c05c
		 *	深克 jin : com.wwb.prototype.deep.JinGuBang@48cf768c
		 */

		
	}

}
