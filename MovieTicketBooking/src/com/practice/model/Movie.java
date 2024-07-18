package com.practice.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Movie {
	private int movieId;
	private String MovieName;
	private double rating;
	private Date startTime;
	private Date endTime;
	private Genre genre;
	private Theater theaterPlaying;
	private Audi audi;
	private String city;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return MovieName;
	}
	public void setMovieName(String movieName) {
		MovieName = movieName;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public Theater getTheaterPlaying() {
		return theaterPlaying;
	}
	public void setTheaterPlaying(Theater theaterPlaying) {
		this.theaterPlaying = theaterPlaying;
	}
	public Audi getAudi() {
		return audi;
	}
	public void setAudi(Audi audi) {
		this.audi = audi;
	}
	
	
}
