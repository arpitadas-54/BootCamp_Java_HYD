package com.variable;

public class InstanceVariable {
	
	public int rollNum;
	public String Name;
	public int TotalMarks;
	public long MobNum;

	public static void main(String[] args) {
		
		InstanceVariable in = new InstanceVariable();
		in.rollNum = 1241;
		in.Name = "Arpita";
		in.TotalMarks = 969;
		in.MobNum = 1234567890;
		
		System.out.println(in.rollNum);
		System.out.println(in.Name);
		System.out.println(in.TotalMarks);
		System.out.println(in.MobNum);
		// TODO Auto-generated method stub

	}

}
