package com.stream;

import java.util.ArrayList;

public class Stream8 {

	
	public ArrayList<Employee> getEmployee(){
	
    ArrayList<Employee> alr= new ArrayList<Employee>();
	alr.add(new Employee(5000, "Ramesh", 50));
	alr.add(new Employee(2000, "Ramu", 80));
	alr.add(new Employee(100, "empty", 10));
	 return alr;
	}
	
	public static void main(String[] args) {
		Stream8 rs8= new Stream8();
		  rs8.getEmployee().stream().filter(ra->ra.getEno()>1000).forEach(ra->{
			  System.out.println(ra.getEno());
		  });;
	}
	
	
	
	
}
