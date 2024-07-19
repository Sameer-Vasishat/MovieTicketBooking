package com.practice.model;

public class Seat {
	private int seatId;
	private BookingStatus Status;
	private SeatType seatType;
	private boolean isAvailable;
	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	public BookingStatus getStatus() {
		return Status;
	}
	public void setStatus(BookingStatus status) {
		Status = status;
	}
	public SeatType getSeatType() {
		return seatType;
	}
	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	
}
