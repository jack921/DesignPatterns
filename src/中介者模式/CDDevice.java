package �н���ģʽ;

public class CDDevice extends Collage{
	private String data;
	
	public CDDevice(Mediator mediator) {
		super(mediator);
	}

	public String read(){
		return data;
	}
	
	public void load(){
		data="��Ƶ����,��Ƶ����";
		mediator.change(this);
	}
	
}
