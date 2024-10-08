package com.softwaretestingo.sto000collectedpgms.numbers;
import java.util.Scanner;
public class ST000401_FactorialNumberEx1 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Factorial Of a Number
	 * 
	 */
	// Find Factorial Using Non-Recursive Method
	public static int factoral(int num)
	{
		int fact=1;
		if(num==0)
			return 1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
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