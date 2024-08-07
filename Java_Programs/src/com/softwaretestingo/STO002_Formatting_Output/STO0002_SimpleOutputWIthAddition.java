package com.softwaretestingo.STO002_Formatting_Output;
public class STO0002_SimpleOutputWIthAddition 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=25;
		/**
		 * This Will Give 1025 Because as the execution is from left to right and 
		 * First is String so a is also taken as String
		 */
		System.out.println("Sum Of A & B: "+a+b);
		
		//For Correct Result
		System.out.println("Sum Of A & B: "+ (a+b));
	}
}