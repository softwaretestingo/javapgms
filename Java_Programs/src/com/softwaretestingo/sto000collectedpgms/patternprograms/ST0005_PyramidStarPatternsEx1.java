package com.softwaretestingo.sto000collectedpgms.patternprograms;
import java.util.Scanner;
public class ST0005_PyramidStarPatternsEx1 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Pyramid Star Pattern Program Example
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
			// Print space in decreasing order 
			for (int j=rows; j>i; j--)
			{
				System.out.print(" ");
			}
			// Print star in increasing order
			for (int k=1; k<=(i * 2) -1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}
}