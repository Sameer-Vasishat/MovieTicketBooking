package com.practice.service.impl;

import java.util.List;
import java.util.UUID;

import com.practice.dto.BookingRequestDTO;
import com.practice.dto.BookingResponseDTO;
import com.practice.model.BookingStatus;
import com.practice.model.Seat;
import com.practice.model.SeatType;
import com.practice.service.BookingServiceIFace;
import com.practice.service.PriceDecorator.BasicCharges;
import com.practice.service.PriceDecorator.LuxuryTicketDecorator;
import com.practice.service.PriceDecorator.NormalTicketDecorator;
import com.practice.service.PriceDecorator.TicketPrice;
import com.practice.utils.BookingHelperImpl;

public class BookingServiceImpl implements BookingServiceIFace {
	
	@Override
	public BookingResponseDTO bookTickets(BookingRequestDTO bookingRquest) {
		BookingHelperImpl bookingHelperImpl=new BookingHelperImpl();
		//check for seats availablility
		if(!bookingHelperImpl.IfSeatsAvailable(bookingRquest)) return null;//or throw excecption
		//calculate prices
		float cost=bookingHelperImpl.checkTicketPrices(bookingRquest);
		return generateBookingResponse(bookingRquest,cost);
	}


	
	

	private BookingResponseDTO generateBookingResponse(BookingRequestDTO bookingRquest, float cost) {
		BookingHelperImpl bookingHelperImpl=new BookingHelperImpl();
		
		BookingResponseDTO bookingResponseDTO=new BookingResponseDTO();
		final String bookingId = UUID.randomUUID().toString();
		if(bookingHelperImpl.lockSeats(bookingRquest)) {
			cost=cost*bookingRquest.getNumOfTickets();
		}
		else return null; //throw exception
		bookingResponseDTO.setBookingID(bookingId);
		bookingResponseDTO.setNumTickets(bookingRquest.getNumOfTickets());
		bookingResponseDTO.setTotalAmount(cost);
		bookingResponseDTO.setUserId(bookingRquest.getUserId());
		bookingResponseDTO.setBookingStatus(BookingStatus.IN_PROGRESS);
		return bookingResponseDTO;
	}
	

}
