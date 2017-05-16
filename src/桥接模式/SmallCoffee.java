package 桥接模式;

public class SmallCoffee extends Coffee{

	public SmallCoffee(CoffeeAdditives impl) {
		super(impl);
	}

	@Override
	public void makeCoffce() {
		System.out.println("小杯的"+impl.doSomeing()+"咖啡");
	}

}
