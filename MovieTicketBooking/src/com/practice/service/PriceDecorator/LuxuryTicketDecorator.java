package com.practice.service.PriceDecorator;

public class LuxuryTicketDecorator extends TicketDecorator{

	TicketPrice ticketPrice;
	public LuxuryTicketDecorator(TicketPrice ticketPrice) {
		this.ticketPrice=ticketPrice;
	}
	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return this.ticketPrice.getCost()+220;
	}

}
