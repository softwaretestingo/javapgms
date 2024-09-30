package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
import java.util.Scanner;
public class STO0093_2_RemoveWhiteSpace 
{
	//Write a program for removing white spaces in a String.
	private static int remoteWhiteSpace(char[] str)
	{
		int count=0;
		
		for (int i = 0; i<str.length; i++)
			if (str[i] != ' ')
				str[count++] = str[i];
		
		return count;
	}
	public static void main(String[] args) 
	{
		// create an object of Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");

		// take the input
		String input = sc.nextLine();
		System.out.println("Original String: " + input);

		char[] str=input.toCharArray();
		int i=remoteWhiteSpace(str);
		
		System.out.println("After Removing Spaces: "+String.valueOf(str).subSequence(0, i));
		sc.close();
	}
}