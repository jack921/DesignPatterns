package ²ßÂÔÄ£Ê½;

public class TranficCalculator {

	CalculateStrategy mStrategy;
	
	public void setStrategy(CalculateStrategy mStrategy) {
		this.mStrategy = mStrategy;
	}

	public int calculatePrice(int km){
		return mStrategy.calculatePrice(km);
	}
	
	public static void main(String[] args) {
		TranficCalculator tranficCalculator=new TranficCalculator();
		tranficCalculator.setStrategy(new BusStrategy());
		System.out.println(tranficCalculator.calculatePrice(40)+"");
	}
	
}
