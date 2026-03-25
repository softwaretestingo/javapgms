package com.softwaretestingo.sto000collectedpgms.numbers;
import java.util.Scanner;
public class STO0010_0_CountNumberOfDigits 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Count Number Of Digits
	 * 
	 */
	public static void main(String[] args) 
	{
		int number,originalnumber, count=0;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number: ");
		originalnumber=input.nextInt();
		number=originalnumber;
		while (number != 0) 
		{
			number = number/10;
			++count;
		}
		System.out.println("Total Number Of Digits In "+originalnumber+" is: "+count);
	}
}