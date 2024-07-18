package com.practice.model;

import java.util.List;
import java.util.Map;

public class MovieBookingManager {
	
	private List<Theater> theaters;
	private List<Movie> movies;
	private static MovieBookingManager instance;
	public static synchronized MovieBookingManager getInstance() {
		if (instance == null) {
            instance = new MovieBookingManager();
        }	
		return instance;
	}
	
	public List<Theater> getTheaters() {	
		return theaters;
	}
	public void setTheaters(List<Theater> theaters) {
		this.theaters = theaters;
	}
	public List<Movie> getMovies() {
		return movies;
	}
	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	public static void setInstance(MovieBookingManager instance) {
		MovieBookingManager.instance = instance;
	}
	
}
