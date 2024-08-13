package com.softwaretestingo.sto000collectedpgms.interviewprograms;

import java.util.ArrayList;
import java.util.List;

public class STO0112_1_InterviewPrograms {
	/**
	 * Author: SoftwareTestingo Admin Blog: www.softwaretestingo.com Problem
	 * Statement: Reverse Alphabets only With Out Changing the Digits?
	 * 
	 * Input: test1234epam6789 Output: tset1234mape6789
	 * 
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		String str = "test1234epam6789";
		// tset1234mape6789
		StringBuilder sb = new StringBuilder();
		StringBuilder word = new StringBuilder();

		for (int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) 
			{
				word.append(ch);
			} 
			else
			{
				sb.append(reverse(word.toString()));
				sb.append(ch);
				word.setLength(0);
			}
		}
		System.out.println("Input: "+str);
		System.out.println("Output: "+sb);
	}

	public static String reverse(String str)
	{
		String rev = "";
		for (int i = 0; i < str.length(); i++) 
		{
			rev = str.charAt(i) + rev;
		}
		return rev;
	}
}