package com.softwaretestingo.interviewprograms;
public class InterviewPrograms44 
{
	/*
	 * input: "HELLO WORLD" 
	 * Output: "HExxxO WORxxxD"
	 */
	public static void main(String[] args) 
	{
		String s="HELLO WORLD";
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
		System.out.println(z);
	}
}
