package com.practice.service;

import com.practice.dto.BookingRequestDTO;
import com.practice.dto.BookingResponseDTO;

public interface BookingServiceIFace {

	public BookingResponseDTO bookTickets(BookingRequestDTO bookingResponseDTO);
}
