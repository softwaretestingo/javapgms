package com.softwaretestingo.programsonnumbers;
import java.util.Scanner;
public class PrimeNoEx1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int inputNumber=sc.nextInt();

		//Check is the number is a Prime No
		boolean isItPrime= CheckForPrime(inputNumber);

		if (isItPrime)
		{
			System.out.println(inputNumber+" is a prime number.");
		}
		else
		{
			System.out.println(inputNumber+" is not a prime number.");
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