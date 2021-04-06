package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestBean4 {
	
	
	private int data1;
	private String data2;
	// 1. 멤버변수에 자동 주입   => set메서드 호출, set 메서드 필요 없음
	@Autowired
	private DataBean4 data3;
	
	@Autowired
	private DataBean5 data4;    // DataBean5 타입의 객체가 있으면 그 주소값을 data4에 대입해라
	

	public TestBean4(DataBean4 data3, DataBean5 data4) {
		this.data3 = data3;
		this.data4 = data4;
	}

	public int getData1() {
		return data1;
	}

	public String getData2() {
		return data2;
	}
	
	public DataBean4 getData3() {
		return data3;
	}
	
	public DataBean5 getData4() {
		return data4;
	}

	
}
