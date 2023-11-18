package com.upskill.java_6;

public class MultiThreading {
	
	/*MultiThreading is a Java feature that allows concurrent executing o two or more parts of program.
	
	Threads can be created by using two mechinis :
		
		1. Extending the Thread class
		2. Implementing the Runnable Interface*/
	
	public static void main(String[] args) {
		int n = 6;
		for (int i = 0; i < n ; i++){
			MultithreadingThread obj= new MultithreadingThread();
			obj.start();
			
			Thread obj2 = new Thread(new MutithreadingRunable());
			obj2.start();
		}
		
	}

}
