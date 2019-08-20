package com.wwb.pattern.strategy.pay;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.strategy.pay
 * @ClassName PayState
 * @author: wuwb
 * @date: 2019/8/20 10:51
 */
public class PayState {

	private int code;
	private String msg;
	private Object data;

	public PayState(int code, String msg, Object data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	@Override
	public String toString() {
		return "支付状态[" + code +"]," + msg + "交易详情：" + data;
	}
}
