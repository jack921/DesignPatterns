package 命令模式;

public class Player {

	public static void main(String[] args) {
		//执行者
		MatrisMachine machine=new MatrisMachine();
		LeftCommand leftCommand=new LeftCommand(machine);
		RightCommand rightCommand=new RightCommand(machine);
		TopCommand topCommand=new TopCommand(machine);
		BottomCommand bottomCommand=new BottomCommand(machine);
		//具体命令者
		Buttons buttons=new Buttons();
		buttons.setLeftCommand(leftCommand);
		buttons.setRightCommand(rightCommand);
		buttons.setBottomCommand(bottomCommand);
		buttons.setTopCommand(topCommand);
		//请求者
		buttons.toLeft();
		buttons.toRight();
		buttons.toTop();
		buttons.toBottom();
	}
	
}
