package com.softwaretestingo.string;
public class InterviewStringProgram2 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Print All Possible SubStrings
	 * 
	 */
	public static void SubString(String str, int n)
	{
		for (int i = 0; i < n; i++)
			for (int j = i+1; j <= n; j++)
				System.out.println(str.substring(i, j));
	}

	public static void main(String[] args)
	{
		String str = "xyz";
		SubString(str, str.length());
	}
}