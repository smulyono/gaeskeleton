package me.smulyono.gaespringrest;

import java.util.Date;

import me.smulyono.gaespringrest.model.Message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value="/restservice")
public class RestController {
	static Logger log = LoggerFactory.getLogger(RestController.class);
	
	
	@RequestMapping(value="/{name}", method=RequestMethod.GET)
	@ResponseBody
	public Message sayhello(@PathVariable String name){
		log.debug(">>> come back to rest service controller <<<");
		
		Message retval = new Message();
		retval.content = name;
		retval.date = new Date();
		
		return retval;
	}
}
