package com.wwb.pattern.proxy.order;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.proxy.order
 * @ClassName OrderStaticProxyTest
 * @author: wuwb
 * @date: 2019/8/15 13:46
 */
public class OrderStaticProxyTest {

	public static void main(String[] args) {
		Order order = new Order();
		//Date today = new Date();
		//order.setCreateTime(today.getTime());

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		try {
			order.setCreateTime(sdf.parse("2018/10/08").getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}


		//IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
		IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy().getInstance(new OrderService());
		orderService.createOrder(order);
	}
}
