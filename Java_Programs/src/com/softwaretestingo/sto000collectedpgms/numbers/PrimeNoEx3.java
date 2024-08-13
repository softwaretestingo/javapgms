package com.softwaretestingo.sto000collectedpgms.numbers;
import java.util.Scanner;
public class PrimeNoEx3 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find Number is a Prime Number
	 * 
	 */
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int inputNumber=sc.nextInt();

		if (CheckForPrime(inputNumber))
		{
			System.out.println(inputNumber+" is a prime number.");
		}
		else
		{
			System.out.println(inputNumber+" is not a prime number.");
		}

		sc.close();
	}

	public static boolean CheckForPrime(int inputNumber)
	{
		if (inputNumber<= 1) 
		{
			return false;
		}
		for (int i = 2; i< inputNumber; i++) 
		{
			if (inputNumber % i == 0) 
			{
				return false;
			}
		}
		return true;
	}
}