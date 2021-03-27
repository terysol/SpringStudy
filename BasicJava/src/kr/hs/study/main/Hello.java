package kr.hs.study.main;

import kr.hs.study.beans.HelloWorldEn;
import kr.hs.study.beans.HelloWorldKo;
import kr.hs.study.beans.helloInter;

public class Hello {
	
	public static void main(String[] args) {
		helloInter en=new HelloWorldEn();
		
		en.sayHello();
	}
}
