package ������ģʽ;

public class Director extends Leader{

	@Override
	public int limit() {
		return 1000;
	}

	@Override
	public void handle(int money) {
		System.out.println("Director����:"+money);	
	}

}
