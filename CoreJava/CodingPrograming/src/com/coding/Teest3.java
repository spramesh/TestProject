package com.coding;

public class Teest3 {
  int m;
	void M2(int m){
		m=8;
	}
	
	public static void main(String[] args) {
		Teest3 t= new Teest3();
		t.m=10;
		System.out.println(t.m);
		new Teest3().M2(8);
		System.out.println(t.m);
			
		
	}
}
