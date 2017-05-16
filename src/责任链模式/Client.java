package 责任链模式;

public class Client {

	public static void main(String[] args) {
		GroupLeader groupLeader=new GroupLeader();
		Director director=new Director();
		Manager manager=new Manager();
		Boss boss=new Boss();
		
		groupLeader.nextLeader=director;
		director.nextLeader=manager;
		manager.nextLeader=boss;
		
		groupLeader.handleRequest(900);
	}
	
}
