package 责任链模式;

public class GroupLeader extends Leader{

	@Override
	public int limit() {
		return 100;
	}

	@Override
	public void handle(int money) {
		System.out.println("GroupLeader审批:"+money);	
	}

}
