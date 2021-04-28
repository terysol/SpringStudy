package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Hyndai implements Car{
	String name;
	String color;
	int money;
	
	public Hyndai(@Value("Hyndai")String name, @Value("blue")String color, @Value("1000")int money) {
		this.name = name;
		this.color = color;
		this.money = money;
	}

	
	@Override
	public void order() {
		System.out.println("Hyndai order()");
		
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getMoney() {
		return money;
	}
	
}
