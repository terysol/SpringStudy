package kr.hs.study.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("obj3")
@Lazy
//@Scope("prototype")
public class TestBean3 {
	public TestBean3() {
		System.out.println("TestBean3 의 기본 생성자");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("TestBean3 init 메서드");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("TestBean3 destroy 메서드");
	}
}
