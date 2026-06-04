package com.scannerclass;

import java.util.Scanner;

public class nextBoolean_function_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Are you a Student(true/false): ");
		boolean value = input.nextBoolean();
		System.out.println("Your answer: "+value);
		
		input.close();

	}

}
