package װ��ģʽ;

public class CheapCloth extends PersonCloth{

	public CheapCloth(Person person) {
		super(person);
	}

	public void dressShorts(){
		System.out.println("�����̿�");
	}
	
	@Override
	public void dressed() {
		super.dressed();
		dressShorts();
	}
	
}
