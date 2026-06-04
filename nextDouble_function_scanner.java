package com.scannerclass;

import java.util.Scanner;

public class nextDouble_function_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner input = new Scanner(System.in);
			System.out.print("Enter your salary: ");
			double value = input.nextDouble();
			System.out.println("Salary is: "+value);
			
			input.close();

	}

}
