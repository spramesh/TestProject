package com.optional;

import java.util.Optional;

public class OptionalClass {

	
	
	
	public static void main(String[] args) {
	
		String te="Ramesh";
		Optional optional=Optional.ofNullable(te);
		
		System.out.println(optional.isPresent());
		if(optional.isPresent()){
			System.out.println("value is printed");
		}
		
		// Using lambda Expression
		optional.ifPresent(System.out::println);
		
		String[] str={"a","b","c"};
		Optional arrayOp=Optional.empty();

	Optional kk	=Optional.ofNullable(str[2]);
	
	if(kk.isPresent()){
		System.out.println("kk value is there");
	}
	System.out.println(kk.orElse("value is not there"));
		
		
		
	}
	
	
}
