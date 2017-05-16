package 观察者模式;

import java.util.Observable;

public class DevTechFrontier extends Observable{
	
	public void postNewPublication(String message){
		setChanged();
		notifyObservers(message);
	}
	
}
