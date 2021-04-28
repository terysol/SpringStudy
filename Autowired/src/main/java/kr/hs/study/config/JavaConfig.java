package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.DataBean1;
import kr.hs.study.beans.TestBean1;

// ↓ 얘는 이 클래스가 설정파일임을 알려준다.
@Configuration                          
public class JavaConfig {
	
	 @Bean 
	 public TestBean1 obj2() { 
		 TestBean1 t1=new TestBean1();
		 // t1.setData1(11); t1.setData2(11.11); t1.setData3(d1()); 
		 return t1; 
	}
	 
	 @Bean //(name="obj1") 
	 public DataBean1 d1() { 
		 return new DataBean1(); 
	 }
	 
	 @Bean
	 public TestBean1 java1() {
		 return new TestBean1();
	 }
}
