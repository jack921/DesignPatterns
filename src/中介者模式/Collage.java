package 中介者模式;

public abstract class Collage {
	protected Mediator mediator;
	public Collage(Mediator mediator){
		this.mediator=mediator;
	}
}
