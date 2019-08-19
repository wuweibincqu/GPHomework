package com.wwb.pattern.proxy.order;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.proxy.order
 * @ClassName Order
 * @author: wuwb
 * @date: 2019/8/15 11:45
 */
public class Order {

	private Object orderInfo;
	private Long createTime;
	private String id;

	public Object getOrderInfo() {
		return orderInfo;
	}

	public void setOrderInfo(Object orderInfo) {
		this.orderInfo = orderInfo;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
