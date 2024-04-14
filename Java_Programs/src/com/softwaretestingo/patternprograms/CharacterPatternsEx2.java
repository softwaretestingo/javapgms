package com.softwaretestingo.patternprograms;
import java.util.Scanner;
public class CharacterPatternsEx2 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Character Pattern Program Example
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

		int alphabet = 65;
		for (int i = 0; i<= rows; i++)
		{
			for (int j = 0; j <= i; j++)
			{
				System.out.print((char) alphabet + " ");
			}
			alphabet++;
			System.out.println();
		}
	}
}