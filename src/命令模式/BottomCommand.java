package ÃüÁîÄ£Ê½;

public class BottomCommand {
		
	private MatrisMachine machine;
	
	public BottomCommand(MatrisMachine machine){
		this.machine=machine;
	}
	
	public void execute(){
		machine.toBottom();
	}
	
}
