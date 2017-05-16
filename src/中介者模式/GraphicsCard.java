package 中介者模式;

public class GraphicsCard extends Collage{

	public GraphicsCard(Mediator mediator) {
		super(mediator);
	}

	public void videoPlay(String data){
		System.out.println("视频："+data);
	}
	
	
	
}
