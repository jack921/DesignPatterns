package ԭ��ģʽ;

//���ƶ���
public class Prototype implements Cloneable{

	private String name="jack";
	
	public static void main(String[] args) {
		
	}	
	
	protected Object clone() {
		try{
			Prototype prototype=(Prototype)super.clone();
			prototype.name="jack2";
			return prototype;
		}catch(Exception e){
		}
		return null;
	}
	
}
