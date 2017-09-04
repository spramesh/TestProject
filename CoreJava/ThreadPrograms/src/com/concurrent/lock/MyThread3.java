package com.concurrent.lock;

import java.util.concurrent.locks.ReentrantLock;

public class MyThread3 extends Thread {

	static ReentrantLock rt=new ReentrantLock();
	public MyThread3(String name) {
		// TODO Auto-generated csuponstructor stub
		super(name);
	}
	public void run(){
		if(rt.tryLock()){
			System.out.println("get the lock :"+Thread.currentThread().getName());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			System.out.println("not get the lock : "+Thread.currentThread().getName());
		}
	}
}
