package com.softwaretestingo.string;
public class InterviewStringProgram1 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Print All Possible SubStrings
	 * 
	 */
	static void subString(char str[], int n)
	{
		// Pick starting point
		for (int len = 1; len <= n; len++)
		{
			// Pick ending point
			for (int i = 0; i <= n - len; i++)
			{
				//  Print characters from current starting point to current ending point.
				int j = i + len - 1;
				for (int k = i; k <= j; k++)
				{
					System.out.print(str[k]);
				}
				System.out.println();
			}
		}
	}
	// Driver program to test the above function
	public static void main(String[] args)
	{
		char str[] = {'A', 'B', 'C'};
		subString(str, str.length);
	}
}