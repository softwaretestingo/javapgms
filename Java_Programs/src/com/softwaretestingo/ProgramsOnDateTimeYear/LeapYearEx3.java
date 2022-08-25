package com.softwaretestingo.ProgramsOnDateTimeYear;
import java.util.Scanner;
public class LeapYearEx3
{
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