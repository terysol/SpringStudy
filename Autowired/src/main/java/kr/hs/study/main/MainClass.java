package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.JavaConfig;

public class MainClass {
	public static void main(String[] args) {
		/* ---------- xml 설정 -----------------*/
		ClassPathXmlApplicationContext ctx1=
				new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		TestBean1 t1=ctx1.getBean("obj1",TestBean1.class);
		System.out.println("  data3 : " + t1.getData3() + "  data4 : " + t1.getData4());
		
		ctx1.close();
		
		System.out.println("\n=========== spring java 설정 =====================\n");
		/*  --------------- java 설정 -------------------*/
		
		AnnotationConfigApplicationContext ctx2 =new AnnotationConfigApplicationContext(JavaConfig.class);
//		TestBean1 t2=ctx2.getBean("obj2",TestBean1.class);
//		System.out.println("data1 : "+t2.getData1() + "  data2 : " + 
//							t2.getData2() + "  data3 : " + t2.getData3() + "  data4 : " + t2.getData4());
		
//		System.out.println("-------------  autowired -------------");
//		TestBean1 t3=ctx2.getBean("java1",TestBean1.class);
//		System.out.println("data1 : "+t3.getData1() + "  data2 : " + 
//				t3.getData2() + "  data3 : " + t3.getData3() + "  data4 : " + t3.getData4());
		ctx2.close();
	}
}
