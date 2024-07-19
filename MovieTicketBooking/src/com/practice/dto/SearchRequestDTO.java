package com.practice.dto;

import java.util.Date;

public class SearchRequestDTO {
	private String searchByStrategy;
	private String name;
	private String genre;
	public String getSearchByStrategy() {
		return searchByStrategy;
	}
	public void setSearchByStrategy(String searchByStrategy) {
		this.searchByStrategy = searchByStrategy;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public java.util.Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	String city;
	java.util.Date Date;
}
