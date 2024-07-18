package com.practice.model;

import java.util.Date;

public class Booking {
	int bookingId;
	User user;
	String bookingMetaInfo;
	Date bookingDate;
	Movie movie;
	Theater theater;
	Audi audi;
	Payment paymentDetails;
	BookingStatus bookingstatus;
	public boolean doPayment(Payment payment) {
		return true;
	}
}
