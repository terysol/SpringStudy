package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import kr.hs.study.dto.LoginDTO;

@Component
public class LoginDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private MapperClass mapper;
	
	// insert(추가)
	public void insert_data(LoginDTO dto) {
		String sql="insert into login values(?,?)";
		
		jdbcTemplate.update(sql, dto.getUserid(),dto.getUserpass());
	}
	
	// update(수정)
	public void update_data(LoginDTO dto) {
		String sql="update login set userpass=? where userid=?";
		jdbcTemplate.update(sql,dto.getUserpass(),dto.getUserid());		// ? 순서대로 작성해주기 
	}
	
	// delete(삭제)
	public void delete_date(LoginDTO dto) {
		String sql="delete from login where userid=?";
		jdbcTemplate.update(sql,dto.getUserid());
	}
	
	// select(가져오기)
	public List<LoginDTO> select_data(){
		String sql="select * from login";
		List<LoginDTO> list=jdbcTemplate.query(sql, mapper);
		return list;
	}
}
