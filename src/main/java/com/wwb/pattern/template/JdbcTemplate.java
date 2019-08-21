package com.wwb.pattern.template;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.template
 * @ClassName JdbcTemplate
 * @author: wuwb
 * @date: 2019/8/20 15:16
 */
@SuppressWarnings("all")
public abstract class JdbcTemplate {

	private DataSource dataSource;

	public JdbcTemplate(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<?> executeQuery(String sql, RowMapper<?> rowMapper, Object[] params) {
		try {
			//获取连接
			Connection conn = this.getConnection();
			//创建语句集
			PreparedStatement pstm = this.createPrepareStatement(conn, sql);
			//执行语句集
			ResultSet rs = this.executeQuery(pstm, params);
			//处理结果集
			List<?> result = this.parseResultSet(rs, rowMapper);
			//关闭结果集
			this.closeResultSet(rs);
			//关闭语句集
			this.closePreparedStatement(pstm);
			//关闭连接
			this.closeConnection(conn);
			//返回结果
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	protected void closeConnection(Connection conn) throws SQLException {
		if (conn != null) {
			conn.close();
		}
	}


	protected void closePreparedStatement(PreparedStatement pstm) throws SQLException {
		if (pstm != null) {
			pstm.close();
		}
	}

	protected void closeResultSet(ResultSet rs) throws SQLException {
		if (rs != null) {
			rs.close();
		}
	}

	protected List<?> parseResultSet(ResultSet rs, RowMapper<?> rowMapper) throws Exception {
		List<Object> result = new ArrayList<>();
		int rowNum = 1;
		while (rs.next()) {
			result.add(rowMapper.mapRow(rs, rowNum++));
		}
		return result;
	}

	protected ResultSet executeQuery(PreparedStatement pstm, Object[] params) throws SQLException {
		for (int i = 0; i < params.length; i++) {
			pstm.setObject(i,params[i]);
		}
		return pstm.executeQuery();
	}

	protected PreparedStatement createPrepareStatement(Connection conn, String sql) throws SQLException {
		return conn.prepareStatement(sql);
	}

	protected Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}
}
