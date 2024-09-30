package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
import java.util.Scanner;
public class STO0092_1_RemoveDigitsFromString 
{
	//Remove numbers from a String Java using charAt( ) method
	public static void main(String[] args) 
	{
		String str, res="";

		Scanner sc = new Scanner(System.in);
		// Accept any String to remove numbers
		System.out.print("Enter a String With numbers: ");
		str = sc.nextLine();

		for(int i=0; i<str.length(); i++)
		{
			if(!Character.isDigit(str.charAt(i))) 
			{
				res += str.charAt(i);
			}
		}
		// Display String without numbers
		System.out.print("String after removing all numbers: " + res);

	}
}