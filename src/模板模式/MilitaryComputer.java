package 模板模式;

public class MilitaryComputer extends AbstractComputer{

	@Override
	public void checkHardware() {
		// TODO Auto-generated method stub
		super.checkHardware();
		System.out.println("检测硬件防火墙");
	}
	
	@Override
	public void login() {
		System.out.println("指纹识别登陆");
	}
	
}
