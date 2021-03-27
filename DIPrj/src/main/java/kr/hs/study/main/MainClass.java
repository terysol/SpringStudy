package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.CarUser;


public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		
//		TestBean2 obj9=ctx.getBean("t9",TestBean2.class);
//		obj9.getData1().prData();
		
//		CarUser c1=ctx.getBean("t1",CarUser.class);
//		c1.prData();
//		System.out.println("-----------------------");
//		
//		CarUser c2=ctx.getBean("t2",CarUser.class);
//		c2.prData();
		System.out.println("-----------------------");
		
		CarUser c3=ctx.getBean("t3",CarUser.class);
		c3.prData();
		
		ctx.close();
	}
}
