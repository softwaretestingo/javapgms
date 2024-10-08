package com.softwaretestingo.sto00406_datatypes.conversionpgms;
import java.util.Scanner;
public class STO0001_0_BinarytoDecimalEx1 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Convert Binary To Decimal Using Integer.parseInt()
	 * 
	 */
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
        System.out.println("Enter a Binary Number : ");
	
        // Enter a binary number in string form
        String binaryNumber = scn.nextLine();

        // passing binary number and base in Integer.parseInt() method
        // converting binary to decimal, return type int
        int decimalNumber = Integer.parseInt(binaryNumber, 2);		

        // printing the values of binary and decimal equivalent
        System.out.println("Binary Number : " + binaryNumber);
        System.out.println("Decimal Number Equivalent : " + decimalNumber);
	}
}