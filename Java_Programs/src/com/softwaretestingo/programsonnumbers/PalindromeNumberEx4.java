package com.softwaretestingo.programsonnumbers;
import java.util.Scanner;
public class PalindromeNumberEx4 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find Number is a Palindrome number
	 * 
	 */
	public static void main(String[] args) 
	{
		String originalString, finalString="";
		int length;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		originalString=sc.nextLine();
		
		length=originalString.length();
		
		for(int i=length-1; i>=0; i--)
		{
			finalString=finalString+originalString.charAt(i);
		}
		
		// Two Value Comparison
		if (originalString.equalsIgnoreCase(finalString))
		{
			System.out.println(originalString+ " is a Palindrome");
		}
		else
			System.out.println(originalString+ " is Not a Palindrome");
	}
}