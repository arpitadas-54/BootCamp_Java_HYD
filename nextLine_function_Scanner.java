package com.scannerclass;

import java.util.Scanner;

public class nextLine_function_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner input = new Scanner(System.in);
				System.out.print("Enter your statement: ");
				String value = input.nextLine();
				System.out.println("Entered statement is: "+value);
				
				input.close();

	}

}
