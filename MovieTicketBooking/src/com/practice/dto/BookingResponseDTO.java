package com.practice.dto;

import java.math.BigDecimal;

import com.practice.model.BookingStatus;

public class BookingResponseDTO {
	private String bookingID;
	private int userId;
	private int numTickets;
	private float totalAmount;
	private BookingStatus bookingStatus;
	public String getBookingID() {
		return bookingID;
	}
	public void setBookingID(String bookingID) {
		this.bookingID = bookingID;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getNumTickets() {
		return numTickets;
	}
	public void setNumTickets(int numTickets) {
		this.numTickets = numTickets;
	}
	public float getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
	public BookingStatus getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(BookingStatus bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
}
