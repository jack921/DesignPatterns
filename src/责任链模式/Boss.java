package ������ģʽ;

public class Boss extends Leader{

	@Override
	public int limit() {
		return 50000;
	}

	@Override
	public void handle(int money) {
		System.out.println("Boss����:"+money);	
	}

}
