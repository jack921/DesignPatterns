package 中介者模式;

public class CDDevice extends Collage{
	private String data;
	
	public CDDevice(Mediator mediator) {
		super(mediator);
	}

	public String read(){
		return data;
	}
	
	public void load(){
		data="视频数据,音频数据";
		mediator.change(this);
	}
	
}
