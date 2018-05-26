package org.mumbai.forsociety.service;

import java.util.List;

import org.mumbai.forsociety.dao.EventDao;
import org.mumbai.forsociety.entity.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("eventService")
@Transactional
public class EventServiceImpl implements EventService {

	@Autowired
	EventDao dao;

	@Override
	public Event findById(String id) {
		Event event = null;
		if (id != null && !id.isEmpty()) {
			Long idLong = Long.valueOf(id);
			event = dao.findById(idLong);

		}
		return event;
	}

	@Override
	public void saveEvent(Event event) {
		dao.save(event);
	}

	@Override
	public void updateEvent(Event event) {
		dao.updateEvent(event);
	}

	@Override
	public void deleteEvent(String id) {
		if (id != null && !id.isEmpty()) {
			Long idLong = Long.valueOf(id);
			dao.deleteById(idLong);
		}

	}

	@Override
	public List<Event> findAllEvents() {
		return dao.findAllEvents();
	}

	@Override
	public List<Event> getEvents(int pageNo, int pagesize) {
		return dao.getEvents(pageNo, pagesize);
	}
	
	

}
