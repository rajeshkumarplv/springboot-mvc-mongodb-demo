/**
 * 
 */
package com.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.demo.domain.Movie;

/**
 * @author Pillutla
 *
 */
@Controller
@RequestMapping("/movie")
public class MovieController{
	
    @SuppressWarnings("unchecked")
	@RequestMapping("/movielistws")
    public String showMovieListWS(Model model){
        RestTemplate restTemplate = new RestTemplate();
        String url="http://localhost:8080/movieservice/movielistjson/";    
        List<Movie> movies = restTemplate.getForObject(url, List.class);
       
        model.addAttribute("movies", movies);
        return "movies";
    }
    
}
