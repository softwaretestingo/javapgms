package com.softwaretestingo.sto000collectedpgms.interviewprograms;

import java.util.Arrays;

public class STO0010_0_InterviewPrograms 
{
	/*
	 * Input:{A, B, C, D} 
	 * Output:{AA, BB, CC, DD}
	 */
	public static void main(String[] args) 
	{
		char[] ch = {'A', 'B', 'C', 'D'};
		System.out.println("Input: "+Arrays.toString(ch));
		append(ch);
	}
	static void append(char ch[]) 
	{
		char[] ch1=ch.clone();
		//System.out.println(ch);
		//System.out.println(ch1);
		char[] result= new char[0];
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<ch.length;i++)
		{
			sb.append(ch[i]);
			sb.append(ch1[i]);
			sb.append(' ');
			result = sb.toString().toCharArray();
		}
		System.out.print("Output: ");
		System.out.print(result);
	}
}