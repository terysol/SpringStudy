package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.AppleSpeaker;
import kr.hs.study.beans.LgTv;
import kr.hs.study.beans.SamsungTv;

public class TvUser {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx1 =     // 컨테이너
				new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");  // 먼저 읽어야 함. 
		
		SamsungTv tv1=ctx1.getBean("tv",SamsungTv.class);
		tv1.powerOn();
		tv1.powerDown();
		tv1.getSpeaker().volumeUp();
		
		
		LgTv tv2=ctx1.getBean("tv2", LgTv.class);
		tv2.powerOn();
		tv2.powerDown();
		tv2.getSpeaker().volumeDown();
		
		
		ctx1.close();
	}
}
