package com.scannerclass;

import java.util.Scanner;

public class nextInt_function_scanner {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the number: ");
			int value = input.nextInt();
			System.out.println("Entered values are: "+value);
			
			input.close();

	}

}
