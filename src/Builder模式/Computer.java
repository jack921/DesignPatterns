package Builderģʽ;

public abstract class Computer {
	protected String mBoard;
	protected String mDisplay;
	protected String mOS;

	protected Computer(){}
	public void setmBoard(String mBoard) {
		this.mBoard = mBoard;
	}
	public void setmDisplay(String mDisplay) {
		this.mDisplay = mDisplay;
	}
	public abstract void setmOS();
	
	public String toString() {
		return "Computer [mBoard="+mBoard+",mDisplay="+mDisplay+", mOS="+mOS+"]";
	}
}
