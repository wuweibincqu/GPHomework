package com.wwb.pattern.strategy.promotion;

/**
 * @Description 拼团优惠  具体策略
 * @Package: com.wwb.pattern.strategy
 * @ClassName GroupbuyStrategy
 * @author: wuwb
 * @date: 2019/8/20 10:15
 */
public class GroupbuyStrategy implements PromotionStrategy {
	@Override
	public void doPromotion() {
		System.out.println("拼团，满20 人成团，全团享受团购价");
	}
}
