package 外观模式;

public class Client {
	public static void main(String[] args) {
		MobilePhone phone=new MobilePhone();
		phone.takePicture();
		System.out.println("-------------");
		phone.videoChat();
	}
}
