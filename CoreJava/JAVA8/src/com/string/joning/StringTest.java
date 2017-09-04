package com.string.joning;

import java.util.StringJoiner;

public class StringTest {

	public static void main(String[] args) {
		StringJoiner sj= new StringJoiner(",");
		sj.add("Ramesh");
		sj.add("ravi");
		sj.add("vijay");
		System.out.println(sj);
		
		StringJoiner kmr=new StringJoiner("," , "[" ,"}");
		kmr.add("Ramesh");
		kmr.add("ravi");
		kmr.add("vijay");
		System.out.println(kmr);
		
		StringJoiner final1=sj.merge(kmr);
		System.out.println(final1);
		
	}
	
}
