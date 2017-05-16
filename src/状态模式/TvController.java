package ״̬ģʽ;

public class TvController implements PowerController{

	private TvState tvState;
	
	public void setTvState(TvState tvState){
		this.tvState=tvState;
	}
	
	public void powerOn() {
		setTvState(new PowerOnState());
	}

	public void powerOff() {
		setTvState(new PowerOffState());
	}

	public void nextChannel() {
		tvState.nextChannel();
	}

	public void prevChannel() {
		tvState.prevChannel();
	}

	public void turnUp() {
		tvState.turnUp();
	}

	public void turnDown() {
		tvState.turnDown();
	}

}
