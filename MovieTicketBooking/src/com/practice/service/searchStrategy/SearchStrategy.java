package com.practice.service.searchStrategy;

import java.util.List;

import com.practice.dto.SearchRequestDTO;
import com.practice.model.Movie;

public interface SearchStrategy {
	public List<Movie> getMovies(SearchRequestDTO searchRequestDTO);
}
