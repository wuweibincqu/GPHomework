package com.wwb.pattern.strategy.promotion;

/**
 * @Description 无优惠  具体策略
 * @Package: com.wwb.pattern.strategy
 * @ClassName EmptyStrategy
 * @author: wuwb
 * @date: 2019/8/20 10:15
 */
public class EmptyStrategy implements PromotionStrategy {

	@Override
	public void doPromotion() {
		System.out.println("无促销活动");
	}
}
