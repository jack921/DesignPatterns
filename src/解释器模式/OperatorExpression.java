package ½âÊÍÆ÷Ä£Ê½;

public class OperatorExpression extends ArithmeticException{
	protected ArithmeticException exp1,exp2;
	
	public OperatorExpression(ArithmeticException exp1
			,ArithmeticException exp2){
		this.exp1=exp1;
		this.exp2=exp2;
	}
}
