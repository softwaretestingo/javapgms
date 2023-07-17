package com.softwaretestingo.interviewprograms;
public class InterviewPrograms40 
{
	/*
	 * Input string : Aut@oma#tion@# 
	 * Output: Aut@oma#tion.. 
	 * Input maybe any string, but only the last alphanumeric character should be removed
	 */
	public static void main(String[] args) 
	{
		String s = "Aut@oma#tion@#";
		String [ ] newstring = s.split("");
		int count = 0 ;
		String last = "";
		for ( int i = s.length()-1; i>=0;i--)
		{
			if (!newstring[i].matches("[a-zA-Z]"))
			{
				count++;
				last=last+".";
			}
			else
			{
				break;
			}
		}
		System.out.print(s.substring(0, s.length()-count)+last);	
	}
}