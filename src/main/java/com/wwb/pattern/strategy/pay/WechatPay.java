package com.wwb.pattern.strategy.pay;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.strategy.pay
 * @ClassName WechatPay
 * @author: wuwb
 * @date: 2019/8/20 11:15
 */
public class WechatPay extends Payment {
	@Override
	public String getName() {
		return "微信支付";
	}

	@Override
	protected double queryBalance(String uid) {
		return 666;
	}
}
