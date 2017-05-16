package µü´úÆ÷Ä£Ê½;

import java.util.List;

public class HuiIterator implements Iterator{

	private Employee[] list; 
	private int position;
	
	public HuiIterator(Employee[] list){
		this.list=list;
	}
	
	public boolean hasNext() {
		return !(position>list.length-1||list[position]==null);
	}

	public Object next() {
		Employee employee=list[position];
		position++;
		return employee;
	}
	
}
