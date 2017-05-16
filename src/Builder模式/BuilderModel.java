package Builder模式;

public class BuilderModel {

	public static void main(String[] args) {
		Builder builder=new MacBookBuilder();
		Director director=new Director(builder);
		director.construct("华硕","英特尔");
		System.out.println(builder.create().toString());
	}
	
}
