package �۲���ģʽ;

import java.util.Observable;

public class DevTechFrontier extends Observable{
	
	public void postNewPublication(String message){
		setChanged();
		notifyObservers(message);
	}
	
}
