package com.softwaretestingo.programsonnumbers;
import java.util.Scanner;
public class ArmstrongNumberEx3 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Armstrong Number Example
	 * 
	 */
	static boolean isArmstrong(int number)   
	{
		int originalNumber, remainder=0, result=0, count=0;   

		//assigning n into a temp variable  
		originalNumber=number; 

		// Findout the Number Of Digits in the Entered Integer
		for (;originalNumber != 0; originalNumber /= 10, ++count);

		originalNumber = number;
		for (;originalNumber != 0; originalNumber /= 10)
		{
			remainder = originalNumber % 10;
			result += Math.pow(remainder, count);
		}
		if(result == number)
			return true;
		else
			return false;
	}
	public static void main(String[] args) 
	{
		int number;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number: ");
		number=in.nextInt();

		System.out.println("Armstrong Number up to "+ number + " are: ");  
		for(int i=0; i<=number; i++)  
		{
			//function calling  
			if(isArmstrong(i))  
				//prints the armstrong numbers  
				System.out.print(i+ ", ");
		}
	}
}