package com.coding;

public  class SingleTon {

	private static SingleTon ramesh;
	private SingleTon(){
		
	}
	
	public static SingleTon getInstace(){
		if(null==ramesh){
			synchronized (SingleTon.class) {
				
				if(null==ramesh){//double checking locking
				ramesh= new SingleTon();
				}
			}
			
		}
		return ramesh;
		
	}
	
}
