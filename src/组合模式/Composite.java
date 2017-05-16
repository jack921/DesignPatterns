package 组合模式;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
	private List<Component> components=new ArrayList<Component>();
	
	public Composite(String name) {
		super(name);
	}

	@Override
	public void doSomething() {
		System.out.println(name);
		if(components!=null){
			for(Component c:components){
				c.doSomething();
			}
		}
	}

	@Override
	public void addChild(Component component) {
		component.addChild(component);
	}

	@Override
	public void removeChild(Component component) {
		component.removeChild(component);
	}

	@Override
	public Component getChild(int index) {
		return components.get(index);
	}
	
}
