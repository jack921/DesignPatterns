package �Ž�ģʽ;

public class SmallCoffee extends Coffee{

	public SmallCoffee(CoffeeAdditives impl) {
		super(impl);
	}

	@Override
	public void makeCoffce() {
		System.out.println("С����"+impl.doSomeing()+"����");
	}

}
