package com.softwaretestingo.sto000collectedpgms.numbers;
import java.util.Scanner;
public class LeapYearEx3
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
		boolean leap;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Valid Year: ");
		int year=sc.nextInt();

		if (year % 400 == 0)
            leap = true;

        else if (year % 4 == 0 && year % 100 != 0)
            leap = true;

        else
            leap = false;

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
	}
}