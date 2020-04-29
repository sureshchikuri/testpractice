package com.vcs.java.filterstream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FilterStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers= new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		
		//Stream<Integer> i=numbers.stream().filter(n -> n%2==0);
		//numbers.stream().filter(n -> n%2==0).limit(2).forEach(System.out::println);;
		
		//System.out.println(i);
		
		/*StringBuffer sb1= new StringBuffer("abc");//
		StringBuffer sb2= new StringBuffer("abc");
		
		System.out.println(sb1.toString().equals(sb2.toString()));
		System.out.println(sb1.toString()==sb2.toString());
		
		int[] i= {1,2,3,4,5};
		
		IntStream stream= Arrays.stream(i);
		stream=stream.limit(3);
		System.out.println(stream.sum());*/
		
		
		/*IntStream.builder().add(1)
		.add(2)
		.add(3)
		.add(4)
		.build()
		.average()
		.ifPresent(System.out::println);
		
		//IntStream.range(0, 100).average().ifPresent(System.out::println);*/
		
			//IntStream.generate(()->2).limit(4).forEach(System.out::println);
		
		/*SecureRandom secureRandom = new SecureRandom(new byte[]{1, 3, 3, 7});
		int[] list=IntStream.generate(secureRandom::nextInt)
				.filter(n->n>0).limit(5).toArray();*/
		
	/*	List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(3);
		list.add(5);
		
	list.stream().filter(i->i>3).forEach(System.out::println);
	
	list.stream().sorted().forEach(System.out::println);*/
		
		/*
		int i1 =list.stream().filter(n->n>3 & n%2==0).mapToInt(i->i*i).findFirst().getAsInt();
		System.out.println(i1);
		
		list.stream().filter(n->n>3 & n%2==0).mapToInt(i->i*i).forEach(System.out::println);
		
		*/
		
		
		/*List<Employee> employee= Arrays.asList(new Employee(11,"sri",21,10000),
												new Employee(11,"sri",21,10000),
												new Employee(11,"sri",21,10000),
												new Employee(11,"sri",21,10000) );
		
		int avgSalary= employee.stream().mapToInt(Employee::getSalary).sum();
		
				System.out.println(avgSalary);*/
		
		//String input = "A";
		
		//int result= input.chars().map(ch->Character.valueOf((char)ch)).sum();
		//System.out.println(result);
		
		//int i=(char)'c';
		//System.out.println(i);
		
		//char c=(int)99;
		//System.out.println("value"+c);
		
		//IntStream.generate(()->2).limit(10).forEach(System.out::println);
		//IntStream.range(1, 15).forEach(System.out::println);
		
		IntStream.range(1, 15).filter(i->i>10).forEach(System.out::println);
		
		
		
	}

}
