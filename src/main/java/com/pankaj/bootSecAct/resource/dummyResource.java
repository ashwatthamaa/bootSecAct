package com.pankaj.bootSecAct.resource;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dummyResource {

	@RequestMapping(value="", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> welcome(HttpServletRequest httpServletRequest) {
		return new ResponseEntity<String>("welcome", HttpStatus.OK);
	}
	
	@RequestMapping(value="post", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> welcomePost(HttpServletRequest httpServletRequest) {
		return new ResponseEntity<String>("welcome post", HttpStatus.CREATED);
	}
}
