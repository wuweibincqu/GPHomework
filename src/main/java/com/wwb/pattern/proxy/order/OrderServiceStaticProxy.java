package com.wwb.pattern.proxy.order;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.proxy.order
 * @ClassName OrderServiceStaticProxy
 * @author: wuwb
 * @date: 2019/8/15 13:35
 */
public class OrderServiceStaticProxy implements IOrderService {

	private IOrderService orderService;
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy");

	/**
	 * 限制了只能代理IOrderService
	 * @param orderService
	 */
	public OrderServiceStaticProxy(IOrderService orderService){
		this.orderService = orderService;
	}



	@Override
	public int createOrder(Order order) {
		before();
		Long createTime = order.getCreateTime();
		Integer year = Integer.valueOf(sdf.format(new Date(createTime)));
		DynamicDataSourceEntry.set(year);
		System.out.println("静态代理类自动分配到【DB_" + DynamicDataSourceEntry.get() + "】数据源处理数据。");
		orderService.createOrder(order);
		DynamicDataSourceEntry.restore();
		after();
		return 0;
	}

	public void before() {
		System.out.println("proxy before method");
	}

	public void after() {
		System.out.println("proxy after method");
	}
}
