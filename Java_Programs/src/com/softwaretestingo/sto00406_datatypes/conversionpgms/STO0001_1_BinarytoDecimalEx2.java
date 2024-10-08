package com.softwaretestingo.sto00406_datatypes.conversionpgms;
import java.util.Scanner;
public class STO0001_1_BinarytoDecimalEx2 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Convert Binary To Decimal Using Math.pow()
	 * 
	 */
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter a Binary Number : ");
		// input a binary number
		long binaryNumber = scn.nextLong();

		// calling the method BinaryToDecimal and storing it in decimalNumber
		long decimalNumber = BinaryToDecimal(binaryNumber);

		// printing the values of binary and decimal equivalent
		System.out.println("Binary Number : " + binaryNumber);
		System.out.println("Decimal Number Equivalent : " + decimalNumber);

	}
	public static long BinaryToDecimal(long binaryNum)
	{
		long decimalEquivalent = 0;
		long lastDigit = 0;
		int power = 0;

		// binary to decimal conversion
		while(binaryNum > 0)
		{
			// getting the right most digit after every division by 10
			lastDigit = binaryNum % 10;
			// adding the product of lastDigit and  2^power 
			decimalEquivalent += lastDigit * Math.pow(2, power);
			power++;
			binaryNum /= 10;
		}

		return decimalEquivalent;
	}
}