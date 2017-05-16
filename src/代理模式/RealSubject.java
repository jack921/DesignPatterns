package 代理模式;

public class RealSubject extends Subject implements IAction{

	@Override
	public void visit() {
		System.out.println("Real Subject");
	}

}
