/**
 * 
 */
package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.domain.Movie;
import com.demo.dto.MovieDTO;
import com.demo.repository.MovieRepository;

/**
 * @author Pillutla
 *
 */
@RestController
@RequestMapping("/movieservice")
public class MovieRestServiceController {
	
	@Autowired
	private MovieRepository movieRepository;
	
	public Movie createMovie(@RequestBody MovieDTO movieDTO){
		Movie movie = null;
		if(null != movieDTO){
			movie = new Movie();
			movie.setGenre(movieDTO.getGenre());
			movie.setImdbRating(movieDTO.getImdbRating());
			movie.setLanguage(movieDTO.getLanguage());
			movie.setMovieName(movieDTO.getMovieName());
			movie.setNumberOfOscars(movieDTO.getNumberOfOscars());
			movie.setYear(movieDTO.getYear());
			
			movie = movieRepository.save(movie);
		}
		return movie;
	}
	
	@RequestMapping(value = "/movielistjson", method = RequestMethod.GET)
	public List<Movie> getAllMovies(){
		List<Movie> listOfMovies = null;
		listOfMovies = movieRepository.findAll();
		return listOfMovies;
	}
	
	public void deleteAllMovies(){
		movieRepository.deleteAll();
	}
}
