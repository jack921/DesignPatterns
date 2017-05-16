package 责任链模式;

public class Boss extends Leader{

	@Override
	public int limit() {
		return 50000;
	}

	@Override
	public void handle(int money) {
		System.out.println("Boss审批:"+money);	
	}

}
