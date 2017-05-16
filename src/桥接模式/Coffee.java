package ге╫сдёй╫;

public abstract class Coffee {

	protected CoffeeAdditives impl;
	
	public Coffee(CoffeeAdditives impl){
		this.impl=impl;
	}
	
	public abstract void makeCoffce();
	
}
