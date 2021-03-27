package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class TestBean4 {
	
	private int data1;
	
	// ▽ 객체를 자동 주입한다. DataBean4타입(클래스)으로 등록된 Bean을 data4에 주입해라. -> DataBean4의 객체가 생성되어야 한다. (자동으로 setData4()메서드 호출
	@Autowired
	private DataBean4 data2;
	
	// @Autowired에 직접 삽입이 된다.
	public int getData1() {
		return data1;
	}
	public void setData1(int data1) {
		this.data1 = data1;
	}
	public DataBean4 getData2() {
		return data2;
	}
	public void setData2(DataBean4 data2) {
		this.data2 = data2;
	}
	
	
}
