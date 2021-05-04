package kr.hs.study.dto;

import org.springframework.stereotype.Component;

@Component
public class ListDTO {
	private String name;
	private int price;
	private int count;
	private String address;
	private String wanted;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getWanted() {
		return wanted;
	}
	public void setWanted(String wanted) {
		this.wanted = wanted;
	}
	
	
}
