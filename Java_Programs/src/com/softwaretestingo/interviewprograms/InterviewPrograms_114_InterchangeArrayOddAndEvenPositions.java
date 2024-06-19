package com.softwaretestingo.interviewprograms;

import java.util.HashSet;

public class InterviewPrograms_114_InterchangeArrayOddAndEvenPositions {
	/**
	 * Author: SoftwareTestingo Admin 
	 * Blog: www.softwaretestingo.com 
	 * 
	 * Problem Statement: write a program to find the common letters in two strings automation and testing
	 * 
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 */
	public static void main(String[] args) 
	{
		String s1 = "automation";
		HashSet<Character> a1 = new HashSet<Character>();
		char[] ch1 = s1.toCharArray();
		String s2 = "testing";
		char[] ch2 = s2.toCharArray();
		for (int i = 0; i < ch1.length; i++) 
		{
			for (int j = 0; j < ch2.length; j++) 
			{
				if (ch1[i] == ch2[j]) 
				{
					a1.add(ch1[i]);
				}
			}
		}
		System.out.println(a1);
	}
}