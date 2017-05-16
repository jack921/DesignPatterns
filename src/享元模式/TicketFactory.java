package 享元模式;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TicketFactory {

	public static Map<String,Ticket> sTicketMap=new ConcurrentHashMap<String, Ticket>();

	public static Ticket getTicket(String from,String to){
		String key=from+"-"+to;
		if(sTicketMap.containsKey(key)){
			System.out.println("使用缓存");
			return sTicketMap.get(key);
		}else{
			System.out.println("创建对象");
			Ticket ticket=new TrainTicket(from,to);
			sTicketMap.put(key,ticket);
			return ticket;
		}
	}
	
}
