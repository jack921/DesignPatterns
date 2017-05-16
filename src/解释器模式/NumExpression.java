package ½âÊÍÆ÷Ä£Ê½;

public class NumExpression extends ArithmeticException{
	private int num;
	
	public NumExpression(int num){
		this.num=num;
	}

	public int interpter(){
		return num;
	}
	
}
