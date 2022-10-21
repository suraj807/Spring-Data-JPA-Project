package com.biryaniwala.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import org.springframework.stereotype.Component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
@Component
public class biryaniaspect {

private static final Logger log=LoggerFactory.getLogger(biryaniaspect.class);
	
	@Before("execution (public * com.biryaniwala.controller.biryanicontroller.getAllBiryani())")
	public void logbeforebiryani() {
		log.info("biryani is adding");
	
	}
	@After("execution (public * com.biryaniwala.controller.biryanicontroller.getAllBiryani())")
	public void logafterbiryani() {
		log.info("biryani added");
	}
	
	
}
