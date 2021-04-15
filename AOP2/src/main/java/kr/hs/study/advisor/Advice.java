package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class Advice {
	public void beforeMethod() {
		System.out.println("beforeMethod() 호출");
	}
	
	public void afterMethod() {
		System.out.println("afterMethod() 호출");
	}
	
//	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable{
//		System.out.println("around메서드 전 ");
//		pjp.proceed();			// 실제 메서드(비지니스 로직) 호출
//		System.out.println("around 메서드 후");
//	}
	
	public int aroundMethod(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("around메서드 전 ");
		int a=(Integer)pjp.proceed();			// 실제 메서드(비지니스 로직) 호출
		System.out.println("around 메서드 후");
		return a;
	}
	
	public void afterThrowing(Exception e) {
		System.out.println("afterThrowing () 호출");
	}
	
	public void afterReturning() {
		System.out.println("afterReturning() 호출");
	}
}
