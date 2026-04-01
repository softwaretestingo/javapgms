package com.softwaretestingo.abstraction;

public class Test {
	public static void main(String[] args) 
	{
		String str = "lekhale";
		int total=str.length();
		int after=str.replaceAll("le", "").length();
		System.out.println((total-after)/2);
		

	}
}