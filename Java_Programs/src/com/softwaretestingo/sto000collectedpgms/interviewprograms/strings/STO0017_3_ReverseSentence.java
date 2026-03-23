package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class STO0017_3_ReverseSentence 
{
	//Write a program to reverse a string without using inbuilt functions
	/**
	 * Enter the string: Hi I am Naveen I need and answer 
	 * Before Reverse the String: Hi I am Naveen I need and answer 
	 * After Reverse the String:  rewsna dna deen I neevaN ma I iH
	 * 
	 */
	private static String reverseString(String str) 
	{
		if (str == null) 
			return null;

		StringBuilder output = new StringBuilder();

		for (int i = str.length() - 1; i >= 0; i--) 
		{
			output.append(str.charAt(i));
		}

		return output.toString();
	}
	public static void main(String[] args) throws IOException 
	{
		String str;

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the string: ");
		str=br.readLine();

		System.out.println("Before Reverse the String: "+str);
		System.out.println("After Reverse the String: "+reverseString(str));
		br.close();
	}
}