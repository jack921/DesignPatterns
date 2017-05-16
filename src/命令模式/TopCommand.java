package ÃüÁîÄ£Ê½;

public class TopCommand {
	
	private MatrisMachine machine;
	
	public TopCommand(MatrisMachine machine){
		this.machine=machine;
	}
	
	public void execute(){
		machine.toTop();
	}
}
