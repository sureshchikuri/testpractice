package com.vcs.java.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//sorting object array
		/*Employee[] empArr = new Employee[4];
		empArr[0] = new Employee(10, "Mikey", 25, 10000);
		empArr[1] = new Employee(20, "Arun", 29, 20000);
		empArr[2] = new Employee(5, "Lisa", 35, 5000);
		empArr[3] = new Employee(1, "Pankaj", 32, 50000);*/

		//sorting employees array using Comparable interface implementation
		//Arrays.sort(empArr,Employee.nameCompare);
		//System.out.println("Default Sorting of Employees list:\n"+Arrays.toString(empArr));
		
		/*List<Employee> employee=Arrays.asList(new Employee(10, "Mikey", 25, 10000),new Employee(20, "Arun", 29, 20000),new Employee(5, "Lisa", 35, 5000));
		
		IntSummaryStatistics ageSummary= employee.stream().collect(Collectors.summarizingInt(e->e.getSalary()));
		System.out.println(ageSummary);*/
		
		
		/////////////////////////
		
		//Student
		
		List  st=new ArrayList<Student>();
	
		st.add(new Student(1,"sri",5000));
		st.add(new Student(4,"kiri",2000));
		st.add(new Student(3,"raj",1000));
		st.add(new Student(2,"mani",4000));
		
		 //Arrays.sor
		//System.out.println(Arrays.toString(st));
		//Collections.sort(st);
		//System.out.println(st);
		
		//st.stream().filter((i1.get,i2)->(i1)
				
		

	}

}
