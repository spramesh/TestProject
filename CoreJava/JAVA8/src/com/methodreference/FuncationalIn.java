package com.methodreference;

import javax.management.NotificationFilter;

@FunctionalInterface
public interface FuncationalIn  {
void sayHi();

default String defaultMethod(){
	System.out.println("defualt");
	return "default";
}

public  static  void saticMethod(){
	System.out.println("i am static in interface");
}


public int hashCode();
public String toString();

 
public  int k=80;


}
