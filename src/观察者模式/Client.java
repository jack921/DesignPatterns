package 观察者模式;

public class Client {

	public static void main(String[] args) {
		//被观察者
		DevTechFrontier devTechFrontier=new DevTechFrontier();
		//观察者
		Coder mrsimpleCoder=new Coder("jack1");
		Coder coder1=new Coder("jack2");
		Coder coder2=new Coder("jack3");
		Coder coder3=new Coder("jack4");
		Coder coder4=new Coder("jack5");
		
		devTechFrontier.addObserver(mrsimpleCoder);
		devTechFrontier.addObserver(coder1);
		devTechFrontier.addObserver(coder2);
		devTechFrontier.addObserver(coder3);
		devTechFrontier.addObserver(coder4);
		
	    devTechFrontier.postNewPublication("大人,你的新消息到了");
		
		
	}
	
}
