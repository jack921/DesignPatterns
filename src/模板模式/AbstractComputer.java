package ģ��ģʽ;

public abstract class AbstractComputer {

	public void powerOn(){
		System.out.println("������Դ");
	}
	
	public void checkHardware(){
		System.out.println("Ӳ�����");
	}
	
	public void loadOS(){
		System.out.println("����ϵͳ");
	}
	
	public void login(){
		System.out.println("�����û����������½");
	}
	
	public final void startUp(){
		System.out.println("------����start------");
		powerOn();
		checkHardware();
		loadOS();
		login();
		System.out.println("-----�ػ�start-------");
	}
	
	
}
