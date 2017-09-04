package com.methodreference;



public class TestMethodReference{

	public static void main(String[] args) {
		// lambda Expression using
		
		FuncationalIn lambda=()->System.out.println("hello");
		lambda.sayHi();
		
		// using static metho reference
		
		FuncationalIn rst=StaticReference::sayHello;
		rst.sayHi();
		
		// method referece using non static methods
		StaticReference nonstatic=new StaticReference();
		FuncationalIn fms= nonstatic::nonStatic;
		fms.sayHi();
		
		
// reference to Constructor
		FuncationalIn consr=StaticReference::new;
		consr.sayHi();
		
		
		
		
	}
	
}