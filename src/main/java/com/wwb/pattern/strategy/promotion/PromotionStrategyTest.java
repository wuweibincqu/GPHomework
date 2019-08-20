package com.wwb.pattern.strategy.promotion;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.strategy
 * @ClassName PromotionStrategyTest
 * @author: wuwb
 * @date: 2019/8/20 10:21
 */
@SuppressWarnings("all")
public class PromotionStrategyTest {
	public static void main(String[] args) {
		/*PromotionActivity activity618 = new PromotionActivity(new CouponStrategy());
		PromotionActivity activity1212 = new PromotionActivity(new CashbackStrategy());

		activity618.execute();
		activity1212.execute();*/ //GROUPBUY  CASHBACK
		String promotionKey = "COUPON";
		PromotionActivity activity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
		activity.execute();

	}
}
