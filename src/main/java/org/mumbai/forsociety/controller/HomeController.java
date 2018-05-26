package org.mumbai.forsociety.controller;

import org.mumbai.forsociety.dao.EventDaoImpl;
import org.mumbai.forsociety.entity.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
@Transactional
public class HomeController {

	@Autowired()
	EventDaoImpl ao;
	
	@RequestMapping(value = { "/home" }, method = RequestMethod.GET)
	public String getHome() {
		Event  event =new Event();
		event.setDescription("asdfa");
		ao.save(event);
		ao.findAllEvents();
		System.out.println("home");
		return "test";
	}

}
