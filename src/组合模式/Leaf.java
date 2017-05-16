package ���ģʽ;

import java.nio.channels.UnsupportedAddressTypeException;

public class Leaf extends Component{

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void doSomething() {
		System.out.println(name);
	}

	@Override
	public void addChild(Component component) {
//		throw new UnsupportedOperationException("û���ӽڵ�");
		System.out.println("add");
	}

	@Override
	public void removeChild(Component component) {
//		throw new UnsupportedOperationException("û���ӽڵ�");
		System.out.println("remove");
	}

	@Override
	public Component getChild(int index) {
//		throw new UnsupportedOperationException("û���ӽڵ�");
		System.out.println("getChild");
		return null;
	}

	
	
}
