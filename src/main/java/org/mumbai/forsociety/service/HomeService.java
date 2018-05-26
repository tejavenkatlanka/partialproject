package org.mumbai.forsociety.service;

import java.util.List;

import org.mumbai.forsociety.entity.Event;
import org.mumbai.forsociety.model.User;


public interface HomeService {
	
	User findById(String id);
	
	void saveEvent(Event event);
	
	void updateEvent(Event event);
	
	void deleteUserBySSO(String id);

	List<User> findAllEvents(); 

}