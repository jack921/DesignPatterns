package װ��ģʽ;

public class ExpensiveCloth extends PersonCloth{

	public ExpensiveCloth(Person person) {
		super(person);
	}

	public void dressShirt(){
		System.out.println("�����̿�");
	}
	
	public void dressLeather(){
		System.out.println("����Ƥ��");
	}
	
	public void dressJean(){
		System.out.println("����ţ�п�");
	}
	
	@Override
	public void dressed() {
		super.dressed();
		dressShirt();
		dressLeather();
		dressJean();
	}
	
}
