package com.softwaretestingo.sto000collectedpgms.interviewprograms;

import java.util.Arrays;

public class STO0021_2_InterviewPrograms 
{
	/*
	 * Input int a[]={5,0,4,6,0,7,0} 
	 * Output = {0,0,0,5,4,6,7} 
	 * Goal is to print all zero first and then the rest of other numbers as it is.
	 */
	public static void main(String[] args) 
	{
		int [] a = {5, 0, 4, 6, 0, 7, 0};
		System.out.println("Input: "+Arrays.toString(a));
		String s = "";
		for (int i : a) 
		{
			if (i == 0)
				s = i + "," + s;
			else
				s = s + i + ",";
		}
		System.out.print("Output: ");
		for (String i : s.split(","))
			System.out.print(i+" ");
	}
}