package com.softwaretestingo.sto000collectedpgms.patternprograms;
import java.util.Scanner;
public class ST000202_NumberPatternEx3 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Number Pattern Program Example
	 * 
	 */
	public static void main(String[] args) 
	{
		// Create a new Scanner object
		Scanner scanner = new Scanner(System.in);

		// Get the number of rows from the user
		System.out.println("Enter the number of rows to print the pattern ");

		int rows = scanner.nextInt();
		System.out.println("** Printing the pattern... **");
		for (int i = 1; i <= rows; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = rows; i >= 1; i--)
		{
			for (int j = 1; j < i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}