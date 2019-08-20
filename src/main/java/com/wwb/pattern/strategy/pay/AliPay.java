package com.wwb.pattern.strategy.pay;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.strategy.pay
 * @ClassName AliPay
 * @author: wuwb
 * @date: 2019/8/20 11:13
 */
public class AliPay extends Payment {
	@Override
	public String getName() {
		return "支付宝";
	}

	@Override
	protected double queryBalance(String uid) {
		return 996;
	}
}
