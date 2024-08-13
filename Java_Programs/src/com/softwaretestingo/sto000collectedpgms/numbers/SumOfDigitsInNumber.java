package com.softwaretestingo.sto000collectedpgms.numbers;
public class SumOfDigitsInNumber 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Sum Of All Digits
	 * 
	 */
	public static void main(String[] args) 
	{
		int num = 123455789;
		int sum = 0;
		System.out.println("Original Number Is: "+num);
		while (num > 0) 
		{
			// num%10 is used to get last digit
			sum = sum + num % 10;
			// num/10 is used to eliminate last digit
			num = num / 10;
		}
		System.out.println("Sum Ofg All Digit Is:  " + sum);
	}
}