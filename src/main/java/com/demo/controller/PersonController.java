/**
 * 
 */
package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.domain.Person;
import com.demo.dto.PersonDTO;
import com.demo.repository.PersonRepository;

/**
 * @author Pillutla
 *
 */
@Controller
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonRepository personRepository;
	
	@RequestMapping(method = RequestMethod.POST)
	public Person createPerson(@RequestBody PersonDTO personDTO){
		Person person = null;
		if(null != personDTO){
			person = new Person();
			person.setFirstName(personDTO.getFirstName());
			person.setLastName(personDTO.getLastName());
			
			person = personRepository.save(person);
		}
		return person;
	}
	
	public List<Person> getAllPersons(){
		List<Person> listOfPersons = null;
		listOfPersons = personRepository.findAll();
		return listOfPersons;
	}
	
    @RequestMapping(value = "/personlist", method = RequestMethod.GET)
    public String showPersonList(Model model){
        model.addAttribute("persons", personRepository.findAll());
        return "persons";
    }
    
    public void deleteAllPersons(){
    	personRepository.deleteAll();
    }
}
