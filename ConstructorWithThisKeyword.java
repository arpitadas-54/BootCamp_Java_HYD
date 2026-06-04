package com.constructor;

public class ConstructorWithThisKeyword {
	
	public ConstructorWithThisKeyword() {
		System.out.println("No value in parameter");
	}
	
	public ConstructorWithThisKeyword(int count) 
	{
		this("Arpita");
		System.out.println("int type constructor and count is:" + count);
	}
	
	public ConstructorWithThisKeyword(String name) {
		System.out.println("string type constructor and name is:" + name);
	}
	

	public static void main(String[] args) {
		ConstructorWithThisKeyword obj1 = new ConstructorWithThisKeyword();
		ConstructorWithThisKeyword obj2 = new ConstructorWithThisKeyword(6);

	}

}
