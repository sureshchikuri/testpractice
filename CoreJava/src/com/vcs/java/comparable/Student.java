package com.vcs.java.comparable;

public class Student implements Comparable<Student>{

	 int id;
	
	 String name;
	
	 int fees;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getFees() {
		return fees;
	}




	public void setFees(int fees) {
		this.fees = fees;
	}




	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
		return (this.getFees()-o.getFees());
	}




	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fees=" + fees + "]";
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fees;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}




	public Student(int id, String name, int fees) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (fees != other.fees)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

	
}
