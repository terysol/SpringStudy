package kr.hs.study.beans;

public class CarUser {
	String owner;
	String color;
	Car car_type;
	
	public CarUser() {
		
	}
	public CarUser(String owner, String color, Car car_type) {
		// System.out.println("CarUser 생성자");
		this.owner=owner;
		this.color=color;
		this.car_type=car_type;
	}
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Car getCar_type() {
		return car_type;
	}
	public void setCar_type(Car car_type) {
		this.car_type = car_type;
	}
	
	public void prData() {
		System.out.println("차주 : " + owner);
		System.out.println("색 : " + color);
		System.out.println("가격 : " + car_type.getPrice());
		System.out.println("차종 : " + car_type.getName());
	}
}
