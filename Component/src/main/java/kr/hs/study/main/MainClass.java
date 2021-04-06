package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import kr.hs.study.beans.TestBean3;
import kr.hs.study.beans.TestBean4;
import kr.hs.study.beans.TestBean5;
import kr.hs.study.config.JavaConfig;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx1=new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
//		TestBean1 t1=ctx1.getBean("t1",TestBean1.class);
//		System.out.println("t1 : " + t1);
		
//		TestBean2 t3=ctx1.getBean(TestBean2.class);
//		System.out.println("t3 : " + t3);
	
//		TestBean3 t5=ctx1.getBean("obj3",TestBean3.class);
//		System.out.println("t5 : " + t5);
		
//		TestBean4 t6=ctx1.getBean(TestBean4.class);
//		System.out.println("t6.getData3() : " + t6.getData3());
		
//		TestBean3 t6=ctx1.getBean("obj3",TestBean3.class);
//		System.out.println("t6 : " + t6);
		
		TestBean5 t7=ctx1.getBean(TestBean5.class);
		System.out.println("t7.getA() : " + t7.getA());
		System.out.println("t7.getB() : " + t7.getB());
		System.out.println("t7.getC() : " + t7.getC() );
		System.out.println("t7.getD() : " + t7.getD());
		
//		TestBean5 t9=ctx1.getBean("obj1",TestBean5.class);
//		System.out.println("t9.getA() : " + t9.getA());
//		System.out.println("t9.getB() : " + t9.getB());
//		System.out.println("t9.getC() : " + t9.getC() );
//		System.out.println("t9.getD() : " + t9.getD());
		
		ctx1.close();
		
		System.out.println(" ============ java로 설정 ======================");
		
		AnnotationConfigApplicationContext ctx2=new AnnotationConfigApplicationContext(JavaConfig.class);
//		TestBean1 t2=ctx2.getBean("t2",TestBean1.class);
//		System.out.println("t2 : " + t2);
		
//		TestBean2 t4=ctx2.getBean(TestBean2.class);
//		System.out.println("t4 : " + t4);
		
//		TestBean5 t8=ctx2.getBean("t9", TestBean5.class);
//		System.out.println("t8.getA() : " + t8.getA());
//		System.out.println("t8.getB() : " + t8.getB());
//		System.out.println("t8.getC() : " + t8.getC() );
//		System.out.println("t8.getD() : " + t8.getD());
		
		ctx2.close();
	}
}
