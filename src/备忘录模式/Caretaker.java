package ����¼ģʽ;

public class Caretaker {
	Memoto memoto=new Memoto();
	
	public void archive(Memoto memoto){
		this.memoto=memoto;
	}
	
	public Memoto getMemoto(){
		return this.memoto;
	}
}
