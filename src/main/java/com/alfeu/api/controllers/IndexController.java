package com.alfeu.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String index() {
		return "Endpoint Inicial";
	}
	
}