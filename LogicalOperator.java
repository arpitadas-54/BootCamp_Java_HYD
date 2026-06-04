package com.JavaOperator;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;

		System.out.println(a < b && b > 15);
		System.out.println(a > b && b > 15);
		System.out.println(a < b || b < 15);
		System.out.println(a > b || b > 15);
		System.out.println(!(a > b));
		System.out.println(!(a < b));
		System.out.println(a == 10 && b == 20);
	}

}
