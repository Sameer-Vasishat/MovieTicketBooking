package com.practice.service;

import java.util.List;

import com.practice.dto.SearchRequestDTO;
import com.practice.model.Movie;

public interface SearchobjServiceIFace {
	List<Movie> getMovies(SearchRequestDTO searchRequest);
}
