package com.variable;

public class LocalVariable {
    
	  public void calculate(){
		int a = 5;
	    int b = 10;
	    int c = a+b;
	  System.out.println("Sum is:" +c);  
	  }
	    
public static void main(String[]args) {
	LocalVariable a = new LocalVariable();
	a.calculate();
     }
	
   
}


