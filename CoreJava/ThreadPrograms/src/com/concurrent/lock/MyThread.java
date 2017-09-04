package com.concurrent.lock;

public class MyThread  extends Thread{

	private String name;
	Display d;
	public MyThread(Display d,String name) {
		// TODO Auto-generated constructor stub
		this.d=d;
		this.name=name;
	}
	public void run(){
		d.wishGood(name);
	}
}
