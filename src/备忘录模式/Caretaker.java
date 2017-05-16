package ±¸ÍüÂ¼Ä£Ê½;

public class Caretaker {
	Memoto memoto=new Memoto();
	
	public void archive(Memoto memoto){
		this.memoto=memoto;
	}
	
	public Memoto getMemoto(){
		return this.memoto;
	}
}
