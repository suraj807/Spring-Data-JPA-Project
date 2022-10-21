package com.biryaniwala.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.biryaniwala.model.biryani;
import com.biryaniwala.repository.biryanirepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class biryaniService {
	
	
	
	@Autowired
	private biryanirepository biryanirepo;
	
	//adding biryani
	public String addBiryani(biryani b1) {
		
		biryanirepo.save(b1);
		return "Biryani added";
		
	}
	
	//adding list of  biryanis
	public String addAllBiryani(List<biryani> blist) {
		biryanirepo.saveAll(blist);
		
		return "All biryanis added successfully";
	}
	
	//retriving all biryani
	public List<biryani> getAllBiryani(){
		
		List<biryani> allbiryani=new ArrayList<>();		
		
		biryanirepo.findAll().forEach(allbiryani::add);
		return allbiryani;
		
	}
	//retrive biryani by id
	public Optional<biryani> getBiryaniById(int id) {
		return biryanirepo.findById(id);
	}
	//retrive biryani by type
	public List<biryani> getBiryaniByType(String btype){
		
		return biryanirepo.findByBiryaniType(btype);
		
	}
	//retrive biryani within range
	public List<biryani> getBiryaniByRange(int bprice){
		return biryanirepo.findByBiryaniPrice(bprice);
	}

}
