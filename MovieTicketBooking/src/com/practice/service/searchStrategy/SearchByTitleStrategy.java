package com.practice.service.searchStrategy;

import java.util.ArrayList;
import java.util.List;

import com.practice.dto.SearchRequestDTO;
import com.practice.model.Movie;
import com.practice.model.MovieBookingManager;

public class SearchByTitleStrategy  implements SearchStrategy{

	@Override
	public List<Movie> getMovies(SearchRequestDTO searchRequestDTO) {
		MovieBookingManager movieBookingManager=MovieBookingManager.getInstance();
		String title=searchRequestDTO.getName();
		List<Movie> movieResponse=new ArrayList();
		List<Movie> moviesList=movieBookingManager.getMovies();
		for(Movie movie: moviesList) {
			if(movie.getMovieName().equalsIgnoreCase(title) && movie.getStartTime().after(searchRequestDTO.getDate())) {
				movieResponse.add(movie);
			}
		}
		return movieResponse;
	}

}
