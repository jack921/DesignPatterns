package 中介者模式;

public class MainBoard extends Mediator{
	private CPU cpu;
	private CDDevice cdDevice;
	private GraphicsCard graphicsCard;
	private SoundCard soundCard;
	
	@Override
	public void change(Collage c) {
		if(c==cdDevice){
			handleCD((CDDevice)c);
		}else if(c==cpu){
			handleCPU((CPU)c);
		}	
	}

	private void handleCD(CDDevice cdDevice){
		cpu.decodeData(cdDevice.read());
	}
	
	public void handleCPU(CPU cpu){
		soundCard.soundPlay(cpu.getDataSound());
		graphicsCard.videoPlay(cpu.getDataVideo());
	}
	
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public void setCdDevice(CDDevice cdDevice) {
		this.cdDevice = cdDevice;
	}

	public void setGraphicsCard(GraphicsCard graphicsCard) {
		this.graphicsCard = graphicsCard;
	}

	public void setSoundCard(SoundCard soundCard) {
		this.soundCard = soundCard;
	}

	
	
}
