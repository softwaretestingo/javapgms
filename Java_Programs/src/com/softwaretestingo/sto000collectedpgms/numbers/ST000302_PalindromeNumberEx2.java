package com.softwaretestingo.sto000collectedpgms.numbers;
import java.util.Scanner;
public class ST000302_PalindromeNumberEx2 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find Number is a Palindrome number Using For Loop
	 * 
	 */
	public static void main(String[] args) 
	{
		int originalNumber, temp, finalNumber=0, reminder;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		originalNumber=sc.nextInt();
		
		// Assigning the value to temp Variable
		temp=originalNumber;
		for( ;originalNumber != 0; originalNumber /= 10 )
        {
			reminder = originalNumber % 10;
            finalNumber= finalNumber* 10 + reminder;
        }
		
		
		// Two Value Comparison
		if (temp==finalNumber)
		{
			System.out.println(temp+ " is a Palindrome");
		}
		else
			System.out.println(temp+ " is Not a Palindrome");
	}
}