package com.upskill.java_6;

public class Singleton {
	
	//Singleton is class that can have only one object
	
	// Private constructor, it prevents any other class from instantiating
	private Singleton(){
		
	}
	
	//private static object of the class
	private static Singleton SingletonObj = new Singleton();

	public static Singleton getInstance() {
		return SingletonObj;
	}
	
	protected static void demo1(){
		System.out.println("Demo I method for singleton class");
	}
	
	protected static void demo2(){
		System.out.println("Demo II method for singleton class");
	}
	
	protected static void demo3(){
		System.out.println("Demo III method for singleton class");
	}
	
	

	
	
	

}
