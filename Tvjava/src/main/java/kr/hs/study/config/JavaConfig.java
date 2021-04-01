package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.AppleSpeaker;
import kr.hs.study.beans.LgTv;
import kr.hs.study.beans.SamsungTv;
import kr.hs.study.beans.SonySpeaker;

@Configuration
public class JavaConfig {
	
	@Bean
	public SamsungTv tv1() {
		return new SamsungTv(1000,speaker());
	}
	
	@Bean
	public LgTv tv2() {
		return new LgTv(2000,apple());
	}
	
	@Bean 
	public SonySpeaker speaker() {
		return new SonySpeaker();
	}
	
	@Bean
	public AppleSpeaker apple() {
		return new AppleSpeaker();
	}
}
