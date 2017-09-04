package com.stream;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.lambda.example.Product;

public class Collectors12 {

	public static void main(String[] args) {   
		ArrayList<Product> li=new  ArrayList<Product>();
	    li.add(new Product(50, "kiran"));
	    li.add(new Product(2, "varma"));
	    li.add(new Product(5, "vijay"));
	   
	    li.forEach(kk->kk.getSno());
	  double totall=  li.stream().collect(Collectors.summingDouble(kk->kk.getSno()));
	  System.out.println(totall);
	  
	  li.forEach(pp-> {
           System.out.println(Collections.frequency(li, "kiran"));
	  });
	  
	 Set<String> pr =  li.stream().map(p->p.getSname()).collect(Collectors.toSet());
	 //System.out.println(Collections.frequency(pr, "kiran"));
	 
	 for(String str :pr ){
		 System.out.println(Collections.frequency(pr, str));
	 }
	 
	 
	Map<String,List<Product>> result=li.stream().collect(Collectors.groupingBy(Product::getSname));
	System.out.println("---  : "+result);
	 
	 
	 
	 /*pr.forEach(dup->{
		 System.out.println(Collections.frequency(pr, dup.));
	 });*/
	  
	  //System.out.println(Collections.frequency(li, ));
	    
	    
	 //   li.stream().collect(Collectors.summingDouble(pr->pr.hashCode()));
	    
	    
	    
	    
	}
	
}
