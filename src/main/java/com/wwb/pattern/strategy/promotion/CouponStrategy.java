package com.wwb.pattern.strategy.promotion;

/**
 * @Description 优惠券抵扣  具体策略
 * @Package: com.wwb.pattern.strategy
 * @ClassName CouponStrategy
 * @author: wuwb
 * @date: 2019/8/20 10:12
 */
public class CouponStrategy implements PromotionStrategy {
	@Override
	public void doPromotion() {
		System.out.println("领取优惠券,课程的价格直接减优惠券面值抵扣");
	}
}
