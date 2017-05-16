package µü´úÆ÷Ä£Ê½;

import java.util.List;

public class MinIterator implements Iterator{
	private List<Employee> list; 
	private int position;
	
	public MinIterator(List<Employee> list){
		this.list=list;
	}
	
	public boolean hasNext() {
		return !(position>list.size()-1||list.get(position)==null);
	}

	public Object next() {
		Employee employee=list.get(position);
		position++;
		return employee;
	}

}
