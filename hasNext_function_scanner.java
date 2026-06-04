package com.scannerclass;

import java.util.Scanner;

public class hasNext_function_scanner {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter any value: ");

if(input.hasNext()) {
String value = input.next();
System.out.println("Your value: " + value);
               }
        }
}
  	 
	