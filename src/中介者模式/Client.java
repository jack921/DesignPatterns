package 中介者模式;

public class Client {

	public static void main(String[] args) {
		MainBoard mainBoard=new MainBoard();
		
		CPU cpu=new CPU(mainBoard);
		CDDevice cdDevice=new CDDevice(mainBoard);
		GraphicsCard graphicsCard=new GraphicsCard(mainBoard);
		SoundCard soundCard=new SoundCard(mainBoard);
		
		mainBoard.setCdDevice(cdDevice);
		mainBoard.setCpu(cpu);
		mainBoard.setGraphicsCard(graphicsCard);
		mainBoard.setSoundCard(soundCard);
		
		cdDevice.load();	
	}
	
}
