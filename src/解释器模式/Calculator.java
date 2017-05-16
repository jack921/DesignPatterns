package ½âÊÍÆ÷Ä£Ê½;

import java.util.Stack;

public class Calculator {
	Stack<ArithmeticException> mExpStack=new Stack<ArithmeticException>();
	
	public Calculator(String expression){
		ArithmeticException exp1,exp2;
		String[] elements=expression.split(" ");
		for(int i=0;i<elements.length;i++){
			switch(elements[i].charAt(i)){
			case '+':
				exp1=mExpStack.pop();
				exp2=new NumExpression(Integer.valueOf(elements[i]));
				mExpStack.push(new AdditionExpression(exp1,exp2));
				break;
			default:
				break;
			}
		}
	}
	
	public int calculate(){
		return ((NumExpression) mExpStack.pop()).interpter();
	}
	
}
