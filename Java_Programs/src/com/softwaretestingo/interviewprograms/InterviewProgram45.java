package com.softwaretestingo.interviewprograms;
import java.util.HashMap;
public class InterviewProgram45 
{
	/*
	 * Input INDIA 
	 * Output INDIIA
	 */
	public static void main(String[] args) 
	{
		findDuplicate("INDIA");
	}
	public static void findDuplicate(String str)
	{
		String newStr = "";
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			if(hm.containsKey(str.charAt(i)))
			{

				newStr = newStr+str.charAt(i)+str.charAt(i);
			}
			else
			{
				newStr = newStr+str.charAt(i);
				hm.put(str.charAt(i),1);
			}
		}
		System.out.println(newStr);
	}
}
