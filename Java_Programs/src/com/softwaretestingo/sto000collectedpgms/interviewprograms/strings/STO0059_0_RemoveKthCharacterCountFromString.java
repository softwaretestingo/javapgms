package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
public class STO0059_0_RemoveKthCharacterCountFromString 
{
	/**
	 * Enter the String: softwaretestingo
	 * Enter the Occurance Character Number For Remove : 2
	 * After Removing The Characters Having More then 2 Times:-  fwaring
	 * 
	 */
	public static String removeChars(String str, int k)
	{
		Map<Character, Integer> freq = new HashMap<>();
		for (int i = 0; i < str.length(); i++) 
		{
			char c = str.charAt(i);
			freq.put(c, freq.getOrDefault(c, 0) + 1);
		}

		StringBuilder res = new StringBuilder();

		for (int i = 0; i < str.length(); i++) 
		{
			char c = str.charAt(i);
			if (freq.get(c) < k) 
			{
				res.append(c);
			}
		}
		return res.toString();
	}
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the String: ");

		String str=br.readLine();

		System.out.print("Enter the Occurance Character Number For Remove : ");
		int k = Integer.parseInt(br.readLine());

		System.out.print("After Removing The Characters Having More then "+k+ " Times:-  "+ removeChars(str, k));
	}
}