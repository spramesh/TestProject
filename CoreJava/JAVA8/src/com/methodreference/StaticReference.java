package com.methodreference;

public class StaticReference {

	public static void sayHello(){
		System.out.println("hello");
	}
	
	public StaticReference() {
		System.out.println("sayConstructor");
	}
	
	public void nonStatic(){
		System.out.println("non static");
	}
	
	public int sum(int a , int b){
		return a+b;
	}
	
}
