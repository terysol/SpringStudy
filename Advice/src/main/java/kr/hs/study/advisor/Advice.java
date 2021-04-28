package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class Advice {
	public void after() {
		System.out.println("after() 호출");
	}
	
	public void around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("around(), 메서드 호출 전");
		pjp.proceed();
		System.out.println("around(), 메서드 호출 후");
	}
	
	public void afterReturning() {
		System.out.println("afterReturning() 호출");
	}
}
