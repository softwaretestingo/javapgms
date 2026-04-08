package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class STO0059_0_RemoveKthCharacterCountFromString 
{
	/**
	 * Enter the String: softwaretestingo
	 * Enter the Occurance Character Number For Remove : 2
	 * After Removing The Characters Having More then 2 Times:-  fwaring      
	 */
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the String: ");
		String str=br.readLine();

		// remove characters occurring more than once
		System.out.print("Enter the Occurance Character Number For Remove : ");
		int k = Integer.parseInt(br.readLine());

        // ASCII frequency
        int[] freq = new int[256]; 

        // 1) Count frequency
        for (int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        // 2) Print characters whose frequency < k (preserve order)
        for (int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);
            if (freq[ch] < k)
            {
                System.out.print(ch);
            }
        }
	}
}