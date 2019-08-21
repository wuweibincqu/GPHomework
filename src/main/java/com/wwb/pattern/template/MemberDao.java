package com.wwb.pattern.template;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.template
 * @ClassName MemberDao
 * @author: wuwb
 * @date: 2019/8/20 15:41
 */
public class MemberDao extends JdbcTemplate {
	public MemberDao(DataSource dataSource) {
		super(dataSource);
	}

	public List<?> selectAll(){
		String sql = "select * from t_menber";
		return super.executeQuery(sql, new RowMapper<Member>() {
			@Override
			public Member mapRow(ResultSet rs, int rowNum) throws Exception {
				Member member = new Member();
				member.setUsername(rs.getString("username"));
				member.setPassword(rs.getString("password"));
				member.setAge(rs.getInt("age"));
				member.setAddr(rs.getString("addr"));
				return member;
			}
		},null);
	}
}
