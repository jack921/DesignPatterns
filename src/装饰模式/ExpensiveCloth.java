package ×°ÊÎÄ£Ê½;

public class ExpensiveCloth extends PersonCloth{

	public ExpensiveCloth(Person person) {
		super(person);
	}

	public void dressShirt(){
		System.out.println("´©¼ş¶Ì¿ã");
	}
	
	public void dressLeather(){
		System.out.println("´©¼şÆ¤ÒÂ");
	}
	
	public void dressJean(){
		System.out.println("´©¼şÅ£×Ğ¿ã");
	}
	
	@Override
	public void dressed() {
		super.dressed();
		dressShirt();
		dressLeather();
		dressJean();
	}
	
}
