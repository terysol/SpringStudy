package kr.hs.study.beans;

public class Car {
	int price;
	String name;
	
	public Car(int price, String name) {
		// System.out.println("Car 생성자");
		this.price=price;
		this.name=name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
