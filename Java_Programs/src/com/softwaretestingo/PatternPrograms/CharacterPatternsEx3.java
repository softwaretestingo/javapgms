package com.softwaretestingo.PatternPrograms;
import java.util.Scanner;
public class CharacterPatternsEx3 
{
	public static void main(String[] args) 
	{
		// Create a new Scanner object
		Scanner scanner = new Scanner(System.in);

		// Get the number of rows from the user
		System.out.println("Enter the number of rows needed to print the pattern ");

		int rows = scanner.nextInt();
		System.out.println("## Printing the pattern ##");

		for (int i = rows; i >= 0; i--)
		{
			int alphabet = 65;
			for (int j = 0; j <= i; j++)
			{
				System.out.print((char) (alphabet + j) + " ");
			}
			System.out.println();
		}
		for (int i = 0; i<= rows; i++)
		{
			int alphabet = 65;
			for (int j = 0; j <= i; j++)
			{
				System.out.print((char) (alphabet + j) + " ");
			}
			System.out.println();
		}
	}
}