package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.HashMap;
public class STO0045_0_InterviewPrograms 
{
	/*
	 * Input INDIA 
	 * Output INDIIA
	 */
	public static void main(String[] args) 
	{
		String str="INDIA";
		System.out.println("Input: "+str);
		findDuplicate(str);
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
		System.out.println("Output: "+newStr);
	}
}