package com.constructor;

public class ParameterizedConstructor {
	String languages;
	
	ParameterizedConstructor(String lang) {
		languages = lang;
		System.out.println(languages + " Programming Language");
	}

	public static void main(String[] args) {
		ParameterizedConstructor obj1 = new ParameterizedConstructor("Java");
		ParameterizedConstructor obj2 = new ParameterizedConstructor("Javascript");
		ParameterizedConstructor obj3 = new ParameterizedConstructor("CSharp");
		// TODO Auto-generated method stub

	}

}
