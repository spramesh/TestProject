package com.concurrent.lock;

public class DemoSynchronied {
public static void main(String[] args) {
	Display d= new Display();
	//String name="dhone";
	MyThread mt=new MyThread(d, "Ramesh");
	MyThread mt2=new MyThread(d, "divya");
	mt.start();
	try {
		//mt.join();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	mt2.start();
}
}
