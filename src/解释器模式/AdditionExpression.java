package ½âÊÍÆ÷Ä£Ê½;

public class AdditionExpression extends OperatorExpression{

	public AdditionExpression(ArithmeticException exp1
			,ArithmeticException exp2){
			super(exp1,exp2);
	}
	
	public int interpter(){
		return ((AdditionExpression) exp1).interpter()+((AdditionExpression) exp2).interpter();
	}
	
}
