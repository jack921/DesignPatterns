package 访问者模式;

import java.util.Random;

public abstract class Staff {

	private String name;
	private int kpi;
	
	public Staff(String name){
		this.name=name;
		kpi=new Random().nextInt();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKpi() {
		return kpi;
	}

	public void setKpi(int kpi) {
		this.kpi = kpi;
	}

	public abstract void accept(Visitor visitor);
	
}
