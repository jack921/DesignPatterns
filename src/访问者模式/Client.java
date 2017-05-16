package 访问者模式;

public class Client {

	public static void main(String[] args) {
		BusinessReport mBusinessReport=new BusinessReport();
		System.out.println("CEO");
		mBusinessReport.showRepost(new CEOVisitor());
		System.out.println("CTO");
		mBusinessReport.showRepost(new CTOVisitor());
	}
	
}
