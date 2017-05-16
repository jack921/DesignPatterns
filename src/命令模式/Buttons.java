package ÃüÁîÄ£Ê½;

public class Buttons {

	private LeftCommand leftCommand;
	private RightCommand rightCommand;
	private TopCommand topCommand;
	private BottomCommand bottomCommand;
	
	public void setLeftCommand(LeftCommand leftCommand) {
		this.leftCommand = leftCommand;
	}
	
	public void setRightCommand(RightCommand rightCommand) {
		this.rightCommand = rightCommand;
	}
	
	public void setTopCommand(TopCommand topCommand) {
		this.topCommand = topCommand;
	}
	
	public void setBottomCommand(BottomCommand bottomCommand) {
		this.bottomCommand = bottomCommand;
	}
	
	public void toLeft(){
		leftCommand.execute();
	}
	
	public void toRight(){
		rightCommand.execute();
	}
	
	public void toBottom(){
		bottomCommand.execute();
	}
	
	public void toTop(){
		topCommand.execute();
	}
	
}
