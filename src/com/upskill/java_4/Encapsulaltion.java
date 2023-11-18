package com.upskill.java_4;

public class Encapsulaltion {

	// Encapsulation used to hide the data using setter and getter method.

	private String name = "UpSkill";
	private int ssn = 456845;
	private String username = "Anunoy019" ;

	// Setter Method - name 				// set the date
	public void setName(String value) {
		name = value;
	}

	// Getter Method - name
	public String getName() { 				// get the data
		return name;
	}

	// SSN only can set or input data

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	
	// user name can only get, Read only 
	
	public String getUsername() {
		return username;
	}

	

	public static void main(String[] args) {
		Encapsulaltion obj = new Encapsulaltion();

		obj.setName("Rasel");
		obj.setSsn(45657647);
		
		
		System.out.println(obj.getName());
		System.out.println(obj.getUsername());
	}
	

}
