package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
public class STO0095_1_InterviewPrograms 
{
	//Write a program to find out First repeated character in a string
	private static char findFirstRepeatedChar(String str) 
	{
		char[] arr = str.toCharArray();

		HashSet<Character> h = new HashSet<>();

		for (int i=0; i<=str.length()-1; i++)
		{
			char c = arr[i];

			if (h.contains(c))
				return c;

			else
				h.add(c);
		}
		return 0;
	}

	public static void main(String[] args) throws IOException 
	{
		String str;

		// create an object of Scanner
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		str=br.readLine();

		System.out.println("The First Repeated Character: "+findFirstRepeatedChar(str));
		br.close();
	}
}