package Builderģʽ;


public class Director {
	Builder builder=null;
	public Director(Builder builder){
		this.builder=builder;
	}
	
	public void construct(String board,String display){
		builder.buidlOS();
		builder.buildBoard(board);
		builder.buildDisplay(display);
	}
}
