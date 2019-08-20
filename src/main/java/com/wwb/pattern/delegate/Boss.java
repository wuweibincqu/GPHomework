package com.wwb.pattern.delegate;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.delegate
 * @ClassName Boss
 * @author: wuwb
 * @date: 2019/8/19 17:01
 */
public class Boss {

	public void command(String command, Leader leader) {
		leader.doing(command);
	}


}
