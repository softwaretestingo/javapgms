package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.Scanner;
public class STO0059_2_ReverseNumber 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		// Input: Get the number from the user
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		// Call the reverseNumber method and print the result
		System.out.println("Reversed number: " + reverseNumber(number));
	}

	// Method to reverse a number without using the modulus operator
	private static int reverseNumber(int num) {
		int reversed = 0;

		// Iterate until the input number becomes 0
		while (num != 0) {
			// Extract the last digit
			int digit = num - (num / 10) * 10;

			// Update the reversed number by adding the extracted digit
			reversed = reversed * 10 + digit;

			// Remove the last digit from the input number
			num = num / 10;
		}

		return reversed;
	}
}