package org.mumbai.forsociety.service;

import java.util.List;

import org.mumbai.forsociety.entity.Event;


public interface EventService {
	
	Event findById(String id);
	
	void saveEvent(Event event);
	
	void updateEvent(Event event);
	
	void deleteEvent(String id);

	List<Event> findAllEvents(); 
	
	List<Event> getEvents(int pageNo ,int pagesize);


}