/**
 * 
 */
package com.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.domain.Movie;

/**
 * @author Pillutla
 *
 */
public interface MovieRepository extends MongoRepository<Movie, String> {

}
