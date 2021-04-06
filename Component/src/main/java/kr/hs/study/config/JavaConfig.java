package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean4;
import kr.hs.study.beans.DataBean5;
import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean5;

@Configuration
@ComponentScan(basePackages = "kr.hs.study.beans")
public class JavaConfig {
	
	@Bean
	public TestBean1 t2() {
		return new TestBean1();
	}
	
	@Bean
	public TestBean5 t9() {
		TestBean5 t1=new TestBean5();
		t1.setA(200);   t1.setB(55.55);
		t1.setC(new DataBean4());
		t1.setD(new DataBean5());
		return t1;
	}
}
