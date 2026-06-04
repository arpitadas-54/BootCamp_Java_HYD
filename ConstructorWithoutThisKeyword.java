package com.constructor;

public class ConstructorWithoutThisKeyword {
	public ConstructorWithoutThisKeyword() {
		System.out.println("Constructor with zero arguments");
	}
	
	public ConstructorWithoutThisKeyword(int count) {
		System.out.println("int type constructor and count is:" + count);
	}
	
	public ConstructorWithoutThisKeyword(String name) {
		System.out.println("string type constructor and name is:" + name);
	}
	
	public void display() {
		System.out.println("working fine");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorWithoutThisKeyword obj1 = new ConstructorWithoutThisKeyword();
		obj1.display();
		ConstructorWithoutThisKeyword obj2 = new ConstructorWithoutThisKeyword(6);
		obj2.display();
		ConstructorWithoutThisKeyword obj3 = new ConstructorWithoutThisKeyword("Arpita");
		obj3.display();
	}

}
