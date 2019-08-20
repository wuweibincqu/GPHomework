package com.wwb.pattern.delegate;

import java.util.HashMap;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.delegate
 * @ClassName Leader
 * @author: wuwb
 * @date: 2019/8/19 17:05
 */
public class Leader implements IEmployee {

	private HashMap<String, IEmployee> targets = new HashMap<>();

	public Leader() {
		targets.put("加密", new EmployeeA());
		targets.put("解密", new EmployeeB());
	}

	@Override
	public void doing(String command) {
		targets.get(command).doing(command);
	}
}
