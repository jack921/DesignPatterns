package ����ģʽ;

public class Player {

	public static void main(String[] args) {
		//ִ����
		MatrisMachine machine=new MatrisMachine();
		LeftCommand leftCommand=new LeftCommand(machine);
		RightCommand rightCommand=new RightCommand(machine);
		TopCommand topCommand=new TopCommand(machine);
		BottomCommand bottomCommand=new BottomCommand(machine);
		//����������
		Buttons buttons=new Buttons();
		buttons.setLeftCommand(leftCommand);
		buttons.setRightCommand(rightCommand);
		buttons.setBottomCommand(bottomCommand);
		buttons.setTopCommand(topCommand);
		//������
		buttons.toLeft();
		buttons.toRight();
		buttons.toTop();
		buttons.toBottom();
	}
	
}
