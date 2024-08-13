package com.softwaretestingo.sto00406_datatypes.conversionpgms;
import java.util.Scanner;
public class STO0002_1_DecimaltoBinaryEx2 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Convert Decimal to Binary Using Loop
	 * 
	 */
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter a Decimal Number : ");

		// input a decimal number
		long decimalNumber = scn.nextLong();

		// calling the method DecimalToBinary and storing it in binaryNumber 
		long binaryNumber = DecimalToBinary(decimalNumber);

		// printing the values of decimal number and binary equivalent
		System.out.println("Decimal Number: " + decimalNumber);
		System.out.println("Binary Equivalent: " + binaryNumber);
	}
	public static long DecimalToBinary(long n) 
	{
		long binaryNumber = 0;
		long remainder;
		int i = 1, step = 1;

		while (n!=0) 
		{
			remainder = n%2;
			System.out.println("Step " + step++ + ": " + n + "/2");

			System.out.println("Quotient = " + n/2 + ", Remainder = " + remainder);
			n /= 2;

			binaryNumber += remainder * i;
			i *= 10;
		}
		return binaryNumber;
	}
}