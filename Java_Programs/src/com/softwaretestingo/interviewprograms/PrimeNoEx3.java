package com.softwaretestingo.interviewprograms;
import java.util.Scanner;
public class PrimeNoEx3 
{
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