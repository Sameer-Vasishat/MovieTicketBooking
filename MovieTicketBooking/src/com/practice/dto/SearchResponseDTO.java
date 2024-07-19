package com.practice.dto;

import java.util.Date;
import java.util.List;

import com.practice.model.Movie;
import com.practice.model.User;

public class SearchResponseDTO {
		Date time;
		String user;
		List<Movie> movies; 
		public Date getTime() {
			return time;
		}
		public void setTime(Date time) {
			this.time = time;
		}
		public String getUser() {
			return user;
		}
		public void setUser(String user) {
			this.user = user;
		}
		public List<Movie> getMovies() {
			return movies;
		}
		public void setMovies(List<Movie> movies) {
			this.movies = movies;
		}
		public SearchResponseDTO(Date time, String user) {
			super();
			this.time = time;
			this.user = user;
		}
		
}
