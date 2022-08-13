package com.softwaretestingo.basic;
import java.util.Scanner;
public class DecimaltoBinaryEx1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Decimal Number : ");

		// input decimal number
		int decimalNumber = sc.nextInt();

		// passing decimal number in Integer.toBinaryString() method
		// converting decimal to binary, return type String
		String binaryNumber = Integer.toBinaryString(decimalNumber);		

		// printing the values of decimal and binary equivalent
		System.out.println("Decimal Number : " + decimalNumber);
		System.out.println("Binary Equivalent : " + binaryNumber);
	}
}