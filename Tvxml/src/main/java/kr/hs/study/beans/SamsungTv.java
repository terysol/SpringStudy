package kr.hs.study.beans;

public class SamsungTv implements TV{
	int price;
	SonySpeaker speaker;

	
	public SamsungTv(int price, SonySpeaker speaker) {
		this.price = price;
		this.speaker = speaker;
	}

	@Override
	public void powerOn() {
		System.out.println("SamsungTv powerOn()");
		
	}

	@Override
	public void powerDown() {
		System.out.println("SamsungTv powerDown()");
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public SonySpeaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(SonySpeaker speaker) {
		this.speaker = speaker;
	}
	

}
