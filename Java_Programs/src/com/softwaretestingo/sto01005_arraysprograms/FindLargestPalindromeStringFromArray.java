package com.softwaretestingo.sto01005_arraysprograms;
public class FindLargestPalindromeStringFromArray 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * 
	 * Problem Statement: Find the Largest Palindrome String from Array
	 *
	 */
	public static void main(String[] args) 
	{
		// Input array of strings
		String[] array = { "aaa", "aba", "adda", "acdea", "aeda" };

		// Variable to store the largest palindrome
		String largestPalindrome = "";

		// Iterate through each string in the array
		for (String str : array) 
		{
			// Check if the string is a palindrome
			if (isPalindrome(str)) 
			{
				// Update largest palindrome if the current string is larger
				if (str.length() > largestPalindrome.length()) 
				{
					largestPalindrome = str;
				}
			}
		}

		// Output the largest palindrome found
		System.out.println("The Biggest Palindrome String Is: " + largestPalindrome);
	}

	// Function to check if a string is a palindrome
	public static boolean isPalindrome(String str) 
	{
		int left = 0;
		int right = str.length() - 1;

		// Iterate through the string from both ends
		while (left < right) 
		{
			// If characters at both ends are different, it's not a palindrome
			if (str.charAt(left) != str.charAt(right)) 
			{
				return false;
			}
			left++;
			right--;
		}
		// If the loop completes without returning false, the string is a palindrome
		return true;
	}
}