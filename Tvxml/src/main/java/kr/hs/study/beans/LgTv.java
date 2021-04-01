package kr.hs.study.beans;

public class LgTv implements TV {
	int price;
	AppleSpeaker speaker;
	
	
	public LgTv(int price, AppleSpeaker speaker) {
		this.price = price;
		this.speaker = speaker;
	}

	@Override
	public void powerOn() {
		System.out.println("LgTv powerOn()");
	}

	@Override
	public void powerDown() {
		System.out.println("LgTv powerDown");
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public AppleSpeaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(AppleSpeaker speaker) {
		this.speaker = speaker;
	}
	
	
}
