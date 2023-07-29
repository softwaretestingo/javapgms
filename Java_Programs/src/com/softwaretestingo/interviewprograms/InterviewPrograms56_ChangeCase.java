package com.softwaretestingo.interviewprograms;
public class InterviewPrograms56_ChangeCase 
{
	public static void main(String[] args) 
	{
		String s="Automation Testing";
		char[] ch=s.toCharArray();

		StringBuffer sb= new StringBuffer(s);

		for (int i = 0; i < ch.length; i++) 
		{

			if(Character.isLowerCase(s.charAt(i)))
			{
				sb.setCharAt(i, Character.toUpperCase(s.charAt(i)));
			}
			else if(Character.isUpperCase(s.charAt(i)))
			{
				sb.setCharAt(i, Character.toLowerCase(s.charAt(i)));
			}
		}
		System.out.println("String after case conversion : " + sb);
	}
}