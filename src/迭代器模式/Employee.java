package µü´úÆ÷Ä£Ê½;

public class Employee {

	private String name;
	private String sex;
	private String position;
	private int age;
	
	public Employee(String name, String sex, String position,int age) {
		this.name = name;
		this.sex = sex;
		this.position = position;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return name+","+sex+","+position+","+age;
	}
	
	
	
}
