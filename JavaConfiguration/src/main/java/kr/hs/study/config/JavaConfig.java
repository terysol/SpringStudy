package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import kr.hs.study.beans.DataBean3;
import kr.hs.study.beans.DataBean4;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;

// ↓ 얘는 이 클래스가 설정파일임을 알려준다.
@Configuration                          
public class JavaConfig {
	
	// 자바로 객체 생성하기 
	/* <bean id="obj1" class="kr.hs.study.beans.TestBean1"/> 와 똑같은 말*/
	@Bean(name="obj2")
	public TestBean2 java1() {     // id는 메서드 이름(java1)
		TestBean2 t1=new TestBean2();
		return t1;                 // 컨테이너에 객체 보관
	}
	
	@Bean
	@Lazy
	public TestBean2 obj3() {
		return new TestBean2();
		
	}
	
	@Bean (initMethod="init")
	@Scope("prototype")
	public TestBean2 obj4() {
		return new TestBean2();
	}
	
	// 자바로 DI 하는 방법
	@Bean
	public TestBean3 obj5() {
		TestBean3 t3=new TestBean3(300, "spring3", new DataBean3());    // 생성자 DI
		return t3;
	}
	
	@Bean
	public TestBean3 obj6() {
		TestBean3 t3=new TestBean3();
		t3.setA(40);   t3.setB("spring9");   t3.setC(new DataBean3());
		return t3;
	}
	
	// Autowired
	@Bean 
	public TestBean4 obj7() {
		TestBean4 t4=new TestBean4();
		
		return t4;
	}
	@Bean
	public DataBean4 obj8() {
		DataBean4 d4=new DataBean4();
		return d4;
	}
}
