package ������ģʽ;

public class NumExpression extends ArithmeticException{
	private int num;
	
	public NumExpression(int num){
		this.num=num;
	}

	public int interpter(){
		return num;
	}
	
}
