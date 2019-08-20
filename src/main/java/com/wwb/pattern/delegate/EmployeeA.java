package com.wwb.pattern.delegate;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.delegate
 * @ClassName EmployeeA
 * @author: wuwb
 * @date: 2019/8/19 17:03
 */
public class EmployeeA implements IEmployee {
	@Override
	public void doing(String command) {
		System.out.println("员工A，执行命令：" + command);
	}
}
