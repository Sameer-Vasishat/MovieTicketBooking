package com.practice.service.PriceDecorator;

public class NormalTicketDecorator extends TicketDecorator {

	TicketPrice ticketPrice;
	public NormalTicketDecorator(TicketPrice ticketPrice) {
		this.ticketPrice=ticketPrice;
	}
	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return this.ticketPrice.getCost()+120;
	}}
