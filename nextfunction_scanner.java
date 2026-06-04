package com.scannerclass; //using keyboard function

import java.util.Scanner;

public class nextfunction_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String value = input.next();
		System.out.println("Entered values are: "+value);
		
		input.close();

	}

}
