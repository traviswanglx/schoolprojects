package com.studentmanagementproject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {

	private int id;
	private String nric;
	private String firstName;
	private String lastName;
	private Date dob;
	private boolean gender;
	private Address address;
	private double assignment1Marks;
	private double assignment2Marks;
	private double practicalMarks;
	private double finalExamMarks;
	private double overallMarks;
	private String grade;
	
	public Student() {
		
	}
	
	public Student(int id, String nric, String firstName, String lastName, Date dob, boolean gender, Address address,
			double assignment1Marks, double assignment2Marks, double practicalMarks, double finalExamMarks,
			double overallMarks, String grade) {
		
		this.id = id;
		this.nric = nric;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.assignment1Marks = assignment1Marks;
		this.assignment2Marks = assignment2Marks;
		this.practicalMarks = practicalMarks;
		this.finalExamMarks = finalExamMarks;
		this.overallMarks = overallMarks;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNric() {
		return nric;
	}
	public void setNric(String nric) {
		this.nric = nric;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public double getAssignment1Marks() {
		return assignment1Marks;
	}
	public void setAssignment1Marks(double assignment1Marks) {
		this.assignment1Marks = assignment1Marks;
	}
	public double getAssignment2Marks() {
		return assignment2Marks;
	}
	public void setAssignment2Marks(double assignment2Marks) {
		this.assignment2Marks = assignment2Marks;
	}
	public double getPracticalMarks() {
		return practicalMarks;
	}

	public void setPracticalMarks(double practicalMarks) {
		this.practicalMarks = practicalMarks;
	}

	public double getFinalExamMarks() {
		return finalExamMarks;
	}
	public void setFinalExamMarks(double finalExamMarks) {
		this.finalExamMarks = finalExamMarks;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public double getOverallMarks() {
		return overallMarks;
	}
	public void setOverallMarks(double overallMarks) {
		this.overallMarks = overallMarks;
	}

	@Override
	public String toString() {
		
		String pattern = "dd/MM/yyyy";
		DateFormat df = new SimpleDateFormat(pattern);
		
		String genderStr = gender?"Male":"Female";
		
		String addressStr = address.getBlockNumber() + " " + address.getStreetName() + " " + address.getUnitNumber() + " " + address.getPostalCode();
		
		return "Student [id=" + id + ", nric=" + nric + ", firstName=" + firstName + ", lastName=" + lastName + ", dob="
				+ df.format(dob) + ", gender=" + genderStr + ",\n" + "address=" + addressStr + ", assignment1Marks=" + assignment1Marks
				+ ", assignment2Marks=" + assignment2Marks + ", practicalMarks=" + practicalMarks + ",\n" + "finalExamMarks="
				+ finalExamMarks +", overallMarks=" + overallMarks + ", grade=" + grade + "]" + "\n";
	}


}
