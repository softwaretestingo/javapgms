package com.softwaretestingo.ConversionPrograms;
import java.util.Scanner;
public class BinarytoDecimalEx1 
{
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