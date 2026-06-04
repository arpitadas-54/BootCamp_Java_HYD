package com.scannerclass;

import java.util.Scanner;

public class nextByte_function_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a byte value: ");
		byte value = input.nextByte();
		System.out.println("Your value: "+value);

	}

}
