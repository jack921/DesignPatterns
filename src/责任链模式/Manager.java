package 责任链模式;

public class Manager extends Leader{

	@Override
	public int limit() {
		return 10000;
	}

	@Override
	public void handle(int money) {
		System.out.println("Manager审批:"+money);	
	}

}
