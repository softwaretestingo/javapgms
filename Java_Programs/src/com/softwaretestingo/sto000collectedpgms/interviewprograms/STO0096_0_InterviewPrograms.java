package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class STO0096_0_InterviewPrograms 
{
	//Write a program to reverse a string without using inbuilt functions
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
		System.out.println("Enter the string");
		str=br.readLine();

		System.out.println("Before Reverse the String: "+str);
		System.out.println("After Reverse the String: "+reverseString(str));
		br.close();
	}
}