package com.scannerclass;

import java.util.Scanner;

public class nextLong_function_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your mobile number: ");
		long value = input.nextLong();
		System.out.println("Mobile Number is: "+value);
		
		input.close();
	}

}
