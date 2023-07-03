package com.softwaretestingo.programsonnumbers;
import java.util.Scanner;
public class PrimeNoEx2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Start Number: ");
		int start=sc.nextInt();

		System.out.println("Enter End Number: ");
		int end=sc.nextInt();

		System.out.println("Prime numbers between "+start+" and "+end+" : ");
		//Check is the number is a Prime No
		for (int i = start; i <= end; i++)
		{
			if(CheckForPrime(i))
			{
				System.out.print(i+", ");
			}
		}

		sc.close();
	}

	private static boolean CheckForPrime(int inputNumber) 
	{
		boolean isItPrime=true;
		if(inputNumber<=1)
		{
			isItPrime=false;
			return isItPrime;
		}
		else
		{
			for (int i=2;i<=inputNumber/2;i++)
			{
				// If Reminder is zero, it returns false, meaning it is not a prime number.
				if ((inputNumber%i)==0)
				{
					isItPrime=false;
					break;
				}
			}
			return isItPrime;
		}
	}
}