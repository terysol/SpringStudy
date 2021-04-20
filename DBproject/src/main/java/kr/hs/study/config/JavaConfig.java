package kr.hs.study.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;

import kr.hs.study.dto.LoginDTO;

@Configuration
@ComponentScan(basePackages = {"kr.hs.study"})
public class JavaConfig {
	
	@Bean
	public BasicDataSource source() { 		// BasicDataSource를 가지고 디비 접속 정보 입력
		BasicDataSource source=new BasicDataSource();
		source.setDriverClassName("oracle.jdbc.OracleDriver");
		source.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		source.setUsername("scott");
		source.setPassword("tiger");
		return source;
	}
	
	@Bean
	public JdbcTemplate db(BasicDataSource source) {
		JdbcTemplate db=new JdbcTemplate(source);
		return db;
	}
}
