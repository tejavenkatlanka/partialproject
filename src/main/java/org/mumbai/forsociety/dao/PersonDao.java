package org.mumbai.forsociety.dao;

import java.util.List;

import org.mumbai.forsociety.entity.News;
import org.mumbai.forsociety.entity.Person;

public interface PersonDao {

	Person findById(Long id);

	void save(Person person);

	void deleteById(Long id);

	void updatePerson(Person person);

	List<Person> findAllPersons();
	List<Person> getPersons(int pageNo ,int pagesize);

}
