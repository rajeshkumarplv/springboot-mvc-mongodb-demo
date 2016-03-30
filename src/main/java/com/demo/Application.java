/**
 * 
 */
package com.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.controller.MovieRestServiceController;
import com.demo.controller.PersonController;
import com.demo.domain.Movie;
import com.demo.domain.Person;
import com.demo.dto.MovieDTO;
import com.demo.dto.PersonDTO;

/**
 * @author Pillutla
 *
 */
@SpringBootApplication
public class Application implements CommandLineRunner{

	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		SpringApplication.run(new Object[] { Application.class }, args);
	}
	
	@Autowired
	private PersonController personController;
	
	@Autowired
	private MovieRestServiceController movieController;
	
	/* (non-Javadoc)
	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
	 */
	@Override
	public void run(String... args) throws Exception {
		// Delete All Existing Records first
		personController.deleteAllPersons();
		movieController.deleteAllMovies();
		
		//Create new Person documents
		personController.createPerson(new PersonDTO("Rajesh", "Kumar"));
		personController.createPerson(new PersonDTO("Ramesh", "Kumar"));
		personController.createPerson(new PersonDTO("Vivek", "Sethi"));
		personController.createPerson(new PersonDTO("Sujatha", "Muthuswamy"));
		personController.createPerson(new PersonDTO("Anil", "Kumar"));
		
		//Create new Movie documents
		movieController.createMovie(new MovieDTO("Dark Knight", "English", "9.2", "2008", "Action", "2"));
		movieController.createMovie(new MovieDTO("Dark Knight Rises", "English", "8.0", "2012", "Action", "0"));
		movieController.createMovie(new MovieDTO("Iron Man", "English", "9.0", "2008", "Action", "0"));
		movieController.createMovie(new MovieDTO("The Avengers", "English", "9.0", "2012", "Action", "0"));
		movieController.createMovie(new MovieDTO("Sherlock Holmes", "English", "8.2", "2009", "Action", "0"));
		movieController.createMovie(new MovieDTO("Avatar", "English", "9.0", "2009", "Fantasy", "9"));
		movieController.createMovie(new MovieDTO("The Revenant", "English", "9.5", "2015", "Action/Adventure", "8"));
		movieController.createMovie(new MovieDTO("Titanic", "English", "9.6", "1997", "Drama", "11"));
		movieController.createMovie(new MovieDTO("Lord of the Rings", "English", "9.5", "2007", "Fantasy", "11"));
		movieController.createMovie(new MovieDTO("The Hangover", "English", "5.0", "2009", "Comedy", "0"));
		
		// Fetch all Persons
		List<Person> personsList = personController.getAllPersons();
		
		for(Person person : personsList){
			System.out.println(person);
		}
		
		// Fetch all Persons
		List<Movie> movieList = movieController.getAllMovies();
		
		for(Movie movie : movieList){
			System.out.println(movie);
		}
		
	}
}
