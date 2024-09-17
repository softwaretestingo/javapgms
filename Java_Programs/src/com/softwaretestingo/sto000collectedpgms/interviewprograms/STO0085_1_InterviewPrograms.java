package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class STO0085_1_InterviewPrograms 
{
	static final int MAX_CHAR = 26;
	public static void removeChars(char[] charArray, int k)
	{
		// Hash table initialised to 0
		int hash[]=new int[MAX_CHAR];

		for (int i = 0; i <MAX_CHAR; ++i)
			hash[i]=0;

		// Increment the frequency of the character
		int n = (charArray).length;
		for (int i = 0; i < n; ++i)
			hash[charArray[i] - 'a']++;   

		// Next index in reduced string
		int index = 0;
		for (int i = 0; i < n; ++i) 
		{

			// Append the characters which
			// appears less than k times
			if (hash[charArray[i] - 'a'] < k) 
			{
				charArray[index++] = charArray[i];
			}
		}
		for (int i = index; i < n; ++i)
			charArray[i] = ' ';
	}
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the String: ");

		String str=br.readLine();

		System.out.print("Enter The K Value: ");
		int k = Integer.parseInt(br.readLine());
		System.out.println(k);

		char[] charArray=str.toCharArray();

		removeChars(charArray,k);
		System.out.println("After Removing The Characters Having More then "+k+ " Times:-  "+ String.valueOf(charArray));
	}
}