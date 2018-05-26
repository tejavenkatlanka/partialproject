package org.mumbai.forsociety.service;

import java.util.List;

import org.mumbai.forsociety.entity.Person;


public interface PersonService {
	
	Person findById(String id);
	
	void saveEvent(Person person);
	
	void updateEvent(Person person);
	
	void deletePerson(String id);

	List<Person> findAllPersons(); 
	
	List<Person> getPersons(int pageNo ,int pagesize);


}