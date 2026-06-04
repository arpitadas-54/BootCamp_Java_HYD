package com.accessmodifier;

public class Public {
	
	public String college = "KIIT";

	void display() {
	System.out.println(college);
	}

	public static void main(String[] args) {
	Public p = new Public();
	p.display();

	}

}
