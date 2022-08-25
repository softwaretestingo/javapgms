package com.softwaretestingo.ProgramsOnNumbers;
import java.util.Scanner;
public class PalindromeNumberEx2 
{
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