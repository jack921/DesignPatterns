package 责任链模式;

public abstract class Leader {

	protected Leader nextLeader;

	public abstract int limit();
	
	public abstract void handle(int money);
	
	public final void handleRequest(int money){
		if(money<=limit()){
			handle(money);
		}else{
			if(nextLeader!=null){
				nextLeader.handleRequest(money);
			}
		}
	}
	
}
