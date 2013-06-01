package me.smulyono.gaeskeleton.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class PageController {
	static Logger log = LoggerFactory.getLogger(PageController.class);
	
	
	@RequestMapping(method=RequestMethod.GET)
	public String home(ModelMap model){
		log.debug(">>> Home controller <<");
		return "index";
	}
}
