package com.practice.service.impl;

import java.util.Date;
import java.util.List;

import com.practice.dto.SearchRequestDTO;
import com.practice.dto.SearchResponseDTO;
import com.practice.model.Movie;
import com.practice.model.StrategyType;
import com.practice.service.SearchobjServiceIFace;
import com.practice.service.searchStrategy.SearchByCityStrategy;
import com.practice.service.searchStrategy.SearchByTitleStrategy;
import com.practice.service.searchStrategy.SearchObject;
import com.practice.service.searchStrategy.SearchStrategy;

public class SearchObjectServiceImpl implements SearchobjServiceIFace{

	@Override
	public List<Movie> getMovies(SearchRequestDTO searchRequest) {
		// TODO Auto-generated method stub
		SearchObject searchObject =new SearchObject(searchRequest) ;
		SearchStrategy searchStrategy;
		
		if(searchRequest.getSearchByStrategy().equalsIgnoreCase(StrategyType.TITLE.toString())){
			searchStrategy=new SearchByTitleStrategy();
		}
		else if(searchRequest.getSearchByStrategy().equalsIgnoreCase(StrategyType.CITY.toString())){
			searchStrategy=new SearchByCityStrategy();
		}
		else 
			searchStrategy= new SearchByCityStrategy();
		
		searchObject.setSearchStrategy(searchStrategy);
		List<Movie> movies=searchObject.searchMovies();
	
		return movies;
	}
	
}
