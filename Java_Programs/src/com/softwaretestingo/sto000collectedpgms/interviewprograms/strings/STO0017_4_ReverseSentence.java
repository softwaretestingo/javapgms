package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class STO0017_4_ReverseSentence 
{
	//Write a program to reverse a string without using inbuilt functions
	/**
	 * Enter the string: Hi I am Naveen I need and answer
	 * After Reverse the String: Hi I am Naveen I need and answer
	 * After Reverse the String: rewsna dna deen I neevaN ma I iH
	 */
	private static String reverseString(String str) 
	{
		int size;
		if (str == null) 
			return null;

		char arr[]=str.toCharArray();
		size=arr.length;
		for (int i = 0; i <size/ 2; i++) 
		{
			char c = arr[i];
			arr[i] = arr[size - i - 1];
			arr[size - i - 1] = c;
		}

		return new String(arr);
	}
	public static void main(String[] args) throws IOException 
	{
		String str;

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the string: ");
		str=br.readLine();

		System.out.println("After Reverse the String: "+str);
		System.out.println("After Reverse the String: "+reverseString(str));
		br.close();
	}
}