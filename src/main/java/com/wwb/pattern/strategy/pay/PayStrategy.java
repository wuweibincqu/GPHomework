package com.wwb.pattern.strategy.pay;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 支付策略管理   环境
 * @Package: com.wwb.pattern.strategy.pay
 * @ClassName PayStrategy
 * @author: wuwb
 * @date: 2019/8/20 11:18
 */
@SuppressWarnings("all")
public class PayStrategy {

	public static final String ALI_PAY = "AliPay";
	public static final String JD_PAY = "JDPay";
	public static final String WECHAT_PAY = "WechatPay";
	public static final String UNION_PAY = "UnionPay";
	public static final String DEFAULT_PAY = ALI_PAY;

	private static Map<String, Payment> PAY_STRATEGY = new HashMap<>();
	static {
		PAY_STRATEGY.put(ALI_PAY, new AliPay());
		PAY_STRATEGY.put(JD_PAY, new JDPay());
		PAY_STRATEGY.put(WECHAT_PAY, new WechatPay());
		PAY_STRATEGY.put(UNION_PAY, new UnionPay());
	}

	private PayStrategy(){}

	public static Payment getPayment(String payKey) {
		if (!PAY_STRATEGY.containsKey(payKey)) {
			return PAY_STRATEGY.get(DEFAULT_PAY);
		}
		return PAY_STRATEGY.get(payKey);
	}
}
