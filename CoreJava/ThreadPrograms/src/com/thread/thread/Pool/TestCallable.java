package com.thread.thread.Pool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.thread.threadPool.MyCallable;

public class TestCallable {
public static void main(String[] args) throws InterruptedException, ExecutionException {
	MyCallable[] mc={new MyCallable(10),new MyCallable(20),new MyCallable(30)
	};
	ExecutorService service =Executors.newFixedThreadPool(2);
	for(MyCallable t:mc){
		Future fu=service.submit(t);
		System.out.println(fu.get());
	}
}
}
