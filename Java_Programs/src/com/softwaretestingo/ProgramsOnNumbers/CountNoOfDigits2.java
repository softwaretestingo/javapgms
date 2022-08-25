package com.softwaretestingo.ProgramsOnNumbers;
import java.util.Scanner;
public class CountNoOfDigits2 
{
	public static void main(String[] args) 
	{
		int number,originalnumber, count=0;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number: ");
		originalnumber=in.nextInt();
		number=originalnumber;
		
		for (; number != 0; number /= 10, ++count)
		{
	    }
		System.out.println("Total Number Of Digits In "+originalnumber+" is: "+count);
	}
}