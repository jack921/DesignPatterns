package 中介者模式;

public class SoundCard extends Collage{

	public SoundCard(Mediator mediator) {
		super(mediator);
	}

	public void soundPlay(String data){
		System.out.println("音频:"+data);
	}
	
}
