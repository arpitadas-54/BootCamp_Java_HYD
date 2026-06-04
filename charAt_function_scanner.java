package com.scannerclass;

import java.util.Scanner;

public class charAt_function_scanner {

public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

    System.out.print("Enter a character: ");
    char value = input.next().charAt(0);

    System.out.println("Your value: " + value);

	}

}
