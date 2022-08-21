package com.softwaretestingo.interviewprograms;
import java.util.Scanner;
public class PalindromeNumberEx5 
{
	public static void main(String[] args) 
	{
		String originalString;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		originalString=sc.nextLine();

		if (isPalindrome(originalString.toLowerCase()))
			System.out.println(originalString+ " Is a Palindrome");
		else
			System.out.println(originalString+ " Is Not a Palindrome");
	}
	private static boolean isPalindrome(String string) {

        String reversed = new StringBuilder(string).reverse().toString();
        return string.equals(reversed);
    }
}