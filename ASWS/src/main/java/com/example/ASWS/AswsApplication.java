package com.example.ASWS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* ADDED CUSTOMER AND CONTACT CLASS (GEORGE) */

// Customer Class
class Customer {
	// Attributes of class fields (Parameters) are declared.
	private String companyName;
	private char address;
	private String country;
  
	// Default Constructor
	Customer() {}
  
	// Parameterized Constructor
	Customer(String companyName, char address, String country) {
		this.companyName = companyName;
		this.address = address;
		this.country = country;
	}
  
	// Accessor Methods
  
	public String getCompanyName() {
		return this.companyName;
	}
  
	public char getAddress() {
		return this.address;
	}
  
	public String getCountry() {
		return this.country;
	}
  
	// Mutator Methods
  
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
  
	public void setAddress(char address) {
		this.address = address;
	}
  
	public void setCountry(String country) {
	 	this.country = country;
	}
}
  
// Contact Class
class Contact {
	// Attributes of class fields (Parameters) are declared.
	private String name;
	private int phone;
	private char email;
	private String position;
	  
	// Default Constructor
	Contact() {}
	  
	// Parameterized Constructor
	Contact(String name, int phone, char email, String position) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.position = position;
	}
	  
	// Accessor Methods
	
	public String getName() {
		return this.name;
	}
	  
	public int getPhone() {
		return this.phone;
	}
	  
	public char getEmail() {
		return this.email;
	}
	  
	public String getPosition() {
		return this.position;
	}
	  
	// Mutator Methods
	  
	public void setName(String name) {
		this.name = name;
	}
	  
	public void setPhone(int phone) {
		this.phone = phone;
	}
	  
	public void setEmail(char email) {
		this.email = email;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
}


















@SpringBootApplication
public class AswsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AswsApplication.class, args);
	}

}
