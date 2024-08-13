package com.softwaretestingo.sto000collectedpgms.numbers;
import java.util.Scanner;
public class PalindromeNumberEx3 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find Number is a Palindrome number Using Recursion
	 * 
	 */
	public static void main(String[] args) 
	{
		int originalNumber, temp, finalNumber=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		originalNumber=sc.nextInt();
		
		temp=originalNumber;
		// Two Value Comparison
		if (getReverse(originalNumber, finalNumber)==temp)
		{
			System.out.println(temp+ " is a Palindrome");
		}
		else
			System.out.println(temp+ " is Not a Palindrome");
	}

	private static int getReverse(int originalNumber, int finalNumber) 
	{
		if(originalNumber==0)
			return finalNumber;
		
		int reminder = originalNumber%10;
		finalNumber=finalNumber*10+reminder;
		
		return getReverse(originalNumber/10, finalNumber);		
	}
}