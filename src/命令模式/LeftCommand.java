package ����ģʽ;

public class LeftCommand {

	private MatrisMachine machine;
	
	public LeftCommand(MatrisMachine machine){
		this.machine=machine;
	}
	
	public void execute(){
		machine.toLeft();
	}
	
}
