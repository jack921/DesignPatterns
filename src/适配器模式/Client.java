package ������ģʽ;

public class Client {
		
	public static void main(String[] args) {
		ClassVoltAdapter classVoltAdapter=new ClassVoltAdapter();
		System.out.println("�����ѹΪ:"+classVoltAdapter.getVolt5());
	
		ObjectVoltAdapter objectVoltAdapter=new ObjectVoltAdapter(new ObjectVolt220());
		System.out.println("�����ѹΪ:"+objectVoltAdapter.getVolt5());
		
	}
	
}
