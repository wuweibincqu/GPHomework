package com.wwb.pattern.strategy.promotion;

/**
 * @Description 返现促销  具体策略
 * @Package: com.wwb.pattern.strategy
 * @ClassName CashbackStrategy
 * @author: wuwb
 * @date: 2019/8/20 10:14
 */
public class CashbackStrategy implements PromotionStrategy {
	@Override
	public void doPromotion() {
		System.out.println("返现促销,返回的金额转到支付宝账号");
	}
}
