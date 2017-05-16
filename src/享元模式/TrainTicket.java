package 享元模式;

import java.util.Random;

public class TrainTicket implements Ticket{
	private String from;
	private String to;
	private int price;
	
	public TrainTicket(String form,String to){
		this.to=to;
		this.from=form;
	}
	
	public void showTicketInfo(String bunk) {
		price=new Random().nextInt(300);
		System.out.println("从"+from+"到"+to+"的"+bunk+"价格为"+price);
	}

}
