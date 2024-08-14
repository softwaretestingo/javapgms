package com.softwaretestingo.sto011_STRINGS;
public class GetUpperCaseLetterFromString 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Write a program to get all upper-case letters in a given String.
	 * 
	 */
	public static void main(String[] args) 
	{
		String str = "Welcome To SoftwareTestingO Blog";
		System.out.println("Upper Case Letter In String: ");
	      for(int i = 0; i < str.length(); i++) 
	      {
	         if(Character.isUpperCase(str.charAt(i))) 
	         {
	             System.out.print(str.charAt(i)+" ");
	         }
	       }
	}
}