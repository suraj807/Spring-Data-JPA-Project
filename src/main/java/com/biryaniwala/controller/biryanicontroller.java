package com.biryaniwala.controller;

import java.util.List;
import java.util.Optional;

import com.biryaniwala.model.biryani;
import com.biryaniwala.service.biryaniService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class biryanicontroller {
	
	
	@Autowired
	private biryaniService service;
	
	//add one biryani to DB
	@RequestMapping(method=RequestMethod.POST, value="/biryani")
	public String addBiryani(@RequestBody biryani b1) {
		return service.addBiryani(b1);
	}
	//add multiple biryanis to DB
	@RequestMapping(method=RequestMethod.POST, value="/biryani/addall")
	
	public String addAllBiryani(@RequestBody List<biryani> b1) {
		return service.addAllBiryani(b1);
	}
	//to retrive all biryanis
	@RequestMapping(method=RequestMethod.GET, value="/biryani/")
	public List<biryani> getAllBiryani(){
		return service.getAllBiryani();
	}
	//to retrive biryani with Id
	@RequestMapping(method=RequestMethod.GET, value="/biryani/id/{id}")
	public Optional<biryani> getBiryaniById(@PathVariable int id) {
		return service.getBiryaniById(id);
	}
	//to retrive biryanis with type
	@RequestMapping(method=RequestMethod.GET, value="/biryani/type/{btype}")
	public List<biryani> getBiryaniByType(@PathVariable String btype){
		return service.getBiryaniByType(btype);
	}
	//to retrive biryanis in range
	@RequestMapping(method=RequestMethod.GET, value="/biryani/range/{bprice}")
	public List<biryani> getBiryaniByRange(@PathVariable int bprice){
	
		return service.getBiryaniByRange(bprice);
	}

}
