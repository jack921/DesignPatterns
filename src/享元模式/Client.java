package 享元模式;

public class Client {

	public static void main(String[] args) {
		Ticket ticket=new TicketFactory().getTicket("广州","深圳");
		ticket.showTicketInfo("上铺");
		Ticket ticket2=new TicketFactory().getTicket("广州","深圳");
		ticket2.showTicketInfo("上铺");
		Ticket ticket3=new TicketFactory().getTicket("广州","深圳");
		ticket3.showTicketInfo("上铺");
	}
	
}
