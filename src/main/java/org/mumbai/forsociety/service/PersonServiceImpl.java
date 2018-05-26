package org.mumbai.forsociety.service;

import java.util.List;

import org.mumbai.forsociety.dao.PersonDao;
import org.mumbai.forsociety.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("personService")
@Transactional
public class PersonServiceImpl implements PersonService {

	@Autowired
	PersonDao dao;

	@Override
	public Person findById(String id) {
		return null;
	}

	@Override
	public void saveEvent(Person person) {
		dao.save(person);
	}

	@Override
	public void updateEvent(Person person) {
		dao.updatePerson(person);
	}

	@Override
	public void deletePerson(String id) {
		if (id != null && !id.isEmpty()) {
			Long idLong = Long.valueOf(id);
			dao.deleteById(idLong);
		}
	}

	@Override
	public List<Person> findAllPersons() {
		return dao.findAllPersons();
	}

	@Override
	public List<Person> getPersons(int pageNo, int pagesize) {
		return dao.getPersons(pageNo, pagesize);
	}

}
