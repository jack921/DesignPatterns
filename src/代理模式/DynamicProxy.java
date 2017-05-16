package 代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler{

	public Object object;
	
	public DynamicProxy(Object object){
		this.object=object;
	}

	public Object invoke(Object proxy,Method method,Object[] args) throws Throwable {
		Object invokeObject=method.invoke(object,args);
		return invokeObject;
	}
	
}
