package ������ģʽ;

public class CEOVisitor implements Visitor{

	public void visitor(Engineer engineer) {
		System.out.println("����ʦ:"+engineer.getName()+",kpi:"+engineer.getKpi());
	}

	public void visitor(Manager manager) {
		System.out.println("����:"+manager.getName()+",kpi:"+manager.getKpi());
	}

}
