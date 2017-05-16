package 访问者模式;

import java.util.Random;

public class Manager extends Staff{
	private int product=0;
	
	public Manager(String name) {
		super(name);
		product=new Random().nextInt(10);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitor(this);
	}

	public int getProduct(){
		return product;
	}
	
}
