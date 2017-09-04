package com.lambda.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaTest {

	public static void main(String[] args) {
      
		SingleParameter sp=(name)-> {
			System.out.println("welcome to java 8 "+name);
		};
		sp.sayHello("Ramesh");
		
	// return values
		ReturnLambda rs=(a, b)->(a+b);
		
		// iteration logic
		ArrayList<Product> li=new ArrayList<Product>();
		li.add(new Product(20, "kiran"));
		li.add(new Product(40, "aaa"));
		li.add(new Product(80, "varma"));
		//li.forEach(p->System.out.println(p.getSname()));
		
		// comparator example
		
		// compare for Name
		Comparator<Product> pk= new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				return o1.getSname().compareTo(o2.getSname());
			}
		};
		Collections.sort(li,pk);
		li.forEach(product->System.out.println(product.getSname()));
		//Collections.sort(li,pk);
		
		// compare for Number
		Collections.sort(li, new Comparator<Product>() {
		   public int compare(Product o1, Product o2) {
			   if(o1.getSno()>o2.getSno()){
				   return 1;
			   }else{
				   return -1;
			   }
			   
		   };
		});
		li.forEach(pro->System.out.println(pro.getSno()));
	}
	Runnable rs= ()->{
		for(int i=0;i<10;i++){
			System.out.println(i);
		}
	};
Thread tdr=new Thread(rs);
	
	
	
	
}
