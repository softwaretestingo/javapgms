package com.softwaretestingo.patternprograms;
import java.util.Scanner;
public class StarPatternsEx4 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Star Pattern Program Example
	 * 
	 */
	public static void main(String[] args) 
	{
		// Create a new Scanner object
		Scanner scanner = new Scanner(System.in);

		// Get the number of rows from the user
		System.out.println("Enter the number of rows needed to print the pattern ");

		int rows = scanner.nextInt();
		System.out.println("## Printing the pattern ##");

		for (int i=1; i<=rows; i++)
		{
			// Print space in increasing order
			for (int j=1; j<i; j++) 
			{ 
				System.out.print(" "); 
			} 
			// Print star in decreasing order 
			for (int k=rows; k>=i; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}
}