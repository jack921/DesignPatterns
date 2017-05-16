package 责任链模式;

public class Director extends Leader{

	@Override
	public int limit() {
		return 1000;
	}

	@Override
	public void handle(int money) {
		System.out.println("Director审批:"+money);	
	}

}
