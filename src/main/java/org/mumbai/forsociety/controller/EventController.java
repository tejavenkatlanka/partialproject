package org.mumbai.forsociety.controller;

import org.mumbai.forsociety.entity.Event;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EventController {
	@RequestMapping(value = { "/addevent" }, method = {RequestMethod.GET})
	public String addEvent(final Event event) {

		return "addevent";
	}

	@RequestMapping(value = "/addevent", method = {RequestMethod.POST})
	public String addEvents() {

		return "addevent";
	}

}
