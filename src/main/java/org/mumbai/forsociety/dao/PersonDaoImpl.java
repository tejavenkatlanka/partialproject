package org.mumbai.forsociety.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.mumbai.forsociety.entity.News;
import org.mumbai.forsociety.entity.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("personDao")
public class PersonDaoImpl extends AbstractDao<Long, Person> implements PersonDao {

	static final Logger logger = LoggerFactory.getLogger(PersonDaoImpl.class);

	public Person findById(Long id) {
		Person person = getByKey(id);
		/*
		 * if(user!=null){ Hibernate.initialize(user.getUserProfiles()); }
		 */
		return person;
	}

	@Override
	public void updatePerson(Person person) {
		update(person);
	}

	@Override
	public List<Person> findAllPersons() {
		Criteria criteria = createEntityCriteria();// .addOrder(0Order.asc("firstName"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid duplicates.
		List<Person> persons = (List<Person>) criteria.list();
		return persons;
	}

	public void save(Person person) {
		persist(person);
	}

	public void deleteById(Long id) {
		Criteria crit = createEntityCriteria();
		// crit.add(Restrictions.eq("ssoId", id));
		Person person = (Person) crit.uniqueResult();
		delete(person);
	}

	@Override
	public List<Person> getPersons(int pageNo, int pagesize) {
		Criteria criteria = createEntityCriteria();
		criteria.addOrder(Order.desc("news_id"));
		criteria.setFirstResult(0);
		criteria.setMaxResults(pagesize);
		List<Person> currentPage = criteria.list();
		return currentPage;
	}
	
	
	

}
