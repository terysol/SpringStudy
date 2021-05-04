package kr.hs.study.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.ListDTO;

@Component
public class MapperClass implements RowMapper<ListDTO>{
	public ListDTO mapRow(ResultSet rs, int rowNum) throws SQLException{
		ListDTO list = new ListDTO();
		list.setName(rs.getString("name"));
		list.setPrice(rs.getInt("price"));
		list.setCount(rs.getInt("count"));
		list.setAddress(rs.getString("address"));
		list.setWanted(rs.getString("wanted"));
		return list;
	}
}
