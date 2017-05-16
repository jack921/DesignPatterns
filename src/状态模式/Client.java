package ״̬ģʽ;

public class Client {

	public static void main(String[] args) {
		TvController tvController=new TvController();
		tvController.powerOn();
		tvController.nextChannel();
		tvController.prevChannel();
		tvController.turnDown();
		tvController.powerOff();
		tvController.prevChannel();
		tvController.turnUp();
	}
	
}
