package ге╫сдёй╫;

public class Client {

	public static void main(String[] args) {
		Ordinary ordinary=new Ordinary();
		Suger suger=new Suger();
		
		LargeCoffee largeCoffee=new LargeCoffee(ordinary);
		largeCoffee.makeCoffce();
		
		LargeCoffee largeCoffee2=new LargeCoffee(suger);
		largeCoffee2.makeCoffce();
		
		System.out.println("----------------------------");
		
		SmallCoffee smallCoffee=new SmallCoffee(ordinary);
		smallCoffee.makeCoffce();
		
		SmallCoffee smallCoffee2=new SmallCoffee(suger);
		smallCoffee2.makeCoffce();
		
	}
	
}
