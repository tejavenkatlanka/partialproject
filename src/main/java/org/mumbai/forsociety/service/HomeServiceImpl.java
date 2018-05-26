package org.mumbai.forsociety.service;

import java.util.List;

import org.mumbai.forsociety.entity.Event;
import org.mumbai.forsociety.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("homeService")
@Transactional
public class HomeServiceImpl implements HomeService {

	@Override
	public User findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveEvent(Event event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEvent(Event event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUserBySSO(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> findAllEvents() {
		// TODO Auto-generated method stub
		return null;
	}


	
}
