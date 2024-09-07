package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0044_0_InterviewPrograms 
{
	/*
	 * input: "HELLO WORLD" 
	 * Output: "HExxxO WORxxxD"
	 */
	public static void main(String[] args) 
	{
		String s="HELLO WORLD";
		System.out.println("Input: "+s);
		String z="";
		int count=1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='L') 
			{
				for(int j=0;j<count;j++) 
				{
					z=z+'x';
				}
				count++;
			}
			else 
			{
				z=z+s.charAt(i);
			}
		}
		System.out.println("Output: "+z);
	}
}
