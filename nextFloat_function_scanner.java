package com.scannerclass;

import java.util.Scanner;

public class nextFloat_function_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter percentage: ");
		float value = input.nextFloat();
		System.out.println("Percentage is: "+value);
		
		input.close();
	}

}
