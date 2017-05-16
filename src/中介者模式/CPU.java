package 中介者模式;


public class CPU extends Collage{

	private String dataVideo,dataSound;
	
	public CPU(Mediator mediator) {
		super(mediator);
	}

	public String getDataVideo() {
		return dataVideo;
	}

	public String getDataSound() {
		return dataSound;
	}

	public void decodeData(String data){
		String[] tmp=data.split(",");
		dataVideo=tmp[0];
		dataSound=tmp[1];
		mediator.change(this);
	}
	
}
