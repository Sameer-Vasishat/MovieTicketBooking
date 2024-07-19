package com.practice.controller;

import com.practice.dto.BookingRequestDTO;
import com.practice.dto.BookingResponseDTO;
import com.practice.service.BookingServiceIFace;
import com.practice.service.impl.BookingServiceImpl;

public class BookingController {
	
	BookingResponseDTO confirmBooking(BookingRequestDTO bookingRequestDTO) {
		BookingResponseDTO bookingResponseDTO=new BookingResponseDTO();
		BookingServiceIFace bookingServiceIFace=new BookingServiceImpl();
		bookingResponseDTO=bookingServiceIFace.bookTickets(bookingRequestDTO);
		return bookingResponseDTO;
	}
    

}
