package com.softwaretestingo.sto000collectedpgms.numbers;
import java.util.Scanner;
public class ST000101_ArmstrongNumberEx1 
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
		int number, originalNumber, remainder, result = 0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number: ");
		number=in.nextInt();
		
		originalNumber = number;
		while (originalNumber != 0)
		{
			remainder = originalNumber % 10;
			result = result + (remainder*remainder*remainder);
			originalNumber /= 10;
		}

		if(result == number)
			System.out.println(number + " is an Armstrong number.");
		else
			System.out.println(number + " is not an Armstrong number.");
	}
}