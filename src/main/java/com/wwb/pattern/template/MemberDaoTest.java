package com.wwb.pattern.template;

import java.util.List;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.template
 * @ClassName MemberDaoTest
 * @author: wuwb
 * @date: 2019/8/20 15:46
 */
public class MemberDaoTest {
	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao(null);
		List<Member> result = (List<Member>) memberDao.selectAll();
		System.out.println(result);
	}
}
