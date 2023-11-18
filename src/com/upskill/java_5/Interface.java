package com.upskill.java_5;

public interface Interface {
	
	//Interface can have only abstract methods, Java 8
	//Abstract method does not have any implementation
	//Abstraction is OOPS concept of hiding implementation

	public abstract void iDoor();

	public abstract String iEngine();
	
	public abstract int iWheel();
	
	public abstract void iColor();
	
	
	/*
    (Parent)				   (Keyword) 				(Child)				 (Keyword) 				(GrandChild)
    						
	Class						extends					 Class		 
	Abstract Class (+2)  		extends					 Class (-2=0)
	Interface (+2)			  Implements				 Class (-2=0)
	Interface (+2)				 extends				Interface (+2+2=+4)    implements				Class(-4=0)
	Interface				  Implements				Abstract Class			
	Abstract Class			     extends				 Interface				implements				Class(-4 = 0)

*/

}
