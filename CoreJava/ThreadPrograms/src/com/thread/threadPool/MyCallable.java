package com.thread.threadPool;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
int name;
public MyCallable(int name){
	this.name=name;
}
	
	public Object call() throws Exception{
		System.out.println(name+Thread.currentThread().getName());
		
		return name+10;
	}
}
