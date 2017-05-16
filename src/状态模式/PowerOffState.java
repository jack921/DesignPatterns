package ״̬ģʽ;

public class PowerOffState implements TvState{

	public void nextChannel() {
		System.out.println("PowerOff_next");
	}

	public void prevChannel() {
		System.out.println("PowerOff_prev");
	}

	public void turnUp() {
		System.out.println("PowerOff_turnUp");
	}

	public void turnDown() {
		System.out.println("PowerOff_trunDown");
	}
	
}
