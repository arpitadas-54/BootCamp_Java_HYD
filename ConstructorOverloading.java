package com.constructor;

class Student {

int rollNo;
String name;

Student() {
rollNo = 20;
name = "Arpita";
}

Student(int r, String n) {
rollNo = r;
name = n;
}

void display() {
System.out.println("Roll No: " + rollNo);
System.out.println("Name: " + name);
}
}

public class ConstructorOverloading {
public static void main(String[] args) {

Student s1 = new Student();
Student s2 = new Student(31, "Prateek");

s1.display();
s2.display();

	}

}
