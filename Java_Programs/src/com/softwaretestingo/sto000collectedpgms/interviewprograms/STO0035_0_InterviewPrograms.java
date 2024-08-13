package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0035_0_InterviewPrograms 
{
	/*
	 * Input - Ramakant 
	 * Output - R1a1m1a2k1a3n1t1 
	 * I have to take input string and in output will print no of occurance after each character
	 */
	public static void main(String[] args) 
	{
		String name = "Ramakant";
		String text = "";
		for (int i = 0; i < name.length(); i++) 
		{
			char[] ch = name.toCharArray();
			text = text + ch[i] + ((name.substring(0, i).length())-(name.substring(0, i).replace(String.valueOf(ch[i]),"").length())+1);
		}
		System.out.println(text);
	}
}