package com.softwaretestingo.sto000collectedpgms.numbers;
import java.util.Scanner;
public class ST000306_PalindromeNumberEx6 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find Number is a Palindrome number
	 * 
	 */
	public static void main(String[] args) 
	{
		String originalString;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String or Number: ");
		originalString=sc.nextLine();

		if (isPalindrome(originalString.toLowerCase()))
			System.out.println(originalString+ " Is a Palindrome");
		else
			System.out.println(originalString+ " Is Not a Palindrome");
	}

	private static boolean isPalindrome(String original)
	{

		String reversed = "";

		int len = original.length();
		for (int i = len - 1; i >= 0; i--) 
		{
			reversed = reversed + original.charAt(i);
		}
		return original.equals(reversed);
	}
}