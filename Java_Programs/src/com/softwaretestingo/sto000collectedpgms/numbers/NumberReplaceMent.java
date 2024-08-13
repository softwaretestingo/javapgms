package com.softwaretestingo.sto000collectedpgms.numbers;
public class NumberReplaceMent 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: If a Number ends With 3 then print Car similarly if Ends With 5 then Print Bus
	 * 
	 */
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 100; i++) 
		{
			// Check if the number ends with 3 or is divisible by 3
			if (i % 10 == 3) 
			{
				System.out.print("Car" + ", ");
			}
			// Check if the number is divisible by 5
			else if (i % 10 == 5) 
			{
				System.out.print("Bus" + ", ");
			}
			// If none of the above conditions are met, print the number itself
			else 
			{
				System.out.print(i + ", ");
			}
		}
	}
}