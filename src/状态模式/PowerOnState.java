package ״̬ģʽ;

public class PowerOnState implements TvState{

	public void nextChannel() {
		System.out.println("PowerOn_next");
	}

	public void prevChannel() {
		System.out.println("PowerOn_perv");
	}

	public void turnUp() {
		System.out.println("PowerOn_turnUp");
	}

	public void turnDown() {
		System.out.println("PowerOn_turnDown");
	}

}
