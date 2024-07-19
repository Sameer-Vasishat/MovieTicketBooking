package com.practice.utils;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.practice.dto.BookingRequestDTO;
import com.practice.model.Seat;
import com.practice.model.SeatType;
import com.practice.service.PriceDecorator.BasicCharges;
import com.practice.service.PriceDecorator.LuxuryTicketDecorator;
import com.practice.service.PriceDecorator.NormalTicketDecorator;
import com.practice.service.PriceDecorator.TicketPrice;

public class BookingHelperImpl {
	static HashMap<String,Date> lockKeys=new HashMap();
	synchronized public boolean  lockSeats(BookingRequestDTO bookingRequest) {
		List<Seat> seats=bookingRequest.getSeats();
		for(Seat seat: seats) {
			String LockString=bookingRequest.getMovieId()+seat.getSeatId()+"book";
			if(lockKeys.containsKey(LockString) && new Date().before(lockKeys.get(LockString))) {
				System.out.println("Seats not available");
				return false;
			}
			lockKeys.put(LockString,new Date(System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(5)));
		}
		
		return true;
	}

	public float checkTicketPrices(BookingRequestDTO bookingRquest) {
		TicketPrice ticketPrice=new BasicCharges();
		if(bookingRquest.getSeatType().equals(SeatType.BASIC)) 
			ticketPrice=new NormalTicketDecorator(ticketPrice);
		if(bookingRquest.getSeatType().equals(SeatType.LUXURY)) 
			ticketPrice=new LuxuryTicketDecorator(ticketPrice);
		float cost= ticketPrice.getCost();
		return cost;
		
	}
	synchronized public boolean IfSeatsAvailable(BookingRequestDTO bookingRequest) {
		List<Seat> seats=bookingRequest.getSeats();
		for(Seat seat: seats) {
			if(!seat.isAvailable()) return false;
			}
		return true;
	}
}

