package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;
import kr.hs.study.config.JavaConfig;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx1=
				new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		// 객체 생성
		/*
		TestBean2 t1=ctx1.getBean("obj1",TestBean2.class);
		System.out.println("t1 : " + t1 + '\n');
		
		TestBean2 t4=ctx1.getBean("obj6",TestBean2.class);
		System.out.println("t4 : " + t4 + '\n');
		
		TestBean2 t5=ctx1.getBean("obj6",TestBean2.class);
		System.out.println("t5 : " + t5);
		*/
		
		// DI
		/*
		TestBean3 t6=ctx1.getBean("obj7",TestBean3.class);
		System.out.println(t6.getA() + ' ' + t6.getB() + ' ' + t6.getC());
		*/
		
		ctx1.close();
		
		
		
		System.out.println("============ 자바로 spring 설정 하는 방법 ==============");
		
		AnnotationConfigApplicationContext ctx2=
				new AnnotationConfigApplicationContext(JavaConfig.class);   // 설정이 있는 자바파일 등록
		
		// 객체 생성
		/*
		TestBean2 t2=ctx2.getBean("obj2",TestBean2.class);
		t2.print();
		
		TestBean2 t3=ctx2.getBean("obj4",TestBean2.class);
		t3.print();
		*/
		
		// 자바로 DI 하는 방법
		/*
		TestBean3 t7=ctx2.getBean("obj5",TestBean3.class);
		System.out.println(t7.getA());
		
		TestBean3 t8=ctx2.getBean("obj6",TestBean3.class);
		System.out.println(t8.getB());
		 */
		
		// Autowired
		TestBean4 t9=ctx2.getBean("obj7",TestBean4.class);
		System.out.println(t9.getData1() + "   " + t9.getData2());
		
		
		ctx2.close();
		
		
		
	}
}
