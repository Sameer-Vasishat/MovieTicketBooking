package com.practice.controller;

import java.util.Date;
import java.util.List;

import com.practice.dto.SearchRequestDTO;
import com.practice.dto.SearchResponseDTO;
import com.practice.model.Movie;
import com.practice.service.SearchobjServiceIFace;
import com.practice.service.impl.SearchObjectServiceImpl;

public class SearchController {
	
public SearchResponseDTO searchMovies(SearchRequestDTO searchRequestDTO) {
	SearchResponseDTO searchResponseDTO=new SearchResponseDTO(new Date(),searchRequestDTO.getName());
	try {
		SearchobjServiceIFace searchObject=new SearchObjectServiceImpl() ;
		List<Movie> movies=searchObject.getMovies(searchRequestDTO);
		searchResponseDTO.setMovies(movies);
	}
	catch(Exception e) {
		System.out.println("Error occured while searching "+e.getStackTrace());
		
	}
	return searchResponseDTO;
}

}
