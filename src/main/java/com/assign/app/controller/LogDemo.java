package com.assign.app.controller;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

@Controller
public class LogDemo 
{
	private final static  Logger log= LoggerFactory.getLogger(LogDemo.class);
	
	@PostConstruct
	public void logger()
	{
		String str="Xworkz";
		log.trace("trace");
		log.debug("debug");
		log.info("info");
		log.warn("warn");
		log.error("error");
		log.error(str);
		
	}

}
