/**
 * 
 */
package com.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.domain.Person;

/**
 * @author Pillutla
 *
 */
public interface PersonRepository extends MongoRepository<Person, String> {
}
