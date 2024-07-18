package com.practice.service.searchStrategy;

import java.util.List;

import com.practice.dto.SearchRequestDTO;
import com.practice.model.Movie;

public class SearchObject {
		private SearchRequestDTO searchRequestDTO;
		private SearchStrategy searchStrategy;
		public SearchRequestDTO getSearchRequestDTO() {
			return searchRequestDTO;
		}
		public void setSearchRequestDTO(SearchRequestDTO searchRequestDTO) {
			this.searchRequestDTO = searchRequestDTO;
		}
		public SearchStrategy getSearchStrategy() {
			return searchStrategy;
		}
		public void setSearchStrategy(SearchStrategy searchStrategy) {
			this.searchStrategy = searchStrategy;
		}
		public SearchObject(SearchRequestDTO searchRequestDTO) {
			super();
			this.searchRequestDTO = searchRequestDTO;
		
		}
		public List<Movie> searchMovies(){
			return this.searchStrategy.getMovies(this.searchRequestDTO);
		}
		
		
}
