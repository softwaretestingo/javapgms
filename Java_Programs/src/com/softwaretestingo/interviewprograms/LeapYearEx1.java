package com.softwaretestingo.interviewprograms;

import java.util.Scanner;

public class LeapYearEx1
{
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