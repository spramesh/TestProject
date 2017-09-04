package com.lambda.example;

public class LambdaThread {

	
	public static void main(String[] args) {
		Runnable rs=()->{
			for (int i = 0; i < 20; i++) {
				System.out.println(i);
			}
		};
		Thread thread= new Thread(rs);
		thread.start();
	}
}
