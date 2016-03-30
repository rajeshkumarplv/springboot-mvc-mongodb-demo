/**
 * 
 */
package com.demo.domain;

import org.springframework.data.annotation.Id;

/**
 * @author Pillutla
 *
 */
public class Movie {

	@Id
	private String id;
	
	private String movieName;
	private String language;
	private String imdbRating;
	private String year;
	private String genre;
	private String numberOfOscars;
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}

	public Movie(String movieName, String language, String imdbRating, String year, String genre,
			String numberOfOscars) {
		super();
		this.movieName = movieName;
		this.language = language;
		this.imdbRating = imdbRating;
		this.year = year;
		this.genre = genre;
		this.numberOfOscars = numberOfOscars;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the movieName
	 */
	public String getMovieName() {
		return movieName;
	}

	/**
	 * @param movieName the movieName to set
	 */
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * @return the imdbRating
	 */
	public String getImdbRating() {
		return imdbRating;
	}

	/**
	 * @param imdbRating the imdbRating to set
	 */
	public void setImdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
	}

	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}

	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * @return the numberOfOscars
	 */
	public String getNumberOfOscars() {
		return numberOfOscars;
	}

	/**
	 * @param numberOfOscars the numberOfOscars to set
	 */
	public void setNumberOfOscars(String numberOfOscars) {
		this.numberOfOscars = numberOfOscars;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Movie [id=");
		builder.append(id);
		builder.append(", movieName=");
		builder.append(movieName);
		builder.append(", language=");
		builder.append(language);
		builder.append(", imdbRating=");
		builder.append(imdbRating);
		builder.append(", year=");
		builder.append(year);
		builder.append(", genre=");
		builder.append(genre);
		builder.append(", numberOfOscars=");
		builder.append(numberOfOscars);
		builder.append("]");
		return builder.toString();
	}
	
	
}
