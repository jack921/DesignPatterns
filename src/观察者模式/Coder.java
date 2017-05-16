package 观察者模式;

import java.util.Observable;
import java.util.Observer;

public class Coder implements Observer{

	private String name;
	
	public Coder(String name){
		this.name=name;
	}
	
	public void update(Observable arg0, Object arg1) {
		System.out.println("Hi "+name+" DevTechFrontier有新内容了:"+arg1);	
	}

	@Override
	public String toString() {
		return "My name is "+name;
	}
	
}
