package com.dan.multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorClass {
	
	public void runMyExec() {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		Future<?> futureTask = executor.submit(() -> {
		    String threadName = Thread.currentThread().getName();
		    System.out.println("Hello from myExecutor: " + threadName);
		});
	}

	
}
