package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class STO0095_0_InterviewPrograms 
{
	//Write a program to find out First repeated character in a string
	private static char findFirstRepeatedChar(String str) 
	{
		int n = str.length();
		char ans = ' ';
		int index = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) 
		{
			char temp = str.charAt(i);

			// Checking that character in temp repeats or not by running a for loop
			for (int j = i + 1; j < n; j++)
			{
				if (str.charAt(j) == temp)
				{

					// if the index where it repeated is less than the index of the previously
					// repeated character then store this character in ans variable
					// and its index where it repeated in index variable
					if (j < index)
					{
						index = j;
						ans = str.charAt(j);
					}
				}
			}
		}
		return ans;
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