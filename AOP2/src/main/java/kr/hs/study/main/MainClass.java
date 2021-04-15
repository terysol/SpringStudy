package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx1=new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 t1=ctx1.getBean("t1",TestBean1.class);
		t1.method1();
		t1.method2();
		t1.method3();
		
		t1.func3();
		System.out.println(t1.func4());
		//t1.func1();
		
		TestBean2 t2=ctx1.getBean("t2", TestBean2.class);
//		t2.method4();
//		t2.method5();
//		
		ctx1.close();
	}
}
