package com.DecisionMakingStatements;

public class Nested_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address = "India,India";
		
		if (address.endsWith("India")) {
			
			if(address.contains("Meerut")) {
				
				System.out.println("Your city is Meerut");	
			}
			else if (address.contains("Noida"))
			{
		System.out.println("Your city is Noida");
		 }
		else {
        System.out.println("City not found");
		}

		} else {
		System.out.println("You are not from India");
	      }
		}

	}

