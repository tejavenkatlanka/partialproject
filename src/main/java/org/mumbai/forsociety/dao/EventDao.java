package org.mumbai.forsociety.dao;

import java.util.List;

import org.mumbai.forsociety.entity.Event;


public interface EventDao {

	Event findById(Long id);
	
	void save(Event event);
	
	void deleteById(Long id);
	
	void updateEvent(Event event);
	
	List<Event> findAllEvents();
	List<Event> getEvents(int pageNo ,int pagesize);

}

