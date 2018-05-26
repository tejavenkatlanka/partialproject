package org.mumbai.forsociety.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/test")
public class TestController {

	@RequestMapping(value = { "/li","/sds"}, method = RequestMethod.GET)
	public String listUsers(ModelMap model) {

			return "test";
	}
	
	
}
