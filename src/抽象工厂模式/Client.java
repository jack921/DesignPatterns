package 抽象工厂模式;

public class Client {

	public static void main(String[] args) {
		CarFactory carFactoryQ3=new Q3Factory();
		carFactoryQ3.createEndgine().engine();
		carFactoryQ3.createITire().tire();
		carFactoryQ3.crrateIKrake().brake();
		
		CarFactory carFactoryQ7=new Q7Factory();
		carFactoryQ7.createEndgine().engine();
		carFactoryQ7.createITire().tire();
		carFactoryQ7.crrateIKrake().brake();
	}
	
}
