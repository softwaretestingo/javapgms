package com.softwaretestingo.sto000collectedpgms.numbers;
import java.util.Scanner;
public class ST000802_LeapYearEx2
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

		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
			System.out.println (year + " is a Leap Year");

		//not leap year
		else
			System.out.println (year + " is not a Leap Year");
	}
}