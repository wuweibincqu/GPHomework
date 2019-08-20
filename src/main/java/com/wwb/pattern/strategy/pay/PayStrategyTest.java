package com.wwb.pattern.strategy.pay;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.strategy.pay
 * @ClassName PayStrategyTest
 * @author: wuwb
 * @date: 2019/8/20 11:36
 */
public class PayStrategyTest {
	public static void main(String[] args) {
		Order order = new Order("1", "20190820001", 600);
		System.out.println(order.pay());
		System.out.println("==========================================");
		System.out.println(order.pay(PayStrategy.UNION_PAY));
	}
}
