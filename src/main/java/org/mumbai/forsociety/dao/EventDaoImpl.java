package org.mumbai.forsociety.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.mumbai.forsociety.entity.Event;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("eventDao")
public class EventDaoImpl extends AbstractDao<Long, Event> implements EventDao {

	static final Logger logger = LoggerFactory.getLogger(EventDaoImpl.class);

	public Event findById(Long id) {
		Event event = getByKey(id);
		/*
		 * if(user!=null){ Hibernate.initialize(user.getUserProfiles()); }
		 */
		return event;
	}

	@Override
	public List<Event> findAllEvents() {
		Criteria criteria = createEntityCriteria();// .addOrder(0Order.asc("firstName"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid duplicates.
		List<Event> events = (List<Event>) criteria.list();
		return events;
	}

	public void save(Event event) {
		persist(event);
	}

	public void deleteById(Long id) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("ssoId", id));
		Event event = (Event) crit.uniqueResult();
		delete(event);
	}

	@Override
	public void updateEvent(Event event) {
		update(event);
	}

	@Override
	public List<Event> getEvents(int pageNo, int pagesize) {
		Criteria criteria = createEntityCriteria();
		criteria.addOrder(Order.desc("event_id"));
		criteria.setFirstResult(0);
		criteria.setMaxResults(pagesize);
		List<Event> currentPage = criteria.list();
		return currentPage;
	}

}
