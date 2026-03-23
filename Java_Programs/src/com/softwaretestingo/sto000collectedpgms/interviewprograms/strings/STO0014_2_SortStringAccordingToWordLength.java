package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
public class STO0014_2_SortStringAccordingToWordLength 
{
	/**
	 * Input: this interview is for CBA
	 * Output: is for CBA this interview 
	 * 
	 */
	public static void main(String[] args) 
	{
		String str="this interview is for CBA";
		System.out.println("Input: "+str);
		String temp;
		String []sw=str.split(" ");

		for(int i=0; i<sw.length;i++)
		{
			for(int j=i+1; j<sw.length; j++)
			{
				if(sw[i].length()> sw[j].length())
				{
					temp= sw[i]; 
					sw[i]=sw[j]; 
					sw[j]=temp; 
				}
			}
		}
		System.out.print("Output: ");
		for (int i = 0; i < sw.length; i++) 
		{
			System.out.print(sw[i]+ " ");
		}
	}
}