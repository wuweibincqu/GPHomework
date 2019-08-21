package com.wwb.pattern.template;

import java.sql.ResultSet;

/**
 * @Description TODO
 * @Package: com.wwb.pattern.template
 * @ClassName RowMapper
 * @author: wuwb
 * @date: 2019/8/20 15:15
 */
public interface RowMapper<T> {

	T mapRow(ResultSet rs, int rowNum) throws Exception;
}
