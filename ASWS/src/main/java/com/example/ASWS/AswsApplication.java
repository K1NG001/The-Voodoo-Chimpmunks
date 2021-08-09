package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// Customer Class
@Entity
class Customer {
	// Attributes of class fields (Parameters) are declared.
	private String companyName;
	private String address;
	private String country;
  
	// Default Constructor
	Customer() {}
  
	// Parameterized Constructor
	Customer(String companyName, String address, String country) {
		this.companyName = companyName;
		this.address = address;
		this.country = country;
	}
  
	// Accessor Methods
  
	public String getCompanyName() {
		return this.companyName;
	}
  
	public String getAddress() {
		return this.address;
	}
  
	public String getCountry() {
		return this.country;
	}
  
	// Mutator Methods
  
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
  
	public void setAddress(String address) {
		this.address = address;
	}
  
	public void setCountry(String country) {
	 	this.country = country;
	}
	
    // Override Methods
	
    @Override
    public java.lang.String toString() {
        return "Customer{" +
                "company name=" + companyName +
                ", address='" + address + '\'' +
                ", country=" + country +
                '}';
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), companyName, address, country);
    }
}

@SpringBootApplication
class FatApplication {
	public static void main(String[] args) {
		SpringApplication.run(FatApplication.class, args);
		
		// Import New Scanner Object.
		Scanner input = new Scanner(System.in);
		
		// Declaring attributes for storing the customer. 
		String companyName, address, country;
		
		// Create Customers
		// Display message asking to enter the personal details of the customer.
		System.out.println("\nEnter the following details to create customer.");
		
		// Display message for user to enter the customer company name. 
		System.out.print("Please input customers company name: ");
		companyName = input.nextLine();
		// No input from user.
		if(companyName.equals("")) {
			throw new InputMismatchException("Customers company name is not inputtted.");
        	}
		
		// Display message for user to enter the customer company name. 
		System.out.print("Please input customers address: ");
		address = input.nextLine();
		// No input from user.
		if(companyName.equals("")) {
			throw new InputMismatchException("Customers address is not inputtted.");
        	}
		
		// Display message for user to enter the customer company name. 
		System.out.print("Please input customers country: ");
		country = input.nextLine();
		// No input from user.
		if(companyName.equals("")) {
			throw new InputMismatchException("Customers country is not inputtted.");
        	}
		
		// Create customer object of the Customer class to store the information of the Customer.
		Customer customer = new Customer(companyName, address, country);
		
		// Update Customer
		
		// Create boolean object to see if they would like to update the customers details (set false as default).
		boolean updateCustomer = false;
		
		// Display message asking if they would like to update the personal details of the customer.
		System.out.println("\nWould you like to update the personal details of the customer?");
		if (updateCustomer == true) {
			System.out.println("\nSelect one of the following fields to update (Select 4 to exit when completed): " + "\n"
					          + "1. Company Name" + "\n" + "2. Address" + "\n" + "3. Country" + "\n" + "4. Exit");
			int fieldSelected = input.nextInt();
			switch(fieldSelected) {
				case 1:
					System.out.print("Please input customers company name: ");
					companyName = input.nextLine();
					// No input from user.
					if(companyName.equals("")) {
						throw new InputMismatchException("Customers company name is not inputtted.");
			        	}
					break;
				case 2:
					// Display message for user to enter the customer company name. 
					System.out.print("Please input customers address: ");
					address = input.nextLine();
					// No input from user.
					if(companyName.equals("")) {
						throw new InputMismatchException("Customers address is not inputtted.");
			        	}
					break;
				case 3:
					// Display message for user to enter the customer company name. 
					System.out.print("Please input customers country: ");
					country = input.nextLine();
					// No input from user.
					if(companyName.equals("")) {
						throw new InputMismatchException("Customers country is not inputtted.");
			        	}
					break;
				case 4:
					System.exit(0);
			}
		}
		// Close Scanner
		input.close();
	}
}
