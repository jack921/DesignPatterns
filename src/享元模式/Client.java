package ��Ԫģʽ;

public class Client {

	public static void main(String[] args) {
		Ticket ticket=new TicketFactory().getTicket("����","����");
		ticket.showTicketInfo("����");
		Ticket ticket2=new TicketFactory().getTicket("����","����");
		ticket2.showTicketInfo("����");
		Ticket ticket3=new TicketFactory().getTicket("����","����");
		ticket3.showTicketInfo("����");
	}
	
}
