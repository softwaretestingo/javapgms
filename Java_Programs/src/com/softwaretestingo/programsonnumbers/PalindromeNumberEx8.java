package com.softwaretestingo.programsonnumbers;
import java.util.Scanner;
import java.util.Stack;
public class PalindromeNumberEx8 
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
		char[] data = original.toCharArray();
		Stack stack = new Stack<>();

		for (char c: data) 
		{
			stack.push(c);
		}

		char[] data2 = new char[data.length];
		int len = stack.size();

		for (int i = 0; i < len; i++) 
		{
			data2[i] = (char) stack.pop();
		}

		String reversed = new String(data2);
		return original.equals(reversed);
	}
}