package kr.hs.study.beans;

public class TestBean1 {
	public void method1() {
		System.out.println("method1()");
	}
	
	public void method2() {
		System.out.println("method2()");
	}
	
	public void method3() {
		System.out.println("method3()");
	}
	
	public void func1() {
		System.out.println("func1()");
		int a=10/0;
	}
	
	public void func2() {
		System.out.println("func2()");
	}
	
	public void func3() {
		System.out.println("func3()");
	}
	
	public int func4() {
		return 100;
	}
}
