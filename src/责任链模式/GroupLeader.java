package ������ģʽ;

public class GroupLeader extends Leader{

	@Override
	public int limit() {
		return 100;
	}

	@Override
	public void handle(int money) {
		System.out.println("GroupLeader����:"+money);	
	}

}
