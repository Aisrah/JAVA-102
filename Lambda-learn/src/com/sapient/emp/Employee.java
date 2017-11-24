package com.sapient.emp;

import java.time.LocalDate;

public class Employee {

	private String name;
	private LocalDate dob;
	private double salary;
	private Gender gender;
	
	public Employee(String name, LocalDate dob, double salary, Gender gender) {
		super();
		this.name = name;
		this.dob = dob;
		this.salary = salary;
		this.gender = gender;
	}
	
	public Employee() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
	
	
}
