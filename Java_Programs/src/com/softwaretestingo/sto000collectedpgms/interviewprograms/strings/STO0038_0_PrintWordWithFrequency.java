package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
public class STO0038_0_PrintWordWithFrequency 
{
	//Java Program to Count repeated words in String
	/**
	 * Input: Welcome to Java Session Session Session
	 * Welcome- 1
	 * to- 1
	 * Java- 1
	 * Session- 3
	 * 
	 */
	public static void main(String[] args) 
	{
		String input="Welcome to Java Session Session Session";  
		System.out.println("Input: "+input);
		String[] words=input.split(" ");
		int wrc=1;

		for(int i=0;i<words.length;i++)   
		{
			for(int j=i+1;j<words.length;j++)
			{

				if(words[i].equals(words[j]))
				{
					wrc=wrc+1; 
					words[j]="0";
				}
			}
			if(words[i]!="0")
				System.out.println(words[i]+"- "+wrc);
			wrc=1;
		}  
	}
}