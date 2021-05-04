package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.ListDTO;

@Component
public class ListDAO {
	
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	@Autowired
	private MapperClass mapper;
	
	public void insert_data(ListDTO dto) {
		String sql="insert into deliverylist values(?,?,?,?,?)";
		jdbctemplate.update(sql,dto.getName(), dto.getPrice(), dto.getCount(), dto.getAddress(),dto.getWanted());
	}
	
	public void update_data(ListDTO dto) {
		String sql="update deliverylist set address=? where name=?";
		jdbctemplate.update(sql,dto.getAddress(), dto.getName());
	}
	
	public void delete_data(ListDTO dto) {
		String sql="delete from deliverylist where name=?";
		jdbctemplate.update(sql, dto.getName());
	}
	
	public List<ListDTO> select_data() {
		String sql="select * from deliverylist";
		List<ListDTO> list=jdbctemplate.query(sql, mapper);
		return list;
	}
}
