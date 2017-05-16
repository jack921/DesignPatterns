package 组合模式;

public class Client {

	public static void main(String[] args) {
		Component root=new Composite("Root");
		
		Component branch1=new Composite("Branch1");
		Component branch2=new Composite("Branch2");
		
		Component leaf1=new Leaf("leaf1");
		Component leaf2=new Leaf("leaf2");
		
		branch1.addChild(leaf1);
		branch2.addChild(leaf2);
		
		root.addChild(branch1);
		root.addChild(branch2);
		
		root.doSomething();
		
	}
	
}
