package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.HelloEn;
import kr.hs.study.beans.HelloJp;
import kr.hs.study.beans.HelloKr;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx1=new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		HelloJp jp=ctx1.getBean("jp",HelloJp.class);
		jp.bye1();
		jp.bye2();
		System.out.println("---------------------------------");
		
		HelloKr kr=ctx1.getBean("kr",HelloKr.class);
		kr.Hello1();
		kr.Hello2();
		System.out.println("---------------------------------");
		
		HelloEn en=ctx1.getBean("en",HelloEn.class);
		en.Hi1();
		en.Hi2();
		
		ctx1.close();
	}
}
