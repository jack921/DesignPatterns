package ������ģʽ;

import java.util.ArrayList;
import java.util.List;

public class CompanyHui implements Compay{

	private Employee[] list=new Employee[5];
	
	public CompanyHui(){
		list[0]=new Employee("С��","��","����Ա",23);
		list[1]=new Employee("С��","��","����Ա",23);
		list[2]=new Employee("С��","��","����Ա",23);
		list[3]=new Employee("С��","��","����Ա",23);
		list[4]=new Employee("С��","��","����Ա",23);
	}
	
	public Employee[] getEmployee(){
		return this.list;
	}
	
	public Iterator iterator() {
		return new HuiIterator(list);
	}
	
}
