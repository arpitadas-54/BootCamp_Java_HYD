package com.accessmodifier;

public class Private {
	
	private int salary = 50000;

	void display() {
    System.out.println(salary);
	}

	public static void main(String[] args) {
	Private p = new Private();
	p.display();


	}

}
