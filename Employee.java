package com.Employee;

 public class Employee {
	 
	 int empId;
	 String empName;
	 double salary;

	 void display() {
	 System.out.println("Employee ID: " + empId);
	 System.out.println("Employee Name: " + empName);
	 System.out.println("Salary: " + salary);
	 }

   public static void main(String[] args) {

	 Employee emp = new Employee();

	 emp.empId = 101;
	 emp.empName = "Arpita Das";
	 emp.salary = 50000;

	 emp.display();

	}

}
