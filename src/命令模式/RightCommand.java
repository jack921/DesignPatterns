package ����ģʽ;

public class RightCommand {

	private MatrisMachine machine;
	
	public RightCommand(MatrisMachine machine){
		this.machine=machine;
	}
	
	public void execute(){
		machine.toRight();
	}
	
}
