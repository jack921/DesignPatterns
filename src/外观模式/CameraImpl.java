package 外观模式;

public class CameraImpl implements Camera{

	public void open() {
		System.out.println("打开相机");
	}

	public void tackPicture() {
		System.out.println("拍照");
	}

	public void close() {
		System.out.println("关闭相机");
	}

	
	
}
