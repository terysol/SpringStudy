package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import kr.hs.study.beans.TestBean1;

public class MainClass {
	public static void main(String[] args) {
		/* ---------- xml 설정 -----------------*/
		ClassPathXmlApplicationContext ctx1=
				new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		TestBean1 t2=ctx1.getBean("t1",TestBean1.class);
		//System.out.println("t1 : " + t1);
		t2.method3();
		ctx1.close();
	}
}
