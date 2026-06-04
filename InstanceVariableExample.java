package com.variable;

public class InstanceVariableExample {
	
	public int Accno;
	public String AccHolderName;
	public int Balance;
	public String BranchName;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariableExample in = new InstanceVariableExample();
		in.Accno = 11002233;
		in.AccHolderName = "Sitarama";
		in.Balance = 12345678;
		in.BranchName = "CoforgeLtdHDFC";
				
		System.out.println(in.Accno);
		System.out.println(in.AccHolderName);
		System.out.println(in.Balance);
		System.out.println(in.BranchName);	

	}

}
