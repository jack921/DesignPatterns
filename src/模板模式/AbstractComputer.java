package 模板模式;

public abstract class AbstractComputer {

	public void powerOn(){
		System.out.println("开启电源");
	}
	
	public void checkHardware(){
		System.out.println("硬件检测");
	}
	
	public void loadOS(){
		System.out.println("加载系统");
	}
	
	public void login(){
		System.out.println("无需用户名和密码登陆");
	}
	
	public final void startUp(){
		System.out.println("------开机start------");
		powerOn();
		checkHardware();
		loadOS();
		login();
		System.out.println("-----关机start-------");
	}
	
	
}
