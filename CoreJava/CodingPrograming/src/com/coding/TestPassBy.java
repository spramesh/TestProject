package com.coding;

import java.util.ArrayList;

public class TestPassBy {

	  void m(ArrayList<String> m ,int ram){
		m.add("Varma");
		  m=null;
		  ram=9;
	}
	public static void main(String[] args) {
		ArrayList<String> k=new ArrayList<String>();
		k.add("Ramesh");
		System.out.println(k);
		int krg=10;
		System.out.println("before : "+krg);
		new TestPassBy().m(k,krg);
		System.out.println(k);
		System.out.println("after : "+krg);
	}
	
	
}
