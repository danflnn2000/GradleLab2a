package com.dan.multiThread;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiThreadTest {

	public static void main(String[] args) {
		
		Runnable task2 = () -> {
			try {
				String threadName = Thread.currentThread().getName();
				System.out.println("Foo " + threadName);
				TimeUnit.SECONDS.sleep(2);
				System.out.println("Bar " + threadName);
			} catch (InterruptedException e) {
				System.err.println(e.getLocalizedMessage());
			}
		};
		
		new Thread(task2).start();
		
		ExecutorClass myExec = new ExecutorClass();
		myExec.runMyExec();
		
	}
	



}
