package ������ģʽ;

import java.util.ArrayList;
import java.util.List;

public class CompanyMin implements Compay{

	private List<Employee> list=new ArrayList<Employee>();
	
	public CompanyMin(){
		list.add(new Employee("С��","��","����Ա",23));
		list.add(new Employee("С��","��","����Ա",23));
		list.add(new Employee("С��","��","����Ա",23));
		list.add(new Employee("С��","��","����Ա",23));
		list.add(new Employee("С��","��","����Ա",23));
	}
	
	public List<Employee> getEmployee(){
		return this.list;
	}
	
	public Iterator iterator() {
		return new MinIterator(list);
	}

}
