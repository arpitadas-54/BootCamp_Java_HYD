package com.Banking; //Class usage

public class BankAccount {

		String accountHolder;
        double balance;

	    void deposit (double amount) {
            balance += amount; }

		void withdraw(double amount) {
            balance -= amount; }

		void displayBalance() {
            System.out.println(balance); 
            }

     //Object Usage
    public static void main(String[] args) {
		
        BankAccount acc = new BankAccount();
        acc.accountHolder = "Arpita Das";
        acc.balance = 120000;
        acc.deposit(50000);
		acc.withdraw(20000);
		acc.displayBalance();

	}

}
