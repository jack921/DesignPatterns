package 访问者模式;

public class CEOVisitor implements Visitor{

	public void visitor(Engineer engineer) {
		System.out.println("工程师:"+engineer.getName()+",kpi:"+engineer.getKpi());
	}

	public void visitor(Manager manager) {
		System.out.println("经理:"+manager.getName()+",kpi:"+manager.getKpi());
	}

}
