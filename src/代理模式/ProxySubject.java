package ����ģʽ;

public class ProxySubject extends Subject implements IAction{

	Subject mRealSubject=null;
	
	public ProxySubject(Subject realSubject){
		this.mRealSubject=realSubject;
	}
	
	@Override
	public void visit() {
		mRealSubject.visit();
	}

}
