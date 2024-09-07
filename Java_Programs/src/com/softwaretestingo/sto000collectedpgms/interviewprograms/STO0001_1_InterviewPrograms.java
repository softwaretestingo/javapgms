package com.softwaretestingo.sto000collectedpgms.interviewprograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class STO0001_1_InterviewPrograms 
{
	public static void main(String[] args) 
	{
		String[] strArray = { "Rama", "Test", "Type", "Tata" };
		int maxLength = 0;
		for (String str : strArray) 
		{
			maxLength = str.length();
		}
		String result = "";
		for (int i = 0; i < maxLength; i++) 
		{
			for (String str : strArray) 
			{
				if (i < str.length()) 
				{
					result = result + str.charAt(i);
				}
			}
		}
		System.out.println("Input: "+Arrays.toString(strArray));
		System.out.println("Outpur: "+result);//RTTTaeyamsptatea
	}
}