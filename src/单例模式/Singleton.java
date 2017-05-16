package 单例模式;

//单例模式
public class Singleton {

	private static String name="jack";
	
	private static Singleton singleton=null;
	public static Singleton getInstance(){
		if(singleton==null){
			synchronized (Singleton.class) {
				if(singleton==null){
					singleton=new Singleton();
				}
			}
		}
		return singleton;
	}
	
	public static void main(String[] args){
		System.out.println(Singleton.getInstance().name);	
	}
	
}
