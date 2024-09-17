package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class STO0095_2_FindFirstRepeatedCharacter 
{
	//Write a program to find out First repeated character in a string
	private static String findFirstRepeatedChar(String str) 
	{
		// code here
		int a[] = new int[26];

		for (int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);

			if (a[ch - 'a'] != 0)
				return Character.toString(ch);
			else
				a[ch - 'a']++;
		}
		return "-1";
	}

	public static void main(String[] args) throws IOException 
	{
		String str;

		// create an object of Scanner
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the string: ");
		str=br.readLine();

		System.out.println("The First Repeated Character: "+findFirstRepeatedChar(str));
		br.close();
	}
}