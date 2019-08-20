package com.wwb.pattern.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 工厂模式+单例模式+策略模式
 * @Package: com.wwb.pattern.strategy
 * @ClassName PromotionStrategyFactory
 * @author: wuwb
 * @date: 2019/8/20 10:27
 */
@SuppressWarnings("all")
public class PromotionStrategyFactory {

	private static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();
	static {
		PROMOTION_STRATEGY_MAP.put(PromotionKey.CASHBACK, new CashbackStrategy());
		PROMOTION_STRATEGY_MAP.put(PromotionKey.COUPON, new CouponStrategy());
		PROMOTION_STRATEGY_MAP.put(PromotionKey.GROUPBUY, new GroupbuyStrategy());
	}

	private static final PromotionStrategy NON_PROMOTION = new EmptyStrategy();
	private PromotionStrategyFactory(){}

	public static PromotionStrategy getPromotionStrategy(String promotionKey) {
		PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
		return promotionStrategy == null ? NON_PROMOTION : promotionStrategy;
	}

	private interface PromotionKey{
		String COUPON = "COUPON";
		String CASHBACK = "CASHBACK";
		String GROUPBUY = "GROUPBUY";
	}
}
