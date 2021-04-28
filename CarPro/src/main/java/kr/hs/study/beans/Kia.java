package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Kia implements Car{
	String name;
	String color;
	int money;	
	
	public Kia(@Value("Kia")String name, @Value("gray")String color, @Value("10000")int money) {
		this.name = name;
		this.color = color;
		this.money = money;
	}

	@Override
	public void order() {
		System.out.println("Kia order()");
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
