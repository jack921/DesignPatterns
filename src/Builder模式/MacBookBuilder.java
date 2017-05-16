package Builderģʽ;


public class MacBookBuilder extends Builder{
	private Computer computer=new MacBook();

	public Computer create() {
		return computer;
	}
	public void buildBoard(String board) {
		computer.setmBoard(board);
	}
	public void buildDisplay(String display) {
		computer.setmDisplay(display);
	}
	public void buidlOS() {
		computer.setmOS();
	}
}
