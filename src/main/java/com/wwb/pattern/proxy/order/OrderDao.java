package com.wwb.pattern.proxy.order;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.proxy.order
 * @ClassName OrderDao
 * @author: wuwb
 * @date: 2019/8/15 11:46
 */
public class OrderDao {

	public int insert(Order order) {
		System.out.println("orderDao创建order成功");
		return 1;
	}
}
