package com.practice.service.searchStrategy;

import java.util.ArrayList;
import java.util.List;

import com.practice.dto.SearchRequestDTO;
import com.practice.model.Movie;
import com.practice.model.MovieBookingManager;

public class SearchByCityStrategy implements SearchStrategy{

	@Override
	public List<Movie> getMovies(SearchRequestDTO searchRequestDTO) {
		// TODO Auto-generated method stub
		MovieBookingManager movieBookingManager=MovieBookingManager.getInstance();
		String city=searchRequestDTO.getCity();
		List<Movie> movieResponse=new ArrayList();
		List<Movie> moviesList=movieBookingManager.getMovies();
		for(Movie movie: moviesList) {
			if(movie.getCity().equalsIgnoreCase(city) && movie.getStartTime().after(searchRequestDTO.getDate())) {
				movieResponse.add(movie);
			}
		}
		return movieResponse;
	
	}

}
