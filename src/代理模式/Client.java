package ����ģʽ;

import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		//��̬����
		Subject mRealSubject=new RealSubject();
		ProxySubject mProxySubject=new ProxySubject(mRealSubject);
		mProxySubject.visit();	
		
		//��̬����
		Subject mRealSubject2=new RealSubject();
		DynamicProxy mDynamicProxy=new DynamicProxy(mRealSubject2);
		ClassLoader mRealObject=mRealSubject2.getClass().getClassLoader();
		
		IAction iAction=(IAction)Proxy.newProxyInstance(
				mRealObject,new Class[]{IAction.class},mDynamicProxy);
		
		iAction.visit();
		
	}
	
}
