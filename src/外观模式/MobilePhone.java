package 外观模式;

public class MobilePhone {

	Phone phone=new PhoneImpl();
	Camera camera=new CameraImpl();
	
	public void dail(){
		phone.dail();
	}
	
	public void videoChat(){
		System.out.println("视频聊天接通中");
		camera.open();
		phone.dail();
	}

	public void hangup(){
		phone.hangup();
	}
	
	public void takePicture(){
		camera.open();
		camera.tackPicture();
	}
	
	public void closeCamera(){
		camera.close();
	}
	
}
