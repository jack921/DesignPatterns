package ���ģʽ;

public class MobilePhone {

	Phone phone=new PhoneImpl();
	Camera camera=new CameraImpl();
	
	public void dail(){
		phone.dail();
	}
	
	public void videoChat(){
		System.out.println("��Ƶ�����ͨ��");
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
