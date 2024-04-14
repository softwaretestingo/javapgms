package com.softwaretestingo.programsonnumbers;
import java.util.Scanner;
public class ArmstrongNumberEx2 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Armstrong Number Example
	 * 
	 */
	public static void main(String[] args) 
	{
		int number, originalNumber, remainder, count=0, result = 0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number: ");
		number=in.nextInt();

		originalNumber = number;
		// Findout the Number Of Digits in the Entered Integer
		for (;originalNumber != 0; originalNumber /= 10, ++count);

		originalNumber = number;
		for (;originalNumber != 0; originalNumber /= 10)
		{
			remainder = originalNumber % 10;
			result += Math.pow(remainder, count);
		}

		if(result == number)
			System.out.println(number + " is an Armstrong number.");
		else
			System.out.println(number + " is not an Armstrong number.");

	}
}