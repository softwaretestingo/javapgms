package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0075_0_InterviewPrograms 
{
	public static void main(String[] args) 
	{
		String s ="Mono1j2";
		char ch[]=s.toCharArray();

		StringBuilder sb = new StringBuilder();
		for(char ch1: ch)
		{
			if(Character.isDigit(ch1))
			{
				sb.append(ch1);
			}
		}
		System.out.println(sb);
	}
}
//Output- 12