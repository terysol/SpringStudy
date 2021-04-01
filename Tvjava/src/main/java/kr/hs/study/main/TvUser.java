package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.AppleSpeaker;
import kr.hs.study.beans.LgTv;
import kr.hs.study.beans.SamsungTv;
import kr.hs.study.config.JavaConfig;

public class TvUser {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx2 =new AnnotationConfigApplicationContext(JavaConfig.class);
		
		SamsungTv tv1=ctx2.getBean("tv1",SamsungTv.class);
		tv1.powerOn();
		tv1.powerDown();
		tv1.getSpeaker().volumeDown();
		
		LgTv tv2=ctx2.getBean("tv2", LgTv.class);
		tv2.powerOn();
		tv2.powerDown();
		tv2.getSpeaker().volumeUp();
		
		ctx2.close();
	}
}
