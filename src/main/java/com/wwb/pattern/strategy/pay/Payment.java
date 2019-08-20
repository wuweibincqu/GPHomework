package com.wwb.pattern.strategy.pay;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.strategy.pay
 * @ClassName Payment
 * @author: wuwb
 * @date: 2019/8/20 10:57
 */
public abstract class Payment {

	//支付类型
	public abstract String getName();

	//查询余额
	protected abstract double queryBalance(String uid);

	//扣款支付
	public PayState pay(String uid, double amount) {
		if (queryBalance(uid) < amount) {
			return new PayState(500, "支付失败", "余额不足");
		}
		return new PayState(200, "支付成功", "支付金额：" + amount);
	}
}
