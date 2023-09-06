package com.softwaretestingo.interviewprograms;
import java.util.Scanner;
public class InterviewPrograms86_1 
{
	public static void findprimeno(int n)
	{
		int x, y, flag;
		// Printing display message
		System.out.println("All the Prime numbers within 1 and " + n+ " are: ");

		// Traversing all numbers from 1 to N
		for (x = 1; x <= n; x++) 
		{
			// SKIP 0 and 1 as they are neither prime nor composite
			if (x == 1 || x == 0)
				continue;

			// Using flag variable to check x is prime or not
			flag = 1;

			for (y = 2; y <= x / 2; ++y) 
			{
				if (x % y == 0) 
				{
					flag = 0;
					break;
				}
			}

			// If flag is 1 then x is prime and if flag is 0 then x is not prime
			if (flag == 1)
				System.out.print(x + " ");
		}

	}
	public static void main(String[] args)
	{
		int n;
		System.out.println("Enter the Value of N: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();	
		findprimeno(n);
	}
}