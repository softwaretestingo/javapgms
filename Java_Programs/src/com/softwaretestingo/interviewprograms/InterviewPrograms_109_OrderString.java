package com.softwaretestingo.interviewprograms;
import java.util.Arrays;
public class InterviewPrograms_109_OrderString 
{
	public static void main(String[] args) 
	{
		System.out.println(modifyString("aBcA1bC2"));
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