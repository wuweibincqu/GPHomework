package com.wwb.pattern.delegate;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.delegate
 * @ClassName EmployeeB
 * @author: wuwb
 * @date: 2019/8/19 17:04
 */
public class EmployeeB implements IEmployee {
	@Override
	public void doing(String command) {
		System.out.println("员工B，执行命令：" + command);
	}
}
