package Builderģʽ;

public class BuilderModel {

	public static void main(String[] args) {
		Builder builder=new MacBookBuilder();
		Director director=new Director(builder);
		director.construct("��˶","Ӣ�ض�");
		System.out.println(builder.create().toString());
	}
	
}
