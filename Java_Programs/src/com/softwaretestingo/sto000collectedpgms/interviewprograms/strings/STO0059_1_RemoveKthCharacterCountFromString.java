package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class STO0059_1_RemoveKthCharacterCountFromString 
{
	/**
	 * Enter the String: softwaretestingo
	 * Enter the Occurance Character Number For Remove : 2
	 * After Removing The Characters Having More then 2 Times:-  fwaring      
	 */
	static final int MAX_CHAR = 26;
	public static void removeChars(char[] charArray, int k)
	{
		int hash[]=new int[MAX_CHAR];

		for (int i = 0; i <MAX_CHAR; ++i)
			hash[i]=0;

		int n = (charArray).length;
		for (int i = 0; i < n; ++i)
			hash[charArray[i] - 'a']++;   

		int index = 0;
		for (int i = 0; i < n; ++i) 
		{
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

		System.out.print("Enter the Occurance Character Number For Remove : ");
		int k = Integer.parseInt(br.readLine());

		char[] charArray=str.toCharArray();

		removeChars(charArray,k);
		System.out.println("After Removing The Characters Having More then "+k+ " Times:-  "+ String.valueOf(charArray));
	}
}