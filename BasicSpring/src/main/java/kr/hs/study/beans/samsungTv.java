package kr.hs.study.beans;

public class samsungTv implements Tv {

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("samsungTv volumeUp()");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("samsungTv volumeDown()");
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("samsungTv powerOn()");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("samsungTv powerOff()");
	}

}
