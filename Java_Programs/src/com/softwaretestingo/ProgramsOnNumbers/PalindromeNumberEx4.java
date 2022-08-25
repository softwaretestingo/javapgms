package com.softwaretestingo.ProgramsOnNumbers;
import java.util.Scanner;
public class PalindromeNumberEx4 
{
	public static void main(String[] args) 
	{
		String originalString, finalString="";
		int length;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		originalString=sc.nextLine();
		
		length=originalString.length();
		
		for(int i=length-1; i>=0; i--)
		{
			finalString=finalString+originalString.charAt(i);
		}
		
		// Two Value Comparison
		if (originalString.equalsIgnoreCase(finalString))
		{
			System.out.println(originalString+ " is a Palindrome");
		}
		else
			System.out.println(originalString+ " is Not a Palindrome");
	}
}