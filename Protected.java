package com.accessmodifier;

public class Protected {
	
	protected String bankName = "HDFC";

	void display() {
	System.out.println(bankName);
	}

	public static void main(String[] args) {
	Protected p = new Protected();
	p.display();

	}

}
