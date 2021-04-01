package kr.hs.study.beans;

public class AppleSpeaker implements Speaker {
	
	@Override
	public void volumeUp() {
		System.out.println("AppleSpeaker volumeUp()");
	}

	@Override
	public void volumeDown() {
		System.out.println("AppleSpeaker volumeDown()");

	}

}
