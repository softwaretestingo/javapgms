package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
public class STO0085_0_InterviewPrograms 
{
	public static String removeChars(String str, int k)
	{
		// Using HashMap to count frequencies
		Map<Character, Integer> freq = new HashMap<>();
		for (int i = 0; i < str.length(); i++) 
		{
			char c = str.charAt(i);
			freq.put(c, freq.getOrDefault(c, 0) + 1);
		}

		// create a new empty string
		StringBuilder res = new StringBuilder();

		for (int i = 0; i < str.length(); i++) 
		{
			char c = str.charAt(i);
			// Append the characters which
			// appears less than equal to k times
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
		System.out.println("Enter the String: ");

		String str=br.readLine();

		System.out.println("Enter The K Value: ");
		int k = Integer.parseInt(br.readLine());

		System.out.println("After Removing The Characters Having More then "+k+ " Times:-  "+ removeChars(str, k));
	}
}