package ������ģʽ;

import java.util.Random;

public class Engineer extends Staff{

	public Engineer(String name) {
		super(name);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitor(this);
	}

	public int getLineCode(){
		return new Random().nextInt(10*10000);
		
	}
	
	
}
