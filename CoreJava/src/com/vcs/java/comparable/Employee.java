package com.vcs.java.comparable;

import java.util.Comparator;

public class Employee {

	private int id;
	private String name;
	private int age;
	private int salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getSalary() {
		return salary;
	}

	public Employee(int id, String name, int age, int salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	/*
	 * @Override public int compareTo(Employee emp) { //let's sort the employee
	 * based on an id in ascending order //returns a negative integer, zero, or a
	 * positive integer as this employee id //is less than, equal to, or greater
	 * than the specified object. return (this.id - emp.id); }
	 */
	@Override
	// this is required to print the user-friendly information about the Employee
	public String toString() {
		return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" + this.salary + "]";
	}

	public static Comparator<Employee> nameCompare = new Comparator<Employee>() {

		public int compare(Employee e1, Employee e2) {
			return (e1.getName().compareTo(e2.getName()));
		};
	};
	
	public static Comparator<Employee> SalaryCompare = new Comparator<Employee>() {

		public int compare(Employee e1, Employee e2) {
			return (int) (e1.getSalary()-e2.getSalary());
		};
	};

}
