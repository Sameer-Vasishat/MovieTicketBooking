package com.practice.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Theater {

	private int TheaterId;
	private String TheaterName;
	private Address address;
	private List<Audi> audiList;
	public int getTheaterId() {
		return TheaterId;
	}
	public void setTheaterId(int theaterId) {
		TheaterId = theaterId;
	}
	public String getTheaterName() {
		return TheaterName;
	}
	public void setTheaterName(String theaterName) {
		TheaterName = theaterName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Audi> getAudiList() {
		return audiList;
	}
	public void setAudiList(List<Audi> audiList) {
		this.audiList = audiList;
	}

	
}
