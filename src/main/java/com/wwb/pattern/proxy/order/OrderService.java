package com.wwb.pattern.proxy.order;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.proxy.order
 * @ClassName OrderService
 * @author: wuwb
 * @date: 2019/8/15 11:49
 */
public class OrderService implements IOrderService {
	private OrderDao orderDao;

	public OrderService() {
		this.orderDao = new OrderDao();
	}

	@Override
	public int createOrder(Order order) {
		System.out.println("orderService调用orderDao创建order");

		return this.orderDao.insert(order);
	}
}
