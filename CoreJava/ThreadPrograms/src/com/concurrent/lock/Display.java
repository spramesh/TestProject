package com.concurrent.lock;

import java.util.concurrent.locks.ReentrantLock;

public class Display {
//synchronized
	ReentrantLock l= new ReentrantLock();
	public   void wishGood(String name){
		try{
			
			l.lock();
		for(int i=0;i<10;i++){
			System.out.println("Good Morning : "+name);
			Thread.sleep(1000);
		}
		l.unlock();
		}catch(Exception e){
			
		}
	}
}
