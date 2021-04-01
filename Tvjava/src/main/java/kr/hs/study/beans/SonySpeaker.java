package kr.hs.study.beans;

public class SonySpeaker implements Speaker {

	@Override
	public void volumeUp() {
		System.out.println("SonySpeaker volumeUp()");
	}

	@Override
	public void volumeDown() {
		System.out.println("SonySpeaker volumeDown()");
	}

}
