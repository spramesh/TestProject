package com.concurrent.lock;

public class ReentrantDemo  {

	public static void main(String[] args) {
		MyThread3 t1=new MyThread3("first");
		MyThread3 t2=new MyThread3("second");
		
		t2.start();
		t1.start();
	}
}
