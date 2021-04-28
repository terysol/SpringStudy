package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.Hyndai;
import kr.hs.study.beans.Kia;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		Hyndai car=ctx.getBean(Hyndai.class);
		car.order();
		System.out.println("기종 : " + car.getName());
		System.out.println("색 : " + car.getColor());
		System.out.println("가격 : "  + car.getMoney());
		
		System.out.println("=============================================");
		
		Kia car1=ctx.getBean(Kia.class);
		car1.order();
		System.out.println("기종 : " + car1.getName());
		System.out.println("색 : " + car1.getColor());
		System.out.println("가격 : "  + car1.getMoney());
		
		ctx.close();
	}
}
