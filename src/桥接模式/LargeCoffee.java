package 桥接模式;

public class LargeCoffee extends Coffee{
	
	public LargeCoffee(CoffeeAdditives impl) {
		super(impl);
	}

	@Override
	public void makeCoffce() {
		System.out.println("大杯的"+impl.doSomeing()+"咖啡");
	}

	
}
