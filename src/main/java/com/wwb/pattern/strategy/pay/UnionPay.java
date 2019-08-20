package com.wwb.pattern.strategy.pay;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.strategy.pay
 * @ClassName UnionPay
 * @author: wuwb
 * @date: 2019/8/20 11:16
 */
public class UnionPay extends Payment {
	@Override
	public String getName() {
		return "银联支付";
	}

	@Override
	protected double queryBalance(String uid) {
		return 555;
	}
}
