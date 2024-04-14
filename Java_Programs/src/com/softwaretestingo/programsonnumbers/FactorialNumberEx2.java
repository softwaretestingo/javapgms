package com.softwaretestingo.programsonnumbers;
import java.util.Scanner;
public class FactorialNumberEx2 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Factorial Of a Number
	 * 
	 */
	// Find Factorial Using Recursive Method
	public static int factoral(int num)
	{
		if (num==0)
			return 1;
		else
			return (num * factoral(num-1));		
	}
	public static void main(String[] args) 
	{
		// fact (3)=3x2x1
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number To Find out Factorial: ");
		int number=sc.nextInt();
		System.out.println("The Factorial of "+number+ " is =  "+factoral(number));		
	}
}