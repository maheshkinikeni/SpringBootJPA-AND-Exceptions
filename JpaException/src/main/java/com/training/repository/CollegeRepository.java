package com.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.model.Colleges;



@Repository
public interface CollegeRepository extends JpaRepository<Colleges, Integer>{
	
	List<Colleges>findByCollegeName(String collegeName);
	
	List<Colleges>findByCollegeEmailId(String collegeEmailId);
	
	List<Colleges>findByCollegeDirector(String collegeDirector);
	
	List<Colleges>findByCollegeIdLessThan(int collegeId);

}
