package 迭代器模式;

import java.util.ArrayList;
import java.util.List;

public class CompanyHui implements Compay{

	private Employee[] list=new Employee[5];
	
	public CompanyHui(){
		list[0]=new Employee("小明","男","程序员",23);
		list[1]=new Employee("小明","男","程序员",23);
		list[2]=new Employee("小明","男","程序员",23);
		list[3]=new Employee("小明","男","程序员",23);
		list[4]=new Employee("小明","男","程序员",23);
	}
	
	public Employee[] getEmployee(){
		return this.list;
	}
	
	public Iterator iterator() {
		return new HuiIterator(list);
	}
	
}
