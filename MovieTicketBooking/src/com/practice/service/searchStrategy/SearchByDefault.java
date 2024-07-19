package com.practice.service.searchStrategy;

import java.util.ArrayList;
import java.util.List;

import com.practice.dto.SearchRequestDTO;
import com.practice.model.Movie;
import com.practice.model.MovieBookingManager;

public class SearchByDefault implements SearchStrategy{

	//Return all movies by default
	public List<Movie> getMovies(SearchRequestDTO searchRequestDTO) {
		// TODO Auto-generated method stub
		MovieBookingManager movieBookingManager=MovieBookingManager.getInstance();
		List<Movie> movieResponse=new ArrayList();
		List<Movie> moviesList=movieBookingManager.getMovies();
		for(Movie movie: moviesList) {
			if(movie.getStartTime().after(searchRequestDTO.getDate())) {
				movieResponse.add(movie);
			}
		}
		return movieResponse;
	
	}

}
