package com.softwaretestingo.sto000collectedpgms.numbers;
import java.util.Scanner;
public class LeapYearEx1
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Leap Year Example
	 * 
	 */
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Valid Year: ");
		int year=sc.nextInt();

		if (year % 400 == 0)
			System.out.println (year + " is a Leap Year");

		else if (year % 4 == 0 && year % 100 != 0)
			System.out.println (year + " is a Leap Year");

		else
			System.out.println (year + " is not a Leap Year");
	}
}