package 迭代器模式;

import java.util.ArrayList;
import java.util.List;

public class CompanyMin implements Compay{

	private List<Employee> list=new ArrayList<Employee>();
	
	public CompanyMin(){
		list.add(new Employee("小明","男","程序员",23));
		list.add(new Employee("小明","男","程序员",23));
		list.add(new Employee("小明","男","程序员",23));
		list.add(new Employee("小明","男","程序员",23));
		list.add(new Employee("小明","男","程序员",23));
	}
	
	public List<Employee> getEmployee(){
		return this.list;
	}
	
	public Iterator iterator() {
		return new MinIterator(list);
	}

}
