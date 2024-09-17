package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.Scanner;
public class STO0092_0_RemoveDigitsFromString 
{
	//Remove numbers from a String Java using the replaceAll( ) method
	public static void main(String[] args) 
	{
		String str;
		
		Scanner sc = new Scanner(System.in);
		// Accept any String to remove numbers
		System.out.print("Enter a String with numbers: ");
		str = sc.nextLine();

		// Replace all numbers from given String
		str = str.replaceAll("[0123456789]", "");
		// Display String without numbers
		System.out.print("String after removing all numbers: " + str);
	}
}