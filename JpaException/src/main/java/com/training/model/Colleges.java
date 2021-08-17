package com.training.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="Colleges")
@Entity(name="Colleges")
public class Colleges {
 private String collegeName;
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private int collegeId;
 private String collegeAddress;
 private String collegeDirector;
 private String collegePhoneNumber;
 
 @Column(name = "collegeEmailId") 
 private String collegeEmailId;
public String getCollegeName() {
	return collegeName;
}
public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}
public int getCollegeId() {
	return collegeId;
}
public void setCollegeId(int collegeId) {
	this.collegeId = collegeId;
}
public String getCollegeAddress() {
	return collegeAddress;
}
public void setCollegeAddress(String collegeAddress) {
	this.collegeAddress = collegeAddress;
}
public String getCollegeDirector() {
	return collegeDirector;
}
public void setCollegeDirector(String collegeDirector) {
	this.collegeDirector = collegeDirector;
}
public String getCollegePhoneNumber() {
	return collegePhoneNumber;
}
public void setCollegePhoneNumber(String collegePhoneNumber) {
	this.collegePhoneNumber = collegePhoneNumber;
}
public String getCollegeEmailId() {
	return collegeEmailId;
}
public void setCollegeEmailId(String collegeEmailId) {
	this.collegeEmailId = collegeEmailId;
}
public Colleges(String collegeName, int collegeId, String collegeAddress, String collegeDirector,
		String collegePhoneNumber, String collegeEmailId) {
	super();
	this.collegeName = collegeName;
	this.collegeId = collegeId;
	this.collegeAddress = collegeAddress;
	this.collegeDirector = collegeDirector;
	this.collegePhoneNumber = collegePhoneNumber;
	this.collegeEmailId = collegeEmailId;
}
@Override
public String toString() {
	return "Colleges [collegeName=" + collegeName + ", collegeId=" + collegeId + ", collegeAddress=" + collegeAddress
			+ ", collegeDirector=" + collegeDirector + ", collegePhoneNumber=" + collegePhoneNumber
			+ ", collegeEmailId=" + collegeEmailId + "]";
}
public Colleges() {
	super();
	// TODO Auto-generated constructor stub
}

}
