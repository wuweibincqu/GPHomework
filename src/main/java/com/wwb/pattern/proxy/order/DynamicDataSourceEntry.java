package com.wwb.pattern.proxy.order;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.proxy.order
 * @ClassName DynamicDataSourceEntry
 * @author: wuwb
 * @date: 2019/8/15 11:52
 */
public class DynamicDataSourceEntry {

	private static final String DEFAULT_SOURCE = null;
	private static final ThreadLocal<String> LOCAL = new ThreadLocal<>();

	private DynamicDataSourceEntry(){}

	/**
	 * 清空数据源
	 */
	public static void clear() {
		LOCAL.remove();
	}

	/**
	 * 获取当前数据源的名字
	 * @return
	 */
	public static String get() {
		return LOCAL.get();
	}

	/**
	 * 还原前面切换的数据源
	 */
	public static void restore(){
		LOCAL.set(DEFAULT_SOURCE);
	}

	/**
	 * 设置已知名字的数据源
	 * @param source
	 */
	public static void set(String source) {
		LOCAL.set(source);
	}

	/**
	 * 根据年份动态设置数据源
	 * @param year
	 */
	public static void set(int year) {
		LOCAL.set("DB_" + year);
	}
}
