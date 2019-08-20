package com.wwb.pattern.strategy.promotion;

/**
 * @Description 优惠活动  环境
 * @Package: com.wwb.pattern.strategy
 * @ClassName PromotionActivity
 * @author: wuwb
 * @date: 2019/8/20 10:18
 */
public class PromotionActivity {

	private PromotionStrategy promotionStrategy;

	public PromotionActivity(PromotionStrategy promotionStrategy) {
		this.promotionStrategy = promotionStrategy;
	}

	public void execute() {
		this.promotionStrategy.doPromotion();
	}
}
