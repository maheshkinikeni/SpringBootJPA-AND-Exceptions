package com.training.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.customException.InvalidMailId;
import com.training.customException.PhoneNumberException;
import com.training.model.Colleges;
import com.training.service.CollegeService;

import com.training.customException.InvalidMailId;
import com.training.customException.PhoneNumberException;
import com.training.model.Colleges;
import com.training.service.CollegeService;


@RestController
public class Controller {

	@Autowired
	CollegeService collegeService;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String display() {
		return "Hi...from springboot";

	}

	@RequestMapping(value = "/hi/{name}", method = RequestMethod.GET)
	public String show(@PathVariable String name) {
		return "Hi ..." + name;
	}

	@RequestMapping(value = "/colleges", method = RequestMethod.POST)	
	public Colleges save(@RequestBody Colleges colleges) throws PhoneNumberException {
		 String collegePhoneNumber = colleges.getCollegePhoneNumber();
		 
		 if(collegePhoneNumber.length()<11)
			 
		 {
			throw new PhoneNumberException();
		 }
		
		return collegeService.save(colleges);

	}

	@RequestMapping(value = "/colleges", method = RequestMethod.GET)
	public List<Colleges> getAllColleges() {

		return collegeService.getAllColleges();

	}

	@RequestMapping(value = "colleges/name/{name}", method = RequestMethod.GET)
	public List<Colleges> getAllCollegeNames(@PathVariable("name") String collegeName) {
		return collegeService.getAllCollegeName(collegeName);

	}

	@RequestMapping(value = "colleges/emaild/{email}", method = RequestMethod.GET)
	public List<Colleges> getAllCollegeEmailId(@PathVariable("email") String collegeEmailId) throws InvalidMailId {
		
		List<Colleges> collageList = collegeService.getAllCollegeEmailId(collegeEmailId);
		Iterator<Colleges> iterator = collageList.iterator();
		while (iterator.hasNext()) {
			Colleges clg = iterator.next();
			if (!(clg.getCollegeEmailId().contains("@gmail.com"))) {
				throw new InvalidMailId();
			}

		}

		return collageList;

	}

	@RequestMapping(value = ("colleges/director/{dir}"), method = RequestMethod.GET)
	public List<Colleges> getByDirector(@PathVariable("dir") String collegeDirector) {
		return collegeService.getByDirector(collegeDirector);

	}

	@RequestMapping(value = ("colleges/{collegeId}"), method = RequestMethod.GET)
	public List<Colleges> getByLessthanIds(@PathVariable("collegeId") int collegeId) {
		return collegeService.getLessThanIds(collegeId);

	}
}
