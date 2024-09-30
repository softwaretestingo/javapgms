package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
public class STO0056_0_SwitchCaseOfCharacters 
{
	public static void main(String[] args) 
	{
		String s="Automation Testing";
		System.out.println("Input: "+s);
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
		System.out.println("Output: " + sb);
	}
}