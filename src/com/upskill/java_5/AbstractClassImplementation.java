package com.upskill.java_5;

public class AbstractClassImplementation extends AbstractClass {

	public static void main(String[] args) {

		AbstractClassImplementation obj = new AbstractClassImplementation();

		obj.iDoor();
		obj.iColor();
		obj.iEngine();
		obj.iWheel();
	}

	@Override
	public void iDoor() {
		System.out.println("My Car has 4 door");

	}

	@Override
	public String iEngine() {
		System.out.println("My car has duel motor engine");
		return "Duel Motor";
	}

	@Override
	public int iWheel() {
		System.out.println("My car has 4 Wheel");
		return 4;
	}

	@Override
	public void iColor() {
		System.out.println("My Car is Red");

	}

}
