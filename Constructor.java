package com.constructor;

public class Constructor {
	private String name;
	
	Constructor() {
		System.out.println("Constructor Called....");
		name = "Coforge Java Learning..!";
	}

	public static void main(String[] args) {
		Constructor obj = new Constructor();
		System.out.println("The name is: " + obj.name);
		// TODO Auto-generated method stub

	}

}
