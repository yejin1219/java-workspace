package com.kh.polymorphism.model.parent;

public class Employee {

	private String name;
	private int salary; //급여 
	
	
	public Employee() {
	}
	
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
