package com.practice.dto;

import java.util.List;

import com.practice.model.Seat;
import com.practice.model.SeatType;

public class BookingRequestDTO {

int theaterId;
 int movieId;
 int userId;
 int numOfTickets;
 SeatType seatType;
 List<Seat> seats;
 public SeatType getSeatType() {
		return seatType;
	}
	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}
public int getTheaterId() {
	return theaterId;
}
public void setTheaterId(int theaterId) {
	this.theaterId = theaterId;
}
public int getMovieId() {
	return movieId;
}
public void setMovieId(int movieId) {
	this.movieId = movieId;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public int getNumOfTickets() {
	return numOfTickets;
}
public void setNumOfTickets(int numOfTickets) {
	this.numOfTickets = numOfTickets;
}
public List<Seat> getSeats() {
	return seats;
}
public void setSeats(List<Seat> seats) {
	this.seats = seats;
}
}
