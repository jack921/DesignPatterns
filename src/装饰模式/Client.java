package в╟йндёй╫;

public class Client {

	public static void main(String[] args) {
		Person person=new Boy();
		PersonCloth clothCheap=new CheapCloth(person);
		clothCheap.dressed();
		
		System.out.println("---------------------------");
		
		PersonCloth clothExpensive=new ExpensiveCloth(person);
		clothExpensive.dressed();
		
	}
	
}
