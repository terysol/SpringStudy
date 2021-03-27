package kr.hs.study.beans;

public class TestBean2 {

	public TestBean2() {
		System.out.println("TestBean2의 기본 셍성자");
	}
	
	public void print() {
		System.out.println("TestBean2의 출력 메서드");
	}
	
	public void init() {       // 자동으로 호출
		System.out.println("생성자 호출 다음에 실행되는 init메서드");
	}
}
