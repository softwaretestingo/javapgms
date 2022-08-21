package com.softwaretestingo.interviewprograms;
import java.util.Scanner;
public class PalindromeNumberEx6 
{
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