package �Ž�ģʽ;

public class LargeCoffee extends Coffee{
	
	public LargeCoffee(CoffeeAdditives impl) {
		super(impl);
	}

	@Override
	public void makeCoffce() {
		System.out.println("�󱭵�"+impl.doSomeing()+"����");
	}

	
}
