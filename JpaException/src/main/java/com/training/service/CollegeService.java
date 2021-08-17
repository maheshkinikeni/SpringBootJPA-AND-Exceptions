package com.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.model.Colleges;
import com.training.repository.CollegeRepository;



@Service
public class CollegeService {
	
	@Autowired
	CollegeRepository collegeRepository;
	
	public Colleges save(Colleges colleges) {
		return collegeRepository.save(colleges);
		
	}
	public List<Colleges> getAllColleges(){
		return (List<Colleges>) collegeRepository.findAll();

	
	}
	public List<Colleges> getAllCollegeName(String collegeName){
		return (List<Colleges>) collegeRepository.findByCollegeName(collegeName);
		
	}
	public List<Colleges> getAllCollegeEmailId(String collegeEmailId){
		return (List<Colleges>) collegeRepository.findByCollegeEmailId(collegeEmailId);
	}
		public List<Colleges> getByDirector(String collegeDirector){
			return (List<Colleges>) collegeRepository.findByCollegeDirector(collegeDirector);
			
		}
		public List<Colleges>getLessThanIds(int collegeId){
			return (List<Colleges>)collegeRepository.findByCollegeIdLessThan(collegeId);
			
		}
	}
	
	


