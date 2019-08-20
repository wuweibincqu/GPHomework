package com.wwb.pattern.strategy.pay;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.strategy.pay
 * @ClassName JDPay
 * @author: wuwb
 * @date: 2019/8/20 11:14
 */
public class JDPay extends Payment {
	@Override
	public String getName() {
		return "京东白条";
	}

	@Override
	protected double queryBalance(String uid) {
		return 888;
	}
}
