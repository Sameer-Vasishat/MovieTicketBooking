package com.practice.model;

import java.util.List;

public class Audi {
		private int audiId;
		private String audiName;
		private List<Seat> availableSeats;
		private int theaterID;
		public List<Seat> getAvailableSeats() {
			return this.availableSeats;
		}
		
}
