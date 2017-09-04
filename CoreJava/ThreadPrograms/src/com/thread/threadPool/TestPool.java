package com.thread.threadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestPool {
public static void main(String[] args) {
	PrintThread[] jobs={new PrintThread("Ramesh"),
			new PrintThread("divya"),
			new PrintThread("kiran"),
			new PrintThread("java"),
			new PrintThread("Thread"),
			new PrintThread("varma")};
	ExecutorService service=Executors.newFixedThreadPool(2);
	for(PrintThread t:jobs){
		service.submit(t);
	}
	service.shutdown();
	}

}
