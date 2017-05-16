package 适配器模式;

public class Client {
		
	public static void main(String[] args) {
		ClassVoltAdapter classVoltAdapter=new ClassVoltAdapter();
		System.out.println("输出电压为:"+classVoltAdapter.getVolt5());
	
		ObjectVoltAdapter objectVoltAdapter=new ObjectVoltAdapter(new ObjectVolt220());
		System.out.println("输出电压为:"+objectVoltAdapter.getVolt5());
		
	}
	
}
