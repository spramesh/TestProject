package com.thread.threadPool;

public class PrintThread  implements Runnable{
    String name;
	public PrintThread(String name) {
		super();
		this.name=name;
	}
	public void run(){
		try{
		System.out.println(name +"thread name performace : "+Thread.currentThread().getName());
		Thread.sleep(5000);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
