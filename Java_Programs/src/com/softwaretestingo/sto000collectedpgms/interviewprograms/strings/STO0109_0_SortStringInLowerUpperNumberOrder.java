package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
import java.util.Arrays;
public class STO0109_0_SortStringInLowerUpperNumberOrder 
{
	public static void main(String[] args) 
	{
		String str="aBcA1bC2";
		System.out.println("Input: "+str);
		System.out.println("Output: "+ modifyString(str));
	}

	public static String modifyString(String s) 
	{
		String d = "", l = "", u = "", result = "";
		for (int i = 0; i < s.length(); i++) 
		{
			if (Character.isDigit(s.charAt(i))) 
			{
				d = d + "" + s.charAt(i);

			}
			if (Character.isLowerCase(s.charAt(i))) 
			{
				l = l + "" + s.charAt(i);
			}
			if (Character.isUpperCase(s.charAt(i))) 
			{
				u = u + "" + s.charAt(i);
			}

		}
		return result += sortString(l) + "" + sortString(u) + "" + sortString(d);

	}

	public static String sortString(String s) 
	{
		char[] temp = s.toCharArray();
		Arrays.sort(temp);
		return new String(temp);
	}
}